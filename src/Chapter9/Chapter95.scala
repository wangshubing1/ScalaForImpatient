package Chapter9
import java.io.PrintWriter
import scala.math._
object Chapter95 extends App {
  val f95=new PrintWriter("file/95.txt")
  for(i<-0 to 20) {
    f95.println(pow(2,i)+" "*(15-pow(2,i).toString().length())+1/pow(2,i))
  }
  println("success")
  f95.close()
}