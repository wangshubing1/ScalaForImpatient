package Chapter1
import scala.math._
object numberString {
  def main(args:Array[String]){
//    val xmax,ymax=100
//    print("xmax:"+xmax)
//    println()
//    print("ymax:"+ymax)
//    println()
////    println(1.to(100))
////    for(i <- 1 to 10) println(i)
//    println("dHelloW".intersect("World"))
//    
//    val x:BigInt=1234567890
//    println(x*x*x)
//    
//    println(sqrt(2))
//    println(pow(2,4))
//    println(min(3,Pi))
//    println(max(3,Pi))
//    println(Pi)
//    
//    println(BigInt.probablePrime(100, scala.util.Random))
//    println(BigInt.probablePrime(2, scala.util.Random))
//    
//    println("HelloScala".distinct)
    
    
    //apply
    var str="Hello"
    val l=str.length()
    for(i<- 0 to str.length()-1){
//    println("Hello"(i))
//      println(str(i))
      println("Hello".apply(i))
  }
  
  println(BigInt("1234567890"))
  println(BigInt("1234567890")*BigInt("1234567890"))
  for(i <-Array(1,2,4,8))  println(i)
  println("count:")
  println("HelloA".count(_.isUpper))
  
  println("Harry".patch(1, "xubo", 0))
  
//  3.
}
}