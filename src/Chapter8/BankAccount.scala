package Chapter8

class BankAccount(initialBalance:Double) {
  private var balance=initialBalance
  def deposit(amout:Double)={balance+=amout;balance}
  def withdraw(amout:Double)={balance-=amout;balance}
}