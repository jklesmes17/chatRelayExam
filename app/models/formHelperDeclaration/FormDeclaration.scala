package models.formHelperDeclaration

import play.api._
import play.api.mvc._
import play.api.data.Form
import play.api.data.Forms._
import org.joda.time.DateTime
import com.github.tototoshi.slick.PostgresJodaSupport._

import models._

object FormDeclaration {
  val loginForm = Form( "username" -> nonEmptyText )
  val logForm = Form( "message" -> nonEmptyText )
  val channelForm = Form( mapping(
    "name" -> nonEmptyText,
    "desc" -> nonEmptyText,
    "optId" -> optional(number)
  )(Channel.apply)(Channel.unapply))
  def postForm(implicit request: RequestHeader) = Form( mapping(
    "idChannel" -> number,
    "username" -> ignored(request.session.get("username").get.toString),
    "message" -> nonEmptyText,
    "posted" -> ignored(DateTime.now),
    "optId" -> optional(number)
  )(Log.apply)(Log.unapply))
}
