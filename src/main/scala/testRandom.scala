
import scala.math.random
import scala.util.Random
object testRandom extends App {
  var a:Int=(random*10).toInt
  println(a)
  for(i<-0 to 1000) if(i%60==0) println() else print((random*10).toInt+" ")
   println((for(i<-0 to 1000)  yield (random*10).toInt).max)
   println((for(i<-0 to 1000)  yield (random*10)).max)
   println(new Random().nextInt(10))
   for(i<-0 to 100) if(i%60==0) println() else print(new Random().nextInt(10)+" ")
   println()
   println((for(i<-0 to 1000)  yield (new Random().nextInt(10))).max)
   for(i<-0 to 100) if(i%60==0) println() else print(new Random().nextDouble()+" ")
     for(i<-0 to 100) if(i%60==0) println() else print(new Random().nextString(5)+"|")
     for(i<-0 to 100) if(i%60==0) println() else print(new Random().nextPrintableChar()+" ")
     for(i<-0 to 100) if(i%60==0) println() else print(new Random().nextGaussian()+" ")
}