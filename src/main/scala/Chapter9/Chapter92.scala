package Chapter9
import scala.io.Source
import scala.util.matching.Regex
import java.io.PrintWriter
import java.io.File
object Chapter92 extends App {
  
 var s92= Source.fromFile("file/92.txt")
 var f92=new PrintWriter("file/f92.txt")
 val m1="""\t+""".r
 for(i<-s92.getLines())  f92.println(m1.replaceAllIn(i, " "))
// f9
 println("success")
 s92.close()
 f92.close()
}