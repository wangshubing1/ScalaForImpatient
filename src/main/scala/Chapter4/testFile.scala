package Chapter4
import scala.io.Source
import java.io.PrintWriter
import java.io.File
/**
 * @author xubo601450868
 */
object testFile {
  def main(args:Array[String]):Unit={
////        println("sda")
//    val f1 = Source.fromFile("file/1.txt")
//    var line=""
//    for(line <- f1.getLines)    println(line)
//    f1.close()
//    
    //URL
    val f2 = Source.fromURL("http://spark.apache.org/")
//    f2.foreach(print(_))
//    f2.getLines()
    println(f2.descr+"end")
    f2.close
    
//    NEW File
//    val w1=new PrintWriter(new File("input.txt"))
//    for(i <- 1 to 1000){w1.println(i)}
//      println("success")
//      w1.close()
    
    //console
//    val w2=new PrintWriter(new File("input.txt"))
//    val l1=Console.readLine()
//    println("test:"+l1)
//   
//    w2.println(l1)
//    w2.close()

    

  }
}