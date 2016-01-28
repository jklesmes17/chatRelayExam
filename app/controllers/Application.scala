package controllers

import javax.inject.Inject
import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

import play.api._
import play.api.mvc._
import play.api.i18n._

import models._
import models.dao._
import models.formHelperDeclaration._

class Application @Inject() (
  val messagesApi: MessagesApi,
  val channels: Channels,
  val logs: Logs
) extends Controller with I18nSupport {

  /** Index Views */
  def index = Action.async { implicit request =>
    channels.getChannels map ( channelList =>
      Ok(views.html.index(FormDeclaration.loginForm, FormDeclaration.channelForm, channelList)))
  }
  /** Login Authentication */
  def loginSubmit = Action { implicit request =>
    FormDeclaration.loginForm.bindFromRequest.fold (
      formWithErrors => Redirect(routes.Application.index),
      login => Redirect(routes.Application.index).withSession("username" -> login))
  }
  /** Channel Room View */
  def channelRoom(cId: Int) = Action.async { implicit request =>
    for {
      channel <- channels.getChannels
      logList <- logs.getById(cId)
    } yield {
      Ok(views.html.channelRoom(FormDeclaration.loginForm, channel, logList, FormDeclaration.logForm, FormDeclaration.channelForm, cId))
    }
  }
  /** Submitting New Post or Message */
  def postSubmit(cId: Int) = Action.async { implicit request =>
    FormDeclaration.postForm.bindFromRequest.fold (
      formWithErrors => Future.successful(Redirect(routes.Application.channelRoom(cId))),
      post => logs.insert(post) map ({
        case true => Redirect(routes.Application.channelRoom(cId))
        case false => InternalServerError("Not Okay")
      }))
  }
  /** Submitting New Channel */
  def channelSubmit = Action.async { implicit request =>
    FormDeclaration.channelForm.bindFromRequest.fold (
      formWithErrors => Future.successful(Redirect(routes.Application.index)),
      channel => channels.insert(channel) map ( id =>
        Redirect(routes.Application.channelRoom(id))))
  }
  /** Logout Authentication */
  def logout = Action { implicit request =>
    Redirect(routes.Application.index).withNewSession
  }
}
