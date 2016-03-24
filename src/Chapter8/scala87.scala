package Chapter8

//import java.awt.{Rectangle,Point}
import java.awt.{Rectangle=>XRetangle}
import java.awt.{Point=>XPoint}
object scala87 extends App {
  var a=new XPoint(1,22)
  println(a.getX)
  println(a.getLocation)
  println(a.x)
  var r1=new XRetangle(2,2,2,2)
  var r2=new XRetangle(2,2)
  var r3=new XRetangle()
  println(r1.getLocation)
  println(r2.getLocation)
  println(r3.getLocation)
   println(r1.getHeight)
  println(r2.getHeight)
  println(r3.getHeight)
//  new java.awt.Rectangle
}
class Square(point:XPoint,width:Int) extends XRetangle(point.x,point.y,width:Int,width:Int){
 def this(){
//    this
    this(new XPoint(0,0),0)
  }
  def this(width:Int){
    this(new XPoint(0,0),width)
  }
}