package Chapter10

object test102 extends App with Logger {
  def log(msg:String){println(msg)}
  var a1:Array[Double]=Array(1,2,4,3,10,6)
  println(IMax(a1))
}