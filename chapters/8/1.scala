// extend BankAccount class to a checking account that charges $1 on every
// deposit/withdrawal
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
