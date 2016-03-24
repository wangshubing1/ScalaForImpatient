package Chapter6

//object Account {
//  
//}

  class Account{
      val id =Account.newUniqueNumber()
      private var balance=0.0
      def deposit(amount:Double){balance+=amount}
    }
   
  object Account{
    private var lastNumber:Int=1
    private def newUniqueNumber()={
      lastNumber += 1
      lastNumber
    }
    def apply(ar:Int){
        lastNumber=ar
//      new Account(newUniqueNumber(),ar)
    }
 def main(arg:Array[String]){
   var a4=Account(100)
//   println(a4.lastNumber)
   println(lastNumber)
   var a1=new Account
   println(a1.balance)
   println(a1.id)
   a1.deposit(3)
   println(a1.balance)
   println(a1.id)
    
   var a2=new Account
   println(a2.balance)
   println(a2.id)
   
     
   var a3=new Account
   println(a3.balance)
   println(a3.id)
   
   println(lastNumber)
  }
  }