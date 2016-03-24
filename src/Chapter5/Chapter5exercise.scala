package Chapter5

object Chapter5exercise {
  def main(arg:Array[String]){
    //1
    var c1=new Counter()
     val myCounte1=new Counter()
      println(myCounte1.current())
      myCounte1.increment()
       println(myCounte1.current())
        myCounte1.increment
       println(myCounte1.current)
    //3
     var t1=new Time(3,2)
     var t2=new Time(3,1)
     println(t1.hours)
     println(t1.minutes)
     println(t1.before(t2))
     println(t1.toString())
//     for t1.toString()
     //4
     var t3=new Time4(10,11)
         
     println(t3.toString())
//     t1.hours=4
     println("test")
     
     
     //6
       var p1 =new Person("Jack",-1)
     println(p1.getAge())
     println(p1.getName())
      var p2 =new Person("Jack",11)
     println(p2.getAge())
     println(p2.getName())
     println("hello")
     
     //7
    var p7= new Person2("Fred Smith")
    println(p7.firstName)
    println(p7.lastName)
    var car1=new Car("BWM","A6")
    car1.PrintAll()
     var car2=new Car("BWM","A6",2000)
    car2.PrintAll()
     var car3=new Car("BWM","A6","A01")
    car3.PrintAll()
     var car4=new Car("BWM","A6",2000,"A01")
    car4.PrintAll()
  }
  //8
  class Car( val producerName:String,val productName:String,val productyear:Int,var num:String){
//    val productyear:String,var num:Int
//    val productyear:String
//    var num:String=""
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
  
  //7
    class Person2(s1:String){
//      var (i,j)=s1.split("\\s+")
       val firstName=s1.split("\\s+")(0)
       val lastName=s1.split("\\s+")(1)
//       println(s1)
//       for((i)<-s1.split("\\s+")) println(i);
//       val (firstName,lastName)=

   }
  
  //6
   class Person(){
      private var name="x"
      private var age=0
      
      def this(name:String){
        this()
        this.name=name    
      }
      def this(name:String,age:Int){
        this(name)
        if(age<0) this age=0 else this.age=age
      }
      def getName()={
        this.name
      }
      def getAge()={
        this.age
      }
   }
   
  //4
  class Time4( val hours:Int=0,val minutes:Int=0){
    if(hours>23 || hours<0) println("error,you need input a number of hour in 0-23") else{
    }
      def before(other:Time):Boolean={
      if((other.hours< this.hours )||(other.hours<=this.hours && other.minutes<=minutes)) false else true
    }
      override def toString():String={
//       def toString1():String={
        val d1=hours*60+minutes
        d1.toString()
      }
  }
  
  
  //3
  class Time( val hours:Int=0,val minutes:Int=0){
    if(hours>23 || hours<0) println("error,you need input a number of hour in 0-23") else{}
      def before(other:Time):Boolean={
      if((other.hours< this.hours )||(other.hours<=this.hours && other.minutes<=minutes)) false else true
    }
       override def toString():String={
//       def toString1():String={
        hours+":"+minutes
      }
  }
  
  //2
  class BankAccount(val balance:Int=0){
//    private var balance=0
    def deposit(){}
     def withdraw(){}
  }
  
  //1
  class Counter(){
      private var value=Int.MaxValue-1
//      println(value)
      def increment(){if(value<Int.MaxValue) value+=1 else value=value}
      def current()=value
    }
      
}