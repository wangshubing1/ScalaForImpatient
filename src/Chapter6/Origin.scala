package Chapter6
import java.awt.Point
object Origin extends java.awt.Point with App{
//    def main(arg:Array[String]){
    var a=""
    
//    
//  }
    override def getLocation:Point=super.getLocation
    Origin.move(2,3)
    println(Origin.toString)
    Origin.getLocation()
}
