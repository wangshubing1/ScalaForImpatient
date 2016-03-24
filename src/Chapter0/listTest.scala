package Chapter0

object listTest extends App {
  println(List(1,2,3,4,5,6,7).partition {_%2==0 })
  println(List(1,2,3,4,5,6,7) partition {_%2==0 })
  println(List(1,2,3,4,5,6,7).find {_%2==0 })
  println(List(1,2,3,4,5,6,7).find {_<0 })
  println(List(1,2,3,4,5,6,7) takeWhile(_<4 ))
  println(List(1,2,3,4,5,6,7) dropWhile(_<4 ))
  println(List(1,2,3,4,5,6,7) dropWhile(x=>(x%2==0)))
   println(List(1,2,3,4,5,6,7) span(_<4 ))
}