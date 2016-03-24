package Chapter1
import scala.math._
import scala.util.Random
object RandomTest {
  def main(args1:Array[String]){
    for (i<-1 to 10){
      println(BigInt.probablePrime(5, scala.util.Random))
//      BigInt.probablePrime(5,scala.util.Random)
    }
    
  }
}