package Chapter12

object Chapter12Exercise extends App {
  //12.1
  def values(fun:(Int)=>Int,low:Int,high:Int)={
    for(i<-low to high) yield (i,fun(i))
  }
  var v1=values(x=>x*x,-5,5)
  println(v1)
  
  //12.2
  var a1=Array(1,2,4,7,2,4,9)
  println(a1.reduceLeft((a,b)=>if(a>b) a else b))
  
  //12.3
  def a=(x:Int)=>(1 to x).reduceLeft(_ * _)
  println(a(5))
  
  //12.4
  def b=(x:Int)=>(1 to x).foldLeft(1)(_ * _)
  println(b(5))
  def c=(x:Int)=>(1 to x).foldLeft(3)(_ * _)
  println(c(5))
  
  //12.5
  def largest(fun:(Int)=>Int,inputs:Seq[Int])={
//    (for(i<-inputs) yield fun(i)).max
      inputs.map { x => fun(x) }.max
  }
  println(largest((z=>10*z-z*z),1 to 10))
  
  //12.6
  def largest2(fun:(Int)=>Int,inputs:Seq[Int])={
//    (for(i<-inputs) yield fun(i)).max
//      inputs.map { x => fun(x) }.max
//        inputs.map { x => (x,fun(x)) }.reduce((a,b)=>{if (a._2>b._2) a else b})
        inputs.map { x => (x,fun(x)) }.reduce((a,b)=>{if (a._2>b._2) a else b})._1
  }
  println(largest2((z=>10*z-z*z),1 to 10))
  
  //12.7
  def adjustToPair(fun:(Int,Int)=>Int)(tup:(Int,Int))={
    fun(tup._1,tup._2)
  }
  
  println(adjustToPair(_ * _)(6,7))
  
  //12.8
  val z1=Array("Hello World")
  val z2=Array("hello World")
  val s1=Array("Hello","World","java")
  val s2=Array(5,5,4)
  val s3=Array(5,5,5)
  println(z1.corresponds(z2)(_.equalsIgnoreCase(_)))
  println(s1.corresponds(s2)( _.length()==_))
  println(s1.corresponds(s3)( _.length()==_))

  
  //12.9  使用了柯里化，没使用调用不了
    def fun1(f1:Array[String],f2:Array[Int])={f1.corresponds(f2)( _.length()==_)}
//   println(s1.corresponds(that)(p))
  println(fun1(s1,s3))
  
   //12.10
   def unless(condition: =>Boolean)(block: =>Unit)={
    if(!condition) block
  }
  
  var if1=10
  unless(if1==0){
    if1 -=1 ;
    println(if1)
    }
}