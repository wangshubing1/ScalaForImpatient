package Chapter6

//object Account1 {
//  
//}

 class Account1 private(val id:Int,initialBalance:Double){
      
      private var balance=initialBalance
//      def deposit(amount:Double){balance+=amount}
      def getBalance()={
        balance
      }
    }
   
  object Account1{
    private var lastNumber:Int=1
    private def newUniqueNumber()={
      lastNumber += 1
      lastNumber
    }
    def apply(initialBalance:Double)={
      new Account1(newUniqueNumber(),initialBalance)
    }
}