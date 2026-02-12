public class SavingsAccount extends BankAccount {

    public SavingsAccount(String ownerName, double balance) {
        super(ownerName, balance);
    }
    @Override
    public void withdraw(double amount) {
        if (amount < 50000 && amount <= getBalance()) {
            setBalance(getBalance() - amount);
        } else if (amount < 50000 ) {
            System.out.println("Нельзя снять больше 50000!");
        }
    }
    @Override
    void deposit(double amount) {
        if (amount > 0 ) {
            setBalance(getBalance() + amount);
        }
    }

}
