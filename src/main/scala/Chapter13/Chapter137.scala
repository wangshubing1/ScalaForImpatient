package Chapter13

object Chapter137 extends App {
  //13.6
  val lst=List(1,2,3,5,7,3,2)
  println((lst :\ List[Int]())(_ :: _))
  println((lst :\ List[Int]())(_ :: _).reverse)
  println((lst :\ List[Int]())((a,b) => b :+ a))
   
  println((List[Int]() /:lst )(_ :+ _))
  println((List[Int]() /:lst )((a,b) => b :: a))
 
  //13.7
  val prices=List(5.0,20.0,9.95)
  val quantities=List(10,2,1)
  println((prices zip quantities).map(p=>p._1*p._2))
  println((prices zip quantities).map(Function.tupled(_*_)))
  
  //13.8
  def splitArray(ar1:Array[Double],length:Int)={
    ar1.grouped(length).toArray
  }
  println(splitArray(Array(1,2,3,4,5,6),3))
  splitArray(Array(1,2,3,4,5,6),3).foreach { a => println(a.mkString(",") )}
  
   //13.9  并发修改集合不安全
  
   //13.10
   import scala.collection.immutable.HashMap
   var str="abcabcac"
   val frequencies=str.par.aggregate(HashMap[Char,Int]())(
       {(a,b)=>a+(b->(a.getOrElse(b,0)+1))},{
         (map1,map2)=>(map1.keySet++map2.keySet).foldLeft(HashMap[Char,Int]()){
           (result,k)=>result+(k->(map1.getOrElse(k, 0)+map2.getOrElse(k, 0)))
               }
       }
       )
       println(frequencies)
   }
  
//}