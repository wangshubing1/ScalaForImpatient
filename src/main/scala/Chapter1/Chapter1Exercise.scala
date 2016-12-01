package Chapter1
import scala.math._;
import scala.math.BigInt._;
import scala.util.Random;

object Chapter1Exercise {
  def main(args:Array[String]){
    //1
    println(3.!=(2))
    println(34.toHexString)
   //2
    println(3-pow(sqrt(3),2))
   //3
//    scala> res1=3
// error: reassignment to val
//       res1=3
    //4
//    scala> "crazy"*3
//res3: String = crazycrazycrazy
 println("crazy"*3)
  //5
 println(10 max 2)
 //6
    println(BigInt(2).pow(1024))
 //7
    println(probablePrime(3,Random))
 //8
    var i36=scala.math.BigInt(scala.util.Random.nextInt)
    println(i36)
    println(i36.toString(36))
    //scala.math.BigInt(scala.util.Random.nextInt).toString(36)
    
    //9
    var s="hello"
    println(s(0))
    println(s(s.length()-1))
    println(s.take(1))
    println(s.reverse(0))
    println(s.takeRight(1))
    //10
    println("----10------")
    println(s.take(1))
    println(s.take(3))
    println(s.takeRight(1))
    println(s.takeRight(3))
    println(s.drop(2))
    println(s.dropRight(2))
    println(s.substring(1))
    println(s.substring(2))
    println(s.substring(2, 4))
    println(s.substring(0, 4))
//    s.substring(beginIndex, endIndex)
    
  }
}