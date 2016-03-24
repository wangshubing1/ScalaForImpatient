package Chapter6

//class Point1 {
//  def apply
//}

 class Point1 private(val x:Int,y:Double){
      
      private var p1=x
      private var balance=y
//      def deposit(amount:Double){balance+=amount}
      def getBalance()={
        (p1,balance)
      }
    }
   
  object Point1{
    private var lastNumber:Int=1
    private def newUniqueNumber()={
      lastNumber += 1
      lastNumber
    }
    def apply(x:Int,y:Int)={
      new Point1(x,y)
    }
}