package Chapter13
import scala.collection.mutable.Map
import scala.collection.mutable.HashMap
import scala.collection.mutable.SortedSet
object Chapter13Exercise extends App {
  def indexes(arg:String):Map[Char,SortedSet[Int]]={
//    arg.map { x => ??? }
    var map1=new HashMap[Char,SortedSet[Int]]()
    var i=0
    arg.foreach {
      c => 
       map1.get(c) match{
         case Some(result)=>map1(c)=result+i
         case none =>map1 +=c->SortedSet{i}
       }
       i+=1
      }
    map1
  }
  
  println(indexes("Mississippi"))
  
}