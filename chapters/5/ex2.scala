// write a class BankAccount with methods deposit and withdraw and readonly property balance
class BankAccount(private var balance: Double) {
  def getBalance: Double = balance

  def withdraw(amount: Double): Double = {
    if(balance >= amount) {
      balance -= amount
    }
    balance
  }

  def deposit(amount: Double): Double = {
    if(amount > 0) {
      balance += amount
    }
    balance
  }
}
