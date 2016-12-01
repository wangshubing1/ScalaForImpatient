package Chapter8

class CheckingAccount(initialBalance:Double) extends BankAccount(initialBalance){
   override def deposit(amout:Double)=super.deposit(amout-1)
   override def withdraw(amout:Double)=super.withdraw(amout+1)
}