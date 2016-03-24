package Chapter10
import java.awt.geom.Ellipse2D
object Chapter10Exercise extends App {
  //10.1
  val egg=new Ellipse2D.Double(5,10,20,30) with RectangleLike
  println(egg.getX+" "+egg.getY)
  println(egg.translate(10, -10).getClass())
  println(egg.getX+" "+egg.getY)
  egg.grow(10, 20)
  println(egg.getX+" "+egg.getY)
//  println("a"-97)
  //4
  var c4=new CryptoLogger
  println(c4.log("Hello World", 0))
  println(c4.log("Hello World", 1))
  println(c4.log("Hello World"))
  println(c4.log("Hello World", 3))
  println(c4.log("Hello World", -3))
}