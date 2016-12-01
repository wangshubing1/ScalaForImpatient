package Chapter6
//utf-8 =>http://zhidao.baidu.com/link?url=05MrcrgTsvXFouAP8c2eHkkjf1JvZiMvivNyJQqoQ1_TR5QJBO8BhbrUnnDZ_U8ppi2GVQcIxfeZUtMe0t2jja
object Card extends Enumeration {
 
  val M = Value("♣")
  val T = Value("♠")
  val H = Value("♥")
  val F = Value("♦")
  var ss="Hello"
//  println(Card.M)
//  println(Card.F)
//  println(Card.H)
//  println(Card.F)
  override def toString()={
    (Card.M.toString()+Card.F.toString()+Card.H.toString()+Card.T.toString())
    //ERROR:
//    (Card.M.toString()+Card.F.toString(),Card.H.toString(),Card.T.toString()
//    (Card.M+Card.F+Card.H+Card.T).toString()
    
  } 
  def IsRed(arg:Card.Value):Boolean={
      if(arg==Card.T || arg==Card.F ){ true }else false
    }
  def main(arg:Array[String]){
      println(Card.toString())
      println(Card.M.toString())
      println(Card.F.toString()) 
      println(Card.H.toString()) 
      println(Card.T.toString())
      println(IsRed(Card.T))
      println(IsRed(Card.M))
//      println("Hello")
  } 
}