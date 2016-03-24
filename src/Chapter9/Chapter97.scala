package Chapter9
import scala.io.Source  
object Chapter97 extends App {
  
val source = Source.fromFile("file/96.txt").mkString  
source.foreach(println)
println("*************")
println()
val pattern = """[^((\d+\.){0,1}\d+)^\s+]+""".r  
//pattern.findAllIn(source).foreach(println) 
}