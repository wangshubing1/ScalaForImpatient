package Chapter9
import scala.io.Source
import scala.util.matching.Regex
object Chapter93 extends App {
//  var s93=Source.fromFile("file/93.txt")
// println("helo")
  Source.fromFile("file/93.txt").mkString.split("\\s++").foreach( arg => if(arg.length>12)println(arg)) 
}