package Chapter13
import scala.math._
object test310 extends App {
  println(List(1,7,2,9).reduceLeft(_ - _))
  println(List(1,7,2,9).reduceRight(_ - _))
  println(List(1,7,2,9).foldLeft(0)(_ - _))
  println(List(1,7,2,9).foldRight(0)(_ - _))
  println(List(1,7,2,9).scanLeft(0)(_ - _))
  println(List(1,7,2,9).scanRight(0)(_ - _))
  
  def numsFrom(n:BigInt):Stream[BigInt]=n #:: numsFrom(n-1)
  var s1=numsFrom(10)
  println(numsFrom(10))
  println(numsFrom(10).tail)
  println(s1.take(5).force)
//  println(s1.force)
  
  val power=(0 until 100).view.map ( pow(10,_) )
  println(power)
  println(power(10))
  
   val power1=(0 until 100).map ( pow(10,_) )
  println(power1)
  println(power1(10))
  
}