package Chapter9

import scala.io.Source
object Chapter9exercise extends App{
  val source2=Source.fromFile("file/3.txt")
//  var s1=source2.buffered
//   source2.foreach(print)
   var s2=source2.getLines().toArray.reverse
   println(s2.length)
//   println(s2)
   for(i<-0 until s2.length reverse) println(s2(i))
//  for(i<-source.getLine()) yield source.reverse
   source2.close()
   
   
}