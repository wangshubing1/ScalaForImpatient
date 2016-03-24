package Chapter5

object test5 {
    class Counter(){
      private var value=0
      def increment(){value+=1}
      def current()=value
    }
      
    class Counter2(){
      private var value=0
//      def increment(){value+=1}
//      def current()=value
      def setValue(value:Int){this.value=value}
    }
      
    def main(arg:Array[String]){
      val myCounte1=new Counter()
      println(myCounte1.current())
      myCounte1.increment()
       println(myCounte1.current())
        myCounte1.increment
       println(myCounte1.current)
       
       val myCounte2=new Counter2()
       myCounte2.setValue(5)
       var person1 =new Person()
      println(person1.getName())
       var person2 =new Person("xubo")
      println(person2.getName())
      
        var person3 =new Person("scala",22)
      println(person3.getName())
      println(person3.getAge())
      var person4=new Person1("xubo",22)
      
    }
    
    
    class Person1(val name:String,val age:Int){
      
    }
    
    
    class Person(){
      private var name="x"
      private var age=0
      
      def this(name:String){
        this()
        this.name=name    
      }
      def this(name:String,age:Int){
        this(name)
        this.age=age
      }
      def getName()={
        this.name
      }
      def getAge()={
        this.age
      }
      
    }
}