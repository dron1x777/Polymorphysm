public class CheckingAccount extends BankAccount {

    public CheckingAccount(String ownerName, double balance) {
        super(ownerName, balance);
    }

    @Override
    void calculateMonthlyFee() {
        setBalance(getBalance() - 100);
        System.out.println("Monthly fee is " + 100 + " now your balance is " + getBalance());
    }

    @Override
    void withdraw(double amount) {
        if (amount > 0 &&  amount <= getBalance()) {
            setBalance(getBalance() - amount);
        }
    }
    @Override
    void deposit(double amount) {
        if (amount > 0 ) {
            setBalance(getBalance() + amount);
        }
    }
}
