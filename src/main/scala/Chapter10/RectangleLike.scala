package Chapter10
import java.awt.geom.Ellipse2D
trait RectangleLike {
  this:Ellipse2D.Double =>
  def translate(x:Double,y:Double){
    this.x=x
    this.y=y
  }
  def grow(x:Double,y:Double){
    this.x+=x
    this.y+=y
  }
}