
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        <title>"""),_display_(/*5.17*/title),format.raw/*5.22*/("""</title>
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*6.59*/routes/*6.65*/.Assets.versioned("images/favicon.png")),format.raw/*6.104*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*7.54*/routes/*7.60*/.Assets.versioned("stylesheets/foundation.min.css")),format.raw/*7.111*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*8.54*/routes/*8.60*/.Assets.versioned("stylesheets/foundation-flex.css")),format.raw/*8.112*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*9.54*/routes/*9.60*/.Assets.versioned("stylesheets/app.css")),format.raw/*9.100*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*10.54*/routes/*10.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*10.101*/("""">

        <script src=""""),_display_(/*12.23*/routes/*12.29*/.Assets.versioned("javascripts/vendor/jquery.min.js")),format.raw/*12.82*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*13.23*/routes/*13.29*/.Assets.versioned("javascripts/vendor/what-input.min.js")),format.raw/*13.86*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*14.23*/routes/*14.29*/.Assets.versioned("javascripts/foundation.min.js")),format.raw/*14.79*/("""" type="text/javascript"></script>
        <script type="text/javascript">
          $(document).ready(function()"""),format.raw/*16.39*/("""{"""),format.raw/*16.40*/("""
            """),format.raw/*17.13*/("""$('#logs').scrollTop($('#logs')[0].scrollHeight);
          """),format.raw/*18.11*/("""}"""),format.raw/*18.12*/(""");
        </script>
    </head>
    <body>
        """),_display_(/*22.10*/content),format.raw/*22.17*/("""
    """),format.raw/*23.5*/("""</body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


}

/**/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Thu Jan 28 18:19:12 PHT 2016
                  SOURCE: /Volumes/Development/Projects/chatRelay/app/views/main.scala.html
                  HASH: 817dc2140c684ba4c26dbfe231e47e1ce6406d14
                  MATRIX: 530->1|655->31|682->32|768->92|793->97|886->164|900->170|960->209|1042->265|1056->271|1128->322|1210->378|1224->384|1297->436|1379->492|1393->498|1454->538|1537->594|1552->600|1615->641|1668->667|1683->673|1757->726|1841->783|1856->789|1934->846|2018->903|2033->909|2104->959|2245->1072|2274->1073|2315->1086|2403->1146|2432->1147|2512->1200|2540->1207|2572->1212
                  LINES: 20->1|25->1|26->2|29->5|29->5|30->6|30->6|30->6|31->7|31->7|31->7|32->8|32->8|32->8|33->9|33->9|33->9|34->10|34->10|34->10|36->12|36->12|36->12|37->13|37->13|37->13|38->14|38->14|38->14|40->16|40->16|41->17|42->18|42->18|46->22|46->22|47->23
                  -- GENERATED --
              */
          