package Chapter3
import scala.collection.mutable.ArrayBuffer
import scala.util.Sorting._
object ArrayTest {
   def main(args:Array[String]){
     val b=ArrayBuffer[Int]()
     b+=1
     
     b+=(1,2,3,4,5)
     b++=Array(5,8,13)
     b.trimEnd(5)
     b.insert(2,11)
      b.insert(2,11,12,13)
       b.remove(2)
        b.remove(2,2)
        val a = b.toArray
//        b.to
     for(i<- b) println(i)
     println("end")
     println(a)
      for(i<- a) println(i)
     println("end")
//     b.drop(b.length)
     print("e0:")
     var e0=for(elem<-b if elem%2==0) yield 2*elem
     for(i<-e0) print(i+" ")
     
      print("\ne1:")
      var e1=b.filter(_%3==0).map(2*_)
      for(i<-e1) print(i+" ")
      
      print("\ne2:")
      var e2=b.filter(_%3!=0).map(2*_)
      for(i<-e2) print(i+" ")
      
      print("\ne3:")
      var e3=b.filter{_<3}.map{2*_}
      for(i<-e3) print(i+" ")
      
       print("\nb:")
//       var e4=b.filter{_<3}.map{2*_}
      for(i<-b) print(i+" ")
      
      print("\nbSorted:")
      for(i<-b.sorted) print(i+" ")
      
      print("\nbSortWith:")
      for(i<-b.sortWith { _ >_ }) print(i+" ")
      
      print("\nbQuickSort:")
      
      val a1 =Array(1,7,2,9)
      quickSort(a1)
      for(i<- a1 ) print(i+" ")
      
      val m1=Array.ofDim[Double](3,4)
      for(i<- 0 to 2;j <- 0 to 3) println(i+"-"+j+":"+m1(i)(j))
//      println(m1(1)(1))
      
   }
}