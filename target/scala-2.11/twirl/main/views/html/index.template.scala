
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,String,play.twirl.api.HtmlFormat.Appendable] {

  /*
* This template
* handles the rendering of the page header and body tags. It takes
* two arguments, a `String` for the title of the page and an `String`
* for the characters.
*/
  def apply/*7.2*/(title: String, characters: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.37*/("""

"""),format.raw/*9.1*/("""<!DOCTYPE html>
<html lang="en">
<head>
 """),format.raw/*12.55*/("""
 """),format.raw/*13.2*/("""<title>"""),_display_(/*13.10*/title),format.raw/*13.15*/("""</title>
 <link rel="stylesheet" media="screen" href=""""),_display_(/*14.47*/routes/*14.53*/.Assets.versioned("stylesheets/main.css")),format.raw/*14.94*/("""">
 <script src=""""),_display_(/*15.16*/routes/*15.22*/.Assets.versioned("javascripts/jquery-3.1.1.min.js")),format.raw/*15.74*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*16.23*/routes/*16.29*/.Assets.versioned("javascripts/script.js")),format.raw/*16.71*/("""" type="text/javascript"></script>
</head>
<body>
 <!-- Container -->
 <div class="container">

  <!-- Header game-->
  <h1>Word Scramble Game</h1>

  <hr>

  <!-- The characters -->
  <label>Characters of the word: </label>
  <h3 id = "characters">"""),_display_(/*29.26*/characters),format.raw/*29.36*/("""</h3>

  <!-- The word user typed -->
  <label>The word you typed: </label>
  <h3 id = "input"></h3>
  <hr>
  <!-- bloc result -->
  <div class="result">
   <label>RESULT</label>
   <!-- result message -->
   <h1 id="result"></h1>
  </div>
 </div>
</body>
</html>
"""))
      }
    }
  }

  def render(title:String,characters:String): play.twirl.api.HtmlFormat.Appendable = apply(title,characters)

  def f:((String,String) => play.twirl.api.HtmlFormat.Appendable) = (title,characters) => apply(title,characters)

  def ref: this.type = this

}


}

/*
* This template
* handles the rendering of the page header and body tags. It takes
* two arguments, a `String` for the title of the page and an `String`
* for the characters.
*/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Tue Oct 18 00:25:00 ICT 2016
                  SOURCE: E:/New folder/Word-Scramble-Game/app/views/index.scala.html
                  HASH: 2b489e78785d0ea1e028d215198f3901c0dc5947
                  MATRIX: 928->182|1058->217|1086->219|1155->313|1184->315|1219->323|1245->328|1327->383|1342->389|1404->430|1449->448|1464->454|1537->506|1621->563|1636->569|1699->611|1976->861|2007->871
                  LINES: 32->7|37->7|39->9|42->12|43->13|43->13|43->13|44->14|44->14|44->14|45->15|45->15|45->15|46->16|46->16|46->16|59->29|59->29
                  -- GENERATED --
              */
          