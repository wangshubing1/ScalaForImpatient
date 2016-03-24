package Chapter10
class CryptoLogger extends Logger1{
  def log(msg:String,key:Int=3):String={
    for (i<-msg if (i.toInt>65 &&i.toInt<122)) yield if (key>=0) (97+((i-97+key)%26)).toChar else (97+((i-97+26+key)%26)).toChar
  }  
}
trait Logger1 {
  def log(msg:String,key:Int=3):String
  def IMax(a:Array[Double])={
    a.max
  }
}