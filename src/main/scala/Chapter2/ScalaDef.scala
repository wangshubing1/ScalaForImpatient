package Chapter2

object ScalaDef {
  def yield2(x:Int)=if (x>0){for (i <- 1 to x) yield i}
  
  
  def xChen(x:Int)=if(x>0) {var s=1;for (ii <- 1 to x) s = s*ii;s }
  def xJia(x:Int)=if(x>0) {var sum=0;for (ii <- 1 to x) sum = sum+ii;sum }
  def fac(x:Int):Int=if(x<=0) 1 else x*fac(x-1)
  def decorate(str:String,left:String="[",right:String="]")=left+str+right
  def sum1(x:Int*)={var result=0;for (arg<-x) result+=arg;result}
  def main(args:Array[String]){
    println(yield2(5))
    println(xChen(5))
    println(xJia(5))
    println(fac(5))
    println(fac(10))
//    Date
    println( decorate("hello"))
    println( decorate("hello","<",">"))
    println(sum1(1,2,3,4,5,6))
    println( 1 to 5)
//    var i <-1 to 5: _*
//    println()
    println( sum1(1 to 5 : _*))
  }
 
}