package Chapter4

object zipTest {
   def main(args:Array[String]):Unit={
     val s1=Array("[","-","]")
     val s2=Array(2,5,2)
     var s3= s1.zip(s2)
     s3.foreach(println)
     s2.zip(s1).foreach(println)
     for((x,y)<-s3) println(x*y)
     s3.toMap.foreach(println)
   }
}