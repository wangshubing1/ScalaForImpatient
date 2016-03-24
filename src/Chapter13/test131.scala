package Chapter13

object test131 extends App {
  println(Range(1,10))
  println(Vector(1,2):+5)
//  println(Vector(1,2))
  var a3=List(1,2,3)
  println(a3)
  println(a3.head)
  println(a3.tail)
  var a4=9::4::2::Nil
  println(a4)
//  a4 +=5
//  a4.addString("5")
  var a5=List("a","b")
//  println(a5.addString("c"))
  
  val l1=scala.collection.mutable.LinkedList(1,-2,4,-3,9)
  println(l1)
  var cur=l1
  println(cur)
  while(cur!=Nil){
    if(cur.elem<0) {println(cur.elem);cur.elem=0}
      cur=cur.next
  }
   println(cur)
   println(l1)
   
   val l2=scala.collection.mutable.LinkedList(1,-2,4,-3,9)
     var cur2=l2
    println(cur2)
    while(cur2!=Nil){
    if(cur2.elem<0) {println(cur2.elem);cur2.elem=0}
      cur2.next=cur2.next.next
      cur2=cur2.next
  }
   println("end")
   println(l2)
   
   println(Array(1,1,2,2,2,3,4,5).toSet)
//   println(Array(1,1,2,2,2,3,4,5).toSet.map(_ > _))
}
