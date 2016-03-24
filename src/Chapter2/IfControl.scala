package Chapter2

object IfControl {
  def main(args:Array[String]){
     val x=5
     val s = if(x>0) 1 else -1
     println(s)
//     val s2 = x > 0 ? 1:-1
//     println()
//     val a,b 
//     a=b=1
   printf("hello %d",x) ;
     var z=0
   for(i<- 1 to 10) print(i+" ")
   for(i<- 1 until 10){ print(i+" ");z += i;}
   println(z)
   val q ="hello"
   var sum=""
   for (i<- q) sum +=i
   println(sum)

   for (i<-1 to 10 ;j<- 1 to 5 if i!=j) print(10*i+j+ " ")
   var y= for(i<-1 to 10) yield i%3
   println("")
   println(y)
   var y1=for(c<-"Hello";i<-0 to 2) yield (c+i).toChar
   println(y1)
   
  }
}