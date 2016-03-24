package Chapter4

object test4 {
  def main(arg:Array[String]){
    println("hello test4")
    var scores=Map("Alice"->10,"Bob"->3,"Cindy"->4)
//    var map2= Map[String,Int]()
//    map2+=("Bob"->3)
    
    for((i,j)<-scores) print(i+"->"+j+" ")
    println()
    println(scores("Alice"))
    val scores2=Map(("Alice",10),("Bob",3),("Cindy",4))
//    scores("Alice")=11
    var s2=scala.collection.mutable.Map("Alice"->10,"Bob"->3,"Cindy"->4,"Hello"->1,"Scala"->2)
    for((i,j)<-s2) print(i+"->"+j+" ")
    println()
//    println(s2.)
    s2("Alice")=11 
    println(s2.getOrElse("Alice", 0))
    println(s2.contains("Bob"))
    println(s2.getOrElse("Bob", 0))
    
     for((i,j)<-s2) print(i+"->"+j+" ")
    s2 +=(("x",1),("y",2))
    s2 -="Alice"
    println()
     for((i,j)<-s2) print(i+"->"+j+" ")
//    s2.foreach(println())
     s2.keySet.foreach { println}
//    s2.keySet
    val s4=scala.collection.immutable.SortedMap("Alice"->10,"Bob"->3,"Cindy"->4,"Hello"->1,"Scala"->2)
    s4.foreach(println)
    import scala.collection.JavaConversions.mapAsScalaMap
    val scores4:scala.collection.mutable.Map[String, Int]=new java.util.TreeMap[String, Int]
    
    scores4.foreach(println)
    
  }
}