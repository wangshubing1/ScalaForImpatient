package test20160218

object doWhileReadLine {
  def  doWhile(){
    var line=""
    var i=1;
    do {
      line=readLine()
      print("read"+i+":"+line+"\n")
      i=i+1
    }while(line!="")
      println("end!\n")
  }
  def main(args:Array[String]){
    doWhile
  }
}