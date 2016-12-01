package Chapter13

object test1317 extends App {
  var n:Int=100000000
//  (0 to 10000).foreach { println }
  var start1=System.currentTimeMillis(); 
  var s1:Double=(0 to n).par.sum
  var end1=System.currentTimeMillis(); 
  println(s1+":"+ (end1-start1))
  
  start1=System.currentTimeMillis(); 
  s1=(0 to n).sum
  end1=System.currentTimeMillis(); 
  println(s1+":"+ (end1-start1))
//  println(end2)
//  println(start2)
  

   start1=System.currentTimeMillis(); 
   s1=(0 to n).par.count { _ %2==0 }
   end1=System.currentTimeMillis(); 
   println(s1+":"+ (end1-start1))
  
   start1=System.currentTimeMillis(); 
   s1=(0 to n).count { _ %2==0 }
   end1=System.currentTimeMillis(); 
  println(s1+":"+ (end1-start1))
  
  var y1=for(i<- (0 to 10000).par) yield i+" "
  println(y1)
//  var y2=
    for(i<- (0 to 10000).par)  println(i)
  
}