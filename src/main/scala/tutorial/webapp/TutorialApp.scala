package tutorial.webapp

import scala.scalajs.js.JSApp
import org.scalajs.dom
import dom.document
//import js.annotation.JSExport

trait Similarity {
  def isSimilar(x: Any): Boolean
  def isNotSimilar(x: Any): Boolean = !isSimilar(x)
}

object TutorialApp extends JSApp {
  def main(): Unit = {
    //appendPar(document.body, "Hello World")

    val p1 = new Point(2, 3)
    val p2 = new Point(2, 4)
    val p3 = new Point(3, 3)

    println(p1.isNotSimilar(p2))
    println(p1.isNotSimilar(p3))
  }

  }

  class Point(xc: Int, yc: Int) extends Similarity {
    var x: Int = xc
    var y: Int = yc
    def isSimilar(obj: Any) =
      obj.isInstanceOf[Point] &&
      obj.asInstanceOf[Point].x == x
  }


//  def appendPar(targetNode: dom.Node, text: String): Unit = {
//    val parNode = document.createElement("p")
//    val textNode = document.createTextNode(text)
//    parNode.appendChild(textNode)
//    targetNode.appendChild(parNode)
//  }
