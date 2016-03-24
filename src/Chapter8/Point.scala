package Chapter8

class Point(x:Int,y:Int){
  def getPoint()={(x,y)}
  def getx()={x}
  def gety()={y}
//  (x,y).toArray
}
class labeldPoint(label:String,x:Int,y:Int) extends Point(x,y){
  def this(arg:String){
    this(arg,0,0) 
  }
  def printall(){
    println(label+x+y)
  }
}
