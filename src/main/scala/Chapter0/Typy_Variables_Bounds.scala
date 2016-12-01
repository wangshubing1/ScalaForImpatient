package Chapter0
class Pair[T <: Comparable[T]](val first : T,val second : T){
  def bigger = if(first.compareTo(second) > 0)first else second  
}

class Pair_Lower_Bound[T](val first:T,val second:T){
  def replaceFirst[R >: T](newFirst:R)= new Pair_Lower_Bound[R](newFirst,second)
//  def printcomparable={println(Int >: Double)}
}

class Pair1[A<:Comparable[A]] (val first:A,val second:A){
   def bigger = if(first.compareTo(second) > 0)first else second  
}

object Typy_Variables_Bounds {
  def main(args: Array[String]){
    val pair = new Pair("Spark", "Hadoop") 
    println(pair.bigger)
//    new Pair(1.3,1.1)
    var a1=new Pair_Lower_Bound(1:Int,2:Int)
    println(a1)
    println(a1.first)
    println(a1.second)
    println(a1.replaceFirst(1.1:Double).first)
    println(a1.first)
    println(a1.second)
    
  }
}