package Chapter13

//object Chapter134 extends App {
//  
//}
import scala.collection.mutable.Map
import scala.collection.mutable.HashMap
import scala.collection.mutable.ListBuffer
object Chapter134 extends App {
    def indexes(a1:Array[String],m1:Map[String,Int]):Array[Int]={
//      var s1:Array[Int]=(for(i:String<-a1) yield { if(!(m1.get(i).isEmpty)) m1(i).toInt}).flatMap
        a1.flatMap { m1.get(_) }

    }
    
   indexes(Array("Tom","Fred","Harry"),Map("Tom"->3,"Dick"->4,"Harry"->5)).foreach(println)

}