package Chapter5

object Car5 {
   def main(arg:Array[String]){
    var car1=new Car("BWM","A6")
    car1.PrintAll()
     var car2=new Car("BWM","A6",2000)
    car2.PrintAll()
     var car3=new Car("BWM","A6","A01")
    car3.PrintAll()
     var car4=new Car("BWM","A6",2000,"A01")
    car4.PrintAll()
   }
   
  class Car( val producerName:String,val productName:String,val productyear:Int,var num:String){
    def this( producerName:String, productName:String){
      this(producerName, productName,-1,"")
      
    }
    def this( producerName:String, productName:String,productyear:Int){
      this(producerName, productName,productyear,"")
    }
    def this( producerName:String, productName:String,num:String){
      this( producerName:String, productName:String,-1,num)
    }
    def PrintAll(){
      println("producerName:"+producerName+" productName:"+productName+" productyear:"+productyear+" num:"+num)
    }
  }
}