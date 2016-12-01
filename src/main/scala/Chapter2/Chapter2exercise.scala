package Chapter2
import scala.math._
object Chapter2exercise {
  
  def signnum(x:Int)=if(x>0) 1 else if(x==0) 0 else -1
  def main(args:Array[String]){
  //1
    for(i<- -2 to 2)   println(i+":"+signnum(i)) 
  println(BigInt(10).signum)
  //2
    println({})
    
//scala> val t ={}
//t: Unit = ()
  //3
//    var x={}
    var x:Unit=()
    var y=0
    x=y=1
    println(x+"--"+y)
//    //4
//   for(i <- 0 to 10 reverse) println(i)
////  for(i <- 10 to 0) println(i)
//   //5
//   def countdown(n:Int){for(i <- 0 to n reverse) println(i)}
//   countdown(5)
   //6
//   def SumUnicode(s:String)={var i=0 ;for(i<-s.toIterable.toL){println(i)}; i }
    def SumUnicode(s:String)={var sum:Long=1 ;for(i<-s){sum=sum*i.toLong}; sum }
    println(SumUnicode("Hello"))
    //7
//    println("Hello".sum)
    var t:Long=1
    "Hello".foreach { t *= _.toLong }
    println(t)
    //8
    def Product(x:String)={var t:Long=1;x.foreach { t *= _.toLong };t}
    println(Product("Hello"))
    //9
//    def Product(x:String)={var t:Long=1;x.foreach { t *= _.toLong };t}
//   var t1:Long=1
     def fac(x1:String):Long=if(x1.length()==1) x1.charAt(0).toLong else x1.take(1).charAt(0).toLong*(fac(x1.drop(1)))
     println(fac("Hello"))
     //10
     def fxn(x:Double,n:Double):Double={
       
       if(n>0) { if(n%2==0) fxn(x,n/2)*fxn(x,n/2) else x*fxn(x,n-1) } else if(n< 0) 1/fxn(x,-n) else  1
     }
    println(fxn(2,5))
    println(fxn(2,10))
    println(fxn(2,0))
    println(fxn(2,-5))
    
  }
  

}