package Chapter13
import scala.collection.mutable.ListBuffer
object Chapter133 extends App {
    val l2=scala.collection.mutable.LinkedList(0,1,-2,0,4,-3,9,0)
    //方法1
     var cur2=l2
    println(cur2)
    println(cur2.next.head)
    if(cur2.elem==0) {cur2.elem=cur2.next.elem;cur2.next=cur2.next.next;cur2=cur2.next}
    while(cur2!=Nil){
    if(cur2.next.elem==0) {
      println(cur2.elem);
//      cur2.elem=0
      cur2.next=cur2.next.next
      cur2=cur2.next } else {cur2=cur2.next}
  }
    println(l2)
    
    //方法2：一行
    println(l2.filter { _ !=0 })
  
}