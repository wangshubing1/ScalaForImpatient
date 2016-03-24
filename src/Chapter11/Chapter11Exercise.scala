package Chapter11
import scala.math.abs
object Chapter11Exercise extends App {
 println(3+4->5)
// println(3->4+5)
 var a1=new Fraction(6,10)
 var a2=new Fraction(16,100)
  println(a1.gcd(6,10))
//  println(a1.num)
  println(a1.toString())
  println(a2.toString())
  println((a1+a2).toString())
  println((a1-a2).toString())
  println((a1*a2).toString())
  println((a1/a2).toString())
   
  
}
class Fraction (n:Int,d:Int){
  private val num:Int= if(d==0) 1 else n*sign(d)/gcd(n,d)
  private val den:Int= if(d==0) 0 else d*sign(d)/gcd(n,d)
  def gcd(a:Int,b:Int):Int={ if (b==0) abs(a) else gcd(b,a%b) }
  def sign(i:Int)={ if(i>0) 1 else if (i<0) -1 else 0 }
  def +(other:Fraction):Fraction= {new Fraction(other.num*this.den+other.den*this.num,other.den*this.den)}
  def -(other:Fraction):Fraction= {new Fraction(-other.num*this.den+other.den*this.num,other.den*this.den)}
  def *(other:Fraction):Fraction= {new Fraction(other.num*this.num,other.den*this.den)}
  def /(other:Fraction):Fraction= {new Fraction(other.den*this.num,other.num*this.den)}
  override def toString = num + "/" + den
 
}