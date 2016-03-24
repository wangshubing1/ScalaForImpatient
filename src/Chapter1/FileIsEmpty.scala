package Chapter1

object FileIsEmpty {
  def main(args:Array[String]){
//    var file = "scala.txt" 
//    if(!file.isEmpty) file=args(0)
    
//    var file=if(!args.isEmpty) args(0) else "hello.txt"
//    println(file)
    
//    for (i <- 1 to 10) print(i+"\n")

    val files=(new java.io.File(".")).listFiles()
    for (i <- files) print(i+"\n")

  }
}