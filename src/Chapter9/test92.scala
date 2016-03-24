package Chapter9
import java.io.File
object test92 extends App{
  println("a"++"a")
  for (i<-test9.subdirs(new File("f:/"))){
    if (i==null){}else{
    println(i)}
  }
}