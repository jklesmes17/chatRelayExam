
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object channel_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class channel extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template5[Seq[Channel],Form[Channel],Int,Messages,RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(channels: Seq[Channel], channelForm: Form[Channel], cId: Int)(implicit msg: Messages, request: RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*1.112*/("""
"""),format.raw/*3.1*/("""<div class="large-3 columns expanded channel" style="background-color: whitesmoke;">
    <div class="medium-12 columns expanded label">
        <h4>Chikka Messenger</h4>
    </div>
    """),_display_(/*7.6*/if(!request.session.get("username").isEmpty)/*7.50*/ {_display_(Seq[Any](format.raw/*7.52*/("""
        """),format.raw/*8.9*/("""<div class="channelAdd">
            <h4>Add Channels</h4>
            <a href=""""),_display_(/*10.23*/routes/*10.29*/.Application.logout),format.raw/*10.48*/("""">Logout</a>
            """),_display_(/*11.14*/form( action = routes.Application.channelSubmit)/*11.62*/ {_display_(Seq[Any](format.raw/*11.64*/("""
                """),_display_(/*12.18*/inputText(channelForm("name"), '_showConstraints -> false, '_label -> "Channel Name")),format.raw/*12.103*/("""
                """),_display_(/*13.18*/inputText(channelForm("desc"), '_showConstraints -> false, '_label -> "Description")),format.raw/*13.102*/("""
                """),format.raw/*14.17*/("""<input type="submit" class="button expanded" value="Submit" name="addChannel">
            """)))}),format.raw/*15.14*/("""
        """),format.raw/*16.9*/("""</div>
    """)))}),format.raw/*17.6*/("""
    """),format.raw/*18.5*/("""<div class="medium-12 columns expanded channelList">
        <div class="small-12 columns label expanded">
            <h4>Channel List</h4>
        </div>
        <ul>
        """),_display_(/*23.10*/for(channel <- channels) yield /*23.34*/{_display_(Seq[Any](format.raw/*23.35*/("""
            """),format.raw/*24.13*/("""<li><a href=""""),_display_(/*24.27*/routes/*24.33*/.Application.channelRoom(channel.id)),format.raw/*24.69*/("""" class=""""),_display_(/*24.79*/if(cId == channel.id)/*24.100*/ {_display_(Seq[Any](format.raw/*24.102*/("""channelActive""")))}),format.raw/*24.116*/("""">"""),_display_(/*24.119*/channel/*24.126*/.name.capitalize),format.raw/*24.142*/("""</a></li>
        """)))}),format.raw/*25.10*/("""
        """),format.raw/*26.9*/("""</ul>
    </div>
</div>
"""))
      }
    }
  }

  def render(channels:Seq[Channel],channelForm:Form[Channel],cId:Int,msg:Messages,request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(channels,channelForm,cId)(msg,request)

  def f:((Seq[Channel],Form[Channel],Int) => (Messages,RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (channels,channelForm,cId) => (msg,request) => apply(channels,channelForm,cId)(msg,request)

  def ref: this.type = this

}


}

/**/
object channel extends channel_Scope0.channel
              /*
                  -- GENERATED --
                  DATE: Thu Jan 28 18:03:00 PHT 2016
                  SOURCE: /Volumes/Development/Projects/chatRelay/app/views/channel.scala.html
                  HASH: bd8d89bd83260f3cea4a0644ec03073f40b265ec
                  MATRIX: 578->1|799->111|826->129|1037->315|1089->359|1128->361|1163->370|1271->451|1286->457|1326->476|1379->502|1436->550|1476->552|1521->570|1628->655|1673->673|1779->757|1824->774|1947->866|1983->875|2025->887|2057->892|2262->1070|2302->1094|2341->1095|2382->1108|2423->1122|2438->1128|2495->1164|2532->1174|2563->1195|2604->1197|2650->1211|2681->1214|2698->1221|2736->1237|2786->1256|2822->1265
                  LINES: 20->1|25->1|26->3|30->7|30->7|30->7|31->8|33->10|33->10|33->10|34->11|34->11|34->11|35->12|35->12|36->13|36->13|37->14|38->15|39->16|40->17|41->18|46->23|46->23|46->23|47->24|47->24|47->24|47->24|47->24|47->24|47->24|47->24|47->24|47->24|47->24|48->25|49->26
                  -- GENERATED --
              */
          