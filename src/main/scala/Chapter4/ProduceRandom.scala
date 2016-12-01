package Chapter4
import scala.io.Source
import java.io.PrintWriter
import java.io.File
import java.util._;
import java.text.SimpleDateFormat
//import 
object ProduceRandom {
  def main(args:Array[String]):Unit={
    val n=100000
    val m=100
     val iString=new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date() )
	   val soutput="hdfs://219.219.220.149:9000/output/"+iString;
     val w1=new PrintWriter(new File("file/input"+iString+".txt"))
//      for (i<- 0 to n-1) {
//      val uu=new Random()
//      println(uu.nextInt(10))
////      arr(i)=uu.nextInt(n);
////      println(i+":"+arr(i))
//      }
//     for(i <- 1 to 10 ) println(Rond)
     var uu=new Random()
     for(i <- 1 to n){w1.println(uu.nextInt(m))}
      println("success")
      w1.close()

  }
}