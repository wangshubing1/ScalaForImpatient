package Chapter6

object test61 {
  def main(arg:Array[String]){
      var a4=Account1(1010)
      println(a4.id)
      println(a4.getBalance)
  }
}
//  class Account1 private(val id:Int,initialBalance:Double){
//      
//      private var balance=initialBalance
////      def deposit(amount:Double){balance+=amount}
//    }
//   
//  object Account1{
//    private var lastNumber:Int=1
//    private def newUniqueNumber()={
//      lastNumber += 1
//      lastNumber
//    }
//    def apply(initialBalance:Double){
//      new Account1(newUniqueNumber(),initialBalance)
//    }
//}