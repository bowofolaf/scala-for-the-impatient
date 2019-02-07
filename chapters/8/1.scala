// extend BankAccount class
class CheckingAccount(initialBalance: Double) extends BankAccount(initialBalance) {
    
    override def deposit(amount: Double):Double = {
        chargeFee()
        super.deposit(amount)
    }

    override def withdraw(amount: Double):Double = {
        chargeFee()
        super.withdraw(amount)
    }

    private def chargeFee(): Unit = {
        balance -= 1
    }
}