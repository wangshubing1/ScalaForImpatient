package Chapter9
//不太懂题意？？
import scala.io.Source
import scala.util.matching.Regex
object Chapter96 extends App {
  val s96=Source.fromFile("file/96.txt")
  val p96="\\w+\\s+\"".r
  for(i<-p96.findAllIn(s96.mkString)) println(i)
}