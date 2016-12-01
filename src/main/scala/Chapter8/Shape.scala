package Chapter8

abstract class Shape {
   def centerPoint(){}
}

class Rectangle(x1:Double,y1:Double,x2:Double,y2:Double,x3:Double,y3:Double,x4:Double,y4:Double) extends Shape {
  override def centerPoint(){
    var x0=(x1+x2+x3+x4)/4
    var y0=(y1+y2+y3+y4)/4
//    (x0,y0)
    println("x0:" +x0+ " y0:"+y0)
  }
}

class Circle(x1:Double,y1:Double) extends Shape {
  override def centerPoint(){
    println("("+x1+","+y1+")")
  }
}