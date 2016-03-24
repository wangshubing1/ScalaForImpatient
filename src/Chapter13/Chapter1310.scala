package Chapter13

object Chapter1310 extends App {
   import scala.collection.immutable.HashMap
   var str="abcabcac"
   val frequencies=str.par.aggregate(HashMap[Char,Int]())(
       {(a,b)=>a+(b->(a.getOrElse(b,0)+1))},{
         (map1,map2)=>(map1.keySet++map2.keySet).foldLeft(HashMap[Char,Int]()){
           (result,k)=>result+(k->(map1.getOrElse(k, 0)+map2.getOrElse(k, 0)))
               }
       }
       )
       println(frequencies)
       println(Map("Hello"->1).get("Hello"))
       println(Map("Hello"->1).getOrElse("Hell1o", 0))
       println(HashMap("Hello"->1)+("a"->2))
}