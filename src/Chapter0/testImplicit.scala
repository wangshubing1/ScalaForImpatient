package Chapter0
import java.io.File
import scala.io.Source
//import scala.io.
object testImplicit extends App {
  
//  implicit def test(a:Int)= a:RichInt
//   def test2(f1:File)=new RichFile(f1)
//   implicit def test2(f1:File)=new RichFile(f1)
   import da._
   implicit def add(op:Int)=op+1
   var t2= new File("file/1.txt").read2
   println(1.addy(2))
}

object da{
implicit class RichFile(file:File){
  def read2=Source.fromFile(file.getPath).mkString
}
implicit class addX(op:Int){
  def addy(a:Int)=op+a
}
}