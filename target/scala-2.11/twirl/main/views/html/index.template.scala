
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template5[Form[String],Form[Channel],Seq[Channel],Messages,RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(loginForm: Form[String], channelForm: Form[Channel], channels: Seq[Channel])(implicit msg: Messages, request: RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.127*/("""
"""),_display_(/*2.2*/main("Chikka Messenger")/*2.26*/ {_display_(Seq[Any](format.raw/*2.28*/("""
  """),format.raw/*3.3*/("""<div class="row mainContainer expanded">
    """),_display_(/*4.6*/channel(channels, channelForm, 0)),format.raw/*4.39*/("""
    """),_display_(/*5.6*/if(request.session.get("username").isEmpty)/*5.49*/ {_display_(Seq[Any](format.raw/*5.51*/("""
      """),_display_(/*6.8*/login(loginForm)),format.raw/*6.24*/("""
    """)))}),format.raw/*7.6*/("""
  """),format.raw/*8.3*/("""</div>
""")))}),format.raw/*9.2*/("""
"""))
      }
    }
  }

  def render(loginForm:Form[String],channelForm:Form[Channel],channels:Seq[Channel],msg:Messages,request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(loginForm,channelForm,channels)(msg,request)

  def f:((Form[String],Form[Channel],Seq[Channel]) => (Messages,RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (loginForm,channelForm,channels) => (msg,request) => apply(loginForm,channelForm,channels)(msg,request)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Thu Jan 28 18:20:48 PHT 2016
                  SOURCE: /Volumes/Development/Projects/chatRelay/app/views/index.scala.html
                  HASH: 57f5166c4617c22f9a6a34c854287fc1dbe3d68e
                  MATRIX: 583->1|804->126|831->128|863->152|902->154|931->157|1002->203|1055->236|1086->242|1137->285|1176->287|1209->295|1245->311|1280->317|1309->320|1346->328
                  LINES: 20->1|25->1|26->2|26->2|26->2|27->3|28->4|28->4|29->5|29->5|29->5|30->6|30->6|31->7|32->8|33->9
                  -- GENERATED --
              */
          