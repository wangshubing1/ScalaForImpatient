/**
 * sorted
 */
package Chapter4

import scala.io.Source
import java.io.PrintWriter
import java.io.File
import java.util._;
import java.text.SimpleDateFormat
object CountRandom {
    def main(arg:Array[String]){
    import scala.collection.mutable.HashMap
    val map1 = new HashMap[String,Int]
    val source1 = Source.fromFile("file/input20160223202054949.txt").mkString 
    var tokens=source1.split("\\s+")
    for(key<-tokens) {map1(key)=map1.getOrElse(key, 0)+1}
    map1.foreach(println)
    
     val iString=new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date() )
     val w1=new PrintWriter(new File("file/Count"+iString+".txt"))
     var c1= (for((i,j)<-map1) yield i.toInt ).toArray
     for(i<-c1.sorted) w1.println((i,map1(i.toString())))

////      for (i<-c1)
//     w1.println(map1)
     println("success")
      w1.close()
}
}