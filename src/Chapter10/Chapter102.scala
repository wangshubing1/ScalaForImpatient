package Chapter10

//object Chapterp102 {
//
//}


import scala.math.Ordered
import java.awt.Point

object Chapter102 extends App  {
    var p1=new Point(1,1)
    println(p1.getLocation)
}

trait test extends  OrderedPoint {
  
}
abstract class OrderedPoint extends Point with Ordered[Point]{
  def campare(that:Point):Int=if(this.x<that.x && this.y<that.y) -1 else if (this.x==that.x && this.y==that.y) 0 else  1
  
}