package Chapter9
import scala.io.Source
import scala.util.matching.Regex
object Chapter931 extends App {
  var s93=Source.fromFile("file/93.txt")
  val m93="[0-9]+".r
  for(i<-s93.getLines();j<-m93.findAllIn(i) if j.toInt>13)  println(j)
  s93.close()
}