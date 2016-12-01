package Chapter4

object SystemGetProperties {
   def main(arg:Array[String]){
     import scala.collection.JavaConversions.propertiesAsScalaMap 
     val props:scala.collection.Map[String,String]= System.getProperties() 
     for (i <- props) print(i+" \n")
     println(props("user.name"))
   }
}