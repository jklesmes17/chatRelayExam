
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object channelRoom_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class channelRoom extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template8[Form[String],Seq[Channel],Seq[Log],Form[String],Form[Channel],Int,Messages,RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(loginForm: Form[String], channels: Seq[Channel], logs: Seq[Log], logForm: Form[String], channelForm: Form[Channel], cId: Int)(implicit msg: Messages, request: RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*1.176*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Chikka Messenger")/*4.26*/ {_display_(Seq[Any](format.raw/*4.28*/("""
  """),format.raw/*5.3*/("""<div class="row mainContainer expanded">
    """),_display_(/*6.6*/channel(channels, channelForm, cId)),format.raw/*6.41*/("""
    """),_display_(/*7.6*/if(request.session.get("username").isEmpty)/*7.49*/ {_display_(Seq[Any](format.raw/*7.51*/("""
      """),_display_(/*8.8*/login(loginForm)),format.raw/*8.24*/("""
    """)))}/*9.7*/else/*9.12*/{_display_(Seq[Any](format.raw/*9.13*/("""
    """),format.raw/*10.5*/("""<div class="large-9 columns expanded logs">
      <div id="logs" class="logsMessage">
          """),_display_(/*12.12*/for(log <- logs) yield /*12.28*/ {_display_(Seq[Any](format.raw/*12.30*/("""
          """),format.raw/*13.11*/("""<div class="chatBubble">
            <div class="row expanded">
              <div class="small-2 columns">
                <img src=""""),_display_(/*16.28*/routes/*16.34*/.Assets.versioned("images/avatar.jpeg")),format.raw/*16.73*/("""">
              </div>
              <div class="small-9 columns messageDiv">
                <p>"""),_display_(/*19.21*/log/*19.24*/.message),format.raw/*19.32*/("""</p>
                <label>by: """),_display_(/*20.29*/log/*20.32*/.username.capitalize),format.raw/*20.52*/(""" """),format.raw/*20.53*/("""posted: """),_display_(/*20.62*/log/*20.65*/.posted.toString("yyyy-dd-mm H:s")),format.raw/*20.99*/("""</label>
              </div>
            </div>
          </div>
          """)))}),format.raw/*24.12*/("""
      """),format.raw/*25.7*/("""</div>
      """),_display_(/*26.8*/form( action = routes.Application.postSubmit(cId))/*26.58*/ {_display_(Seq[Any](format.raw/*26.60*/("""
        """),_display_(/*27.10*/inputText(logForm("message"), '_showConstraints -> false, 'autofocus -> "autofocus")),format.raw/*27.94*/("""
        """),format.raw/*28.9*/("""<input type="hidden" name="idChannel" value=""""),_display_(/*28.55*/cId),format.raw/*28.58*/("""">
        <input type="submit" class="button" name="test" value="Submit">
      """)))}),format.raw/*30.8*/("""
    """),format.raw/*31.5*/("""</div>
    """)))}),format.raw/*32.6*/("""
  """),format.raw/*33.3*/("""</div>
""")))}),format.raw/*34.2*/("""











"""))
      }
    }
  }

  def render(loginForm:Form[String],channels:Seq[Channel],logs:Seq[Log],logForm:Form[String],channelForm:Form[Channel],cId:Int,msg:Messages,request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(loginForm,channels,logs,logForm,channelForm,cId)(msg,request)

  def f:((Form[String],Seq[Channel],Seq[Log],Form[String],Form[Channel],Int) => (Messages,RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (loginForm,channels,logs,logForm,channelForm,cId) => (msg,request) => apply(loginForm,channels,logs,logForm,channelForm,cId)(msg,request)

  def ref: this.type = this

}


}

/**/
object channelRoom extends channelRoom_Scope0.channelRoom
              /*
                  -- GENERATED --
                  DATE: Thu Jan 28 18:20:47 PHT 2016
                  SOURCE: /Volumes/Development/Projects/chatRelay/app/views/channelRoom.scala.html
                  HASH: 9b818204872c41bf127a9722b4581b5b644ede64
                  MATRIX: 621->1|906->175|933->193|960->195|992->219|1031->221|1060->224|1131->270|1186->305|1217->311|1268->354|1307->356|1340->364|1376->380|1399->387|1411->392|1449->393|1481->398|1605->495|1637->511|1677->513|1716->524|1878->659|1893->665|1953->704|2079->803|2091->806|2120->814|2180->847|2192->850|2233->870|2262->871|2298->880|2310->883|2365->917|2473->994|2507->1001|2547->1015|2606->1065|2646->1067|2683->1077|2788->1161|2824->1170|2897->1216|2921->1219|3033->1301|3065->1306|3107->1318|3137->1321|3175->1329
                  LINES: 20->1|25->1|26->3|27->4|27->4|27->4|28->5|29->6|29->6|30->7|30->7|30->7|31->8|31->8|32->9|32->9|32->9|33->10|35->12|35->12|35->12|36->13|39->16|39->16|39->16|42->19|42->19|42->19|43->20|43->20|43->20|43->20|43->20|43->20|43->20|47->24|48->25|49->26|49->26|49->26|50->27|50->27|51->28|51->28|51->28|53->30|54->31|55->32|56->33|57->34
                  -- GENERATED --
              */
          