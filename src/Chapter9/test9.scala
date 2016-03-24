package Chapter9

import java.io.File
object test9 extends App{
  def subdirs(dir:File):Iterator[File]={
    val children =dir.listFiles.filter { _.isDirectory()}
    children.toIterator ++ children.toIterator.flatMap { subdirs _}
    
  }
}