public class SavingsAccount implements Accountable {
    private double balance;
    public SavingsAccount(double balance) {
        this.balance = balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public void deposit(double amount) {
        this.balance += amount;
    }

    @Override
    public Double getBalance() {
        return balance;
    }

    @Override
    public void showInfo() {
        System.out.println("Savings account");
        System.out.println("Balance: " + balance);
        System.out.println();
    }
}
