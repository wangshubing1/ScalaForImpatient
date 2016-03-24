package Chapter13

object Chapter135 extends App {
  def LikemkString(ar1:Array[String],s1:String)={
     ar1.reduceLeft(_+s1+ _)
     
  }
  Array("A","b").mkString("<").foreach { print}
  println()
  LikemkString(Array("A","b","c"),"<").foreach { print}
//  Array("A","b","c").
}