package Chapter8

class SavingAccount(initialBalance:Double) extends BankAccount(initialBalance:Double){
  var s:Int=0
  def earnMonthlyInterest()={
    s=0
    super.deposit(2)
    
  }
  override def deposit(amount:Double)={
    s+=1
    if (s<=3) {super.deposit(amount);} else super.deposit(amount-1)
//    super.balance
    
  }
  override def withdraw(amount:Double)={
     s+=1
     if (s<=3) {super.withdraw(amount); }else super.deposit(amount+1)
  }
}