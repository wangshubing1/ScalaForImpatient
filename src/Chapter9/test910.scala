package Chapter9
import scala.util.matching.Regex
object test910 extends App {
  val numPattern="[0-9]+".r
  println(numPattern)
  
  for (matchString<-numPattern.findAllIn("99 bottles, 98 bottles")) println(matchString)
  
  val wsnumwsPattern="""\s+[0-9]+\s+""".r
  val m1=wsnumwsPattern.findFirstIn("99 bottles, 98 botttles")
  println(m1)
  println(numPattern.findPrefixOf("99 bottles, 98 botttles"))
  println(wsnumwsPattern.findPrefixOf("99 bottles, 98 botttles"))
  println(numPattern.replaceFirstIn("99 bottles, 98 botttles", "100"))
  println(wsnumwsPattern.replaceFirstIn("99 bottles, 98 botttles", "100"))
  
  val numitemPattern="([0-9]+) ([a-z]+)".r
  println(numitemPattern.findFirstIn("99 bottles, 98 botttles a1a"))
  val numitemPattern(num,item)="99 bottles"
  println(num)
  println(item)
// 
//   val numitemPattern="""([0-9]+)(\s+)([a-z]+)""".r
  
}