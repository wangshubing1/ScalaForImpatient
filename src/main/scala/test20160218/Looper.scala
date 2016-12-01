package test20160218

object Looper {
  def looper(x:Long,y:Long):Long={
    var a=x
    var b=y
    while(a!=0){
      val temp =a
      a=b%a
      b=temp
    }
    b
  }
  def main(args:Array[String]){
    println(looper(100,300))
  }
}