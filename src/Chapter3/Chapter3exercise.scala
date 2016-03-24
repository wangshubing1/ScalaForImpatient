package Chapter3
//import scala.math.random
import scala.util.Random
object Chapter3exercise {
  def Randomn(n:Int)={
    var arr=new Array[Int](n)
    
    for (i<- 0 to n-1) {
      val uu=new Random()
      arr(i)=uu.nextInt(n);
      println(i+":"+arr(i))}
  }
  
  //2
   def zhihuan(a:Array[Int]){
     var tmp=0;
     for (i <- 0 to (a.length/2) -1) {
         tmp=a(2*i)
         a(2*i)=a(2*i+1)
         a(2*i+1)=tmp
     }
     for(j<-0 to a.length-1) print(a(j)+" ")
   }
//   def zhihuan2(a:Array[Int]){
//     var tmp=0;
//     for (i <- 0 to (a.length/2) -1) {
//         tmp=a(2*i)
//         a(2*i)=a(2*i+1)
//         a(2*i+1)=tmp
//     }
//     for(j<-0 to a.length-1) print(a(j)+" ")
//   }
   
def zhihuan2(a:Array[Int])={
     for(j <-0 to (a.length-1)) yield {
       if(j%2==0){
        val  tmp=a(j);
         a(j)=j+1; 
         a(j+1)=tmp;
         } 
       a(j);
    }
    }
     //4
import scala.collection.mutable.ArrayBuffer
   def hanshu4(a:Array[Int])={
      var arr=new ArrayBuffer[Int]()
//      for(j <- arr) println("test:"+arr(j)+" ")
      arr ++= a.filter{ _ >0}
      arr ++= a.filter( _ <=0)
//      for(j <- arr) println("test:"+arr(j)+" ")
      arr
   }
   def main(args:Array[String]){
     val a = BigInt.probablePrime(5,Random)
     val b =scala.math.random
     println("a:"+a)
     println("b:"+b)
     //1
     Randomn(10)
     //2
     println(7/2)
     var arr=Array(1,2,3,4,5,6,7,8,9,10)
     zhihuan(arr)
     println()
     for(j<-0 to arr.length-1) print(arr(j)+" ")
     
     //3
//     var tmp=0;
     println("\nzhihuan2:")
      var s=zhihuan2(arr)
     for(i<-arr) print(i+" ")
     println()
      for(i<-s) print(i+" ")
      
      //4
      println("\nhanshu4:")
      var arr4=Array(1,2,3,4,-5,6,0,8,-9,10)
      var a44=hanshu4(arr4)
      for(j <- 0 to 9) println(j+":"+a44(j)+" ")
      println("\na44:")
      for(j <- 0 to a44.length-1) println(j+":"+a44(j)+" ")
      
      //5
      def hanshu5(a:Array[Double])={
        var sum1=0.0
//        a.sum
        for (i<-0 to a.length-1) sum1 = sum1 + a(i)
        sum1/a.length
      }
      var arr5=Array(1.4,2.1,3.4,4.5,-5.6,6.8,0.1,8.5,-9.1,10.123123)
      println(hanshu5(arr5))
      
      //6
      def hanshu6(a:Array[Int])={
        var tmp=0
        for(i<- 0 to (a.length)/2) {tmp=a(i);a(i)=a(a.length-1-i);a(a.length-1-i)=tmp;}
        a
      }
      var arr6=Array(1,2,3,4,-5,6,0,8,-9,10)
      println("\narr6:")
      for(j <- 0 to arr6.length-1) print(":"+arr6(j)+" ")
      var h6=hanshu6(arr6)
      println("\nh6:")
      for(j <- 0 to h6.length-1) print(":"+h6(j)+" ")
      println("\narr6BeforeReverse:")
      for(j <- 0 to arr6.length-1) print(":"+arr6(j)+" ")
      println("\narrayReverse:")
      for(i <-0 to arr6.reverse.length-1) print(":"+arr6.reverse(i)+" ")
      //62
      def hanshu62(a:ArrayBuffer[Int])={
        var tmp=0
        for(i<- 0 to (a.length)/2) {tmp=a(i);a(i)=a(a.length-1-i);a(a.length-1-i)=tmp;}
        a
      }
      var arr62=new ArrayBuffer[Int]()
      arr62.insert(arr62.length,1,2,3,4,5,6,7,8,9,10)
      println("\narr6:")
      for(j <- 0 to arr62.length-1) print(":"+arr62(j)+" ")
      var h62=hanshu62(arr62)
      println("\nh62:")
      for(j <- 0 to h62.length-1) print(":"+h62(j)+" ")
      
      //62(2)
      var arr621=ArrayBuffer(1,2,3,41,2,3,4,5,6,7,8,9,10)
//       var arr622=new ArrayBuffer[Int]()
//      arr622.insert(arr622.length,1,2,3,4,5,6,7,8,9,10)
      var arr622=arr621.reverse
      println()
      arr621.foreach { println }
      println("reverse")
      arr622.foreach { println }
      
      //7
      var arr7=Array(10,2,3,4,-5,6,0,3,-9,10)
      for(i<- 0 to arr7.distinct.length-1) print(arr7.distinct(i)+" ")
      
      //8
    def deleteUnFirstF(arr : Array[Int]) = {
    val indexes = (for (i <- 0 until arr.length if arr(i) < 0) yield i)
    val rights  = indexes.reverse.dropRight(1)
    val tmp = arr.toBuffer
    for (index <- rights) tmp.remove(index)
    tmp 
  }
       
    val b1 = Array(1, -2, 0, -3, 0, 4, 5);
    val c = deleteUnFirstF(b1)
    println("\n8:")
    c.foreach(println)
    
    //9
    
    import java.util.TimeZone.getAvailableIDs
    def timeZoneName() = {
    val arr = java.util.TimeZone.getAvailableIDs();
    val tmp = (for (i <- arr if i.startsWith("America/")) yield {
      i.drop("America/".length)
    })
    scala.util.Sorting.quickSort(tmp)
    tmp
  }
    var c9 = timeZoneName()
    c9.foreach(println)
    var a9=getAvailableIDs()
    println("***************")
    for(i9 <- a9 if i9.startsWith("America/")) println(i9.drop("America/".length()))
//    println(i9.count)
    
    //10
    println("10:")
    import java.awt.datatransfer._
    import scala.collection.mutable.Buffer
    import scala.collection.JavaConversions.asScalaBuffer
     val flavors = SystemFlavorMap.getDefaultFlavorMap().asInstanceOf[SystemFlavorMap]
     val buf : Buffer[String] = flavors.getNativesForFlavor(DataFlavor.imageFlavor);
     buf.foreach(println);
}
}