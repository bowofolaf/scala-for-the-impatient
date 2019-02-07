// extend BankAccount class to a SavingsAccount that 
// earns interest every month via earnMonthlyInterest  
// has 3 free deposits or withdrawals every month

class SavingsAccount(initialBalance: Double) extends BankAccount(initialBalance) {
    private Double INTEREST_RATE = 0.25

    private var freeTransactions = 0

    override def deposit(amount: Double):Double = {
        chargeFee()
        super.deposit(amount)
    }

    override def withdraw(amount: Double):Double = {
        chargeFee()
        super.withdraw(amount)
    }

    private def chargeFee(): Unit = {
        if (freeTransactions < 3) {
            freeTransactions += 1
        } else balance -= 1
    }

    private def earnMonthlyInterest(): Unit = {
        freeTransactions = 0
        balance += INTEREST_RATE * balance
    }
}
