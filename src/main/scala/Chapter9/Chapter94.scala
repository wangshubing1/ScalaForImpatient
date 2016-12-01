package Chapter9
import scala.io.Source
import scala.util.matching.Regex
//import scala.math._
object Chapter94 extends App {
  var s94=Source.fromFile("file/94.txt")
  val m94="""([0-9]).([0-9])""".r
  var aj:Array[Double]=for(i<-s94.mkString.split("\\s++");j<-m94.findAllIn(i) )  yield j.toDouble
  aj.foreach { println }

  println("**********")
  println(aj.sum)
  println(aj.sum/aj.length)
  println(aj.max)
  println(aj.min)

  s94.close()
}