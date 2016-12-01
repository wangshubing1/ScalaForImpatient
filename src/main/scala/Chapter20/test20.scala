package Chapter20
import scala.actors.Actor
object test20 extends App {
  var a1=new HiActor
  a1.start()
  a1!"Hi"
//  
}
class HiActor extends Actor{
  def act(){
    while(true){
      receive{
        case "Hi" =>println("Hello")
      }
    }
  }
}