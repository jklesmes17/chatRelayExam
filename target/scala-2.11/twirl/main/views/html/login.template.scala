
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object login_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class login extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[Form[String],Messages,RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(loginForm: Form[String])(implicit msg: Messages, request: RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*1.75*/("""
"""),format.raw/*3.1*/("""
"""),format.raw/*4.1*/("""<div class="large-9 columns expanded login">
  <div class="formLogin">
    """),_display_(/*6.6*/form(action = routes.Application.loginSubmit)/*6.51*/ {_display_(Seq[Any](format.raw/*6.53*/("""
      """),_display_(/*7.8*/inputText(loginForm("username"), '_showConstraints -> false)),format.raw/*7.68*/("""
      """),format.raw/*8.7*/("""<input type="submit" class="button expanded" name="login" value="Login"> """)))}),format.raw/*8.81*/("""
  """),format.raw/*9.3*/("""</div>
</div>
"""))
      }
    }
  }

  def render(loginForm:Form[String],msg:Messages,request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(loginForm)(msg,request)

  def f:((Form[String]) => (Messages,RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (loginForm) => (msg,request) => apply(loginForm)(msg,request)

  def ref: this.type = this

}


}

/**/
object login extends login_Scope0.login
              /*
                  -- GENERATED --
                  DATE: Thu Jan 28 17:56:53 PHT 2016
                  SOURCE: /Volumes/Development/Projects/chatRelay/app/views/login.scala.html
                  HASH: 7706ccb987e4932d21cc86c79fcc3f6bc5ab7de9
                  MATRIX: 556->1|739->74|766->92|793->93|894->169|947->214|986->216|1019->224|1099->284|1132->291|1236->365|1265->368
                  LINES: 20->1|25->1|26->3|27->4|29->6|29->6|29->6|30->7|30->7|31->8|31->8|32->9
                  -- GENERATED --
              */
          