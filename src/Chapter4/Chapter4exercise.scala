package Chapter4
import scala.io.Source
object Chapter4exercise {
  def main(arg:Array[String]){
    //1
//    var m1=scala.collection.mutable.Map("Alice"->10,"Bob"->3,"Cindy"->4,"Hello"->1,"Scala"->2)
//    m1("Bob")=5
//    m1.foreach(println)
//    var m2=for((i,j)<-m1) yield (i,0.9*j)
//    m2.foreach(println)
    
    //2
//    val f1 = Source.fromFile("file/1.txt")
//    var line=""
//    for(line <- f1.getLines)    println(line)
//        f1.close()
//    var in =new java.util.Scanner(new java.io.File("file/1.txt"))
    import scala.collection.mutable.HashMap
    val map1 = new HashMap[String,Int]
//    in.
    val source1 = Source.fromFile("file/input20160223202054949.txt").mkString 
    var tokens=source1.split("\\s+")
//    tokens.foreach { println }
    for(key<-tokens) {map1(key)=map1.getOrElse(key, 0)+1}
//    map1.foreach(println)
    
//    val map2 =  new HashMap[String,Int]
//    while(in.hasNext()) {
////      println(in.next().count { _ => 1 })
////        in.next.
//      }
    
//    in.
      //3
      var map2= Map[String,Int]()
      for(key <- tokens){  map2 += (key -> (map2.getOrElse(key,0) + 1)) }  
       println(map2.mkString(","))  
       println("\nmap2\n")
     //4
//    CountRandom
       //other method
     import scala.collection.SortedMap 
     var map4= SortedMap[String,Int]()
//     map52=scores5
      for(key<-tokens) { map4 += (key -> (map4.getOrElse(key,0) + 1))}
      map4.foreach(println)
     //5
    import scala.collection.JavaConversions.mapAsScalaMap
    var map5=new java.util.TreeMap[String,Int]()
//    map5
//    val source1 = Source.fromFile("file/input20160223202054949.txt").mkString 
//    var tokens=source1.split("\\s+")
//    tokens.foreach { println }
    for(key<-tokens) {map5(key)=map5.getOrElse(key, 0)+1}
    val scores4:scala.collection.mutable.Map[String, Int]=new java.util.TreeMap[String, Int]
//    map5.foreach(println)
    val scores5:scala.collection.mutable.Map[String, Int]=map5
//       scores5.foreach(println)

     
       //6
//       var map6=scala.collection.mutable.HashMap("Monday",")
       import scala.collection.mutable.LinkedHashMap 
       import java.util.Calendar
       val map6=new LinkedHashMap[String,Int]()
       map6 += ("Monday"->Calendar.MONDAY)
       map6 += ("Tuesday"->Calendar.TUESDAY)
       map6 += ("Wednesday"->Calendar.WEDNESDAY)
       map6 += ("Thursday"->Calendar.THURSDAY)
       map6 += ("Friday"->Calendar.FRIDAY)
       map6 += ("Saturday"->Calendar.SATURDAY)
       map6 += ("Sunday"->Calendar.SUNDAY)
       map6.foreach(println)
       println(map6.mkString(","))
       println(java.util.Calendar.MONDAY) 
       println(Calendar.DAY_OF_MONTH)
       
       //7 
       import scala.collection.JavaConversions.propertiesAsScalaMap 
       val props:scala.collection.Map[String,String]= System.getProperties() 
       val keys = props.keySet 
       val keyLengths= for( key <- keys ) yield key.length 
       val maxKeyLength= keyLengths.max 
       for(key <- keys) { 
         print(key) 
         print(" "* (maxKeyLength - key.length)) 
         print(" | ") 
         println(props(key)) 
       }  
        
//       System.getProperties()
  
       //8
       def minmax(values:Array[Int])={
            (values.min,values.max)
       }
       var arr=Array(1,2,3,4,5,6,7,8,9,10)
       println(minmax(arr))
//       println(arr.count{_ => })
  
  
      //9
       def lteqgt(values:Array[Int],v:Int)={
//            (values.min,values.max)
              var nummin=(for(imin<-values if imin<v) yield imin).length
              var numdeng=(for(imin<-values if imin==v) yield imin).length
              var nummax=(for(imin<-values if imin>v) yield imin).length
              (nummin,numdeng,nummax)
//              println(nummin)
//              println(numdeng)
//              println(nummax)
       }
//       var arr=Array(1,2,3,4,5,6,7,8,9,10)
//        lteqgt(arr,4).toString().foreach {println }
//          val (i,j,k) =lteqgt(arr,4)
          val (i,j,k)=lteqgt(arr,4)
          println(i)
          println(j)
          println(k)
          
          def  lteqgt2(values:Array[Int],v:Int)={
            (values.count(_ < v),values.count(_ == v),values.count(_ > v))
          }
          val (i2,j2,k2)=lteqgt2(arr,4)
          println(i2)
          println(j2)
          println(k2)
          
          //10
          println("Hello".zip("World"))
}

} 
//}