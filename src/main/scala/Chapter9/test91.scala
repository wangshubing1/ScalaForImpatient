package Chapter9
import java.io.File
import java.io.PrintWriter
object test91 extends App {
  val out=new PrintWriter("file/outDir.txt")
  println("a"++"a")
  var sumdir=0
  for (i<-test9.subdirs(new File("e:/"))){
    sumdir+=1
    println(i)
    out.println(sumdir+":"+i)
    
  }
  println(sumdir)
  out.println(sumdir)
  out.close()
}