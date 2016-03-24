package Chapter12
import scala.math.ceil
object test12 extends App {
  val a1=(x:Int) => x+1
  println(a1(1))
  var l1 =List(1,2,3,4)
  l1.foreach { x => println(x+"--")}
  def a3(x1:Int,x2:Int,x3:Int)=x1+x2+x3
  var a4=a3(3,_:Int,_:Int)
  println(a4(0,10))
  
  (1 to 9 ).foreach(print)
  println()
  println((1 to 9 ).reduceLeft( _ * _))
  println((1 to 9 ).reduceRight( _ * _))
  var ar1="Mary a bb ccc da lamb ab ba".split(" ").sortWith(_.length >_.length)
  println(ar1.length)
  for(i<-0 until ar1.length) println(ar1(i))
  
  def mul(x:Int)=(y:Int)=>{x*y;print("y"+y+"x"+x)}
  var m1=mul(6)
  m1(9)
//  println(m1(9))
  println()
 println( Array(1,2,3,4,5).map(x=>x*3).reduce(_ + _))
 var c1=ceil _
 var num=3.14
 println(c1(num))
}