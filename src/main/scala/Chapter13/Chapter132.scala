package Chapter13
import scala.collection.mutable.Map
import scala.collection.mutable.HashMap
import scala.collection.mutable.ListBuffer
object Chapter132 extends App {
    def indexes(arg:String):Map[Char,ListBuffer[Int]]={
//    arg.map { x => ??? }
    var map1=new HashMap[Char,ListBuffer[Int]]()
    var i=0
    arg.foreach {
      c => 
       map1.get(c) match{
         case Some(result)=>map1(c)+=i
      
         case none =>map1 +=c->ListBuffer{i}
       }
       i+=1
      }
    map1
  }
  
  println(indexes("Mississippi"))
  
}