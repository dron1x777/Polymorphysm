public class CurrentAccount implements Transferable {
    private double balance;
    private final String[] history = new String[100];
    private int count;

    public CurrentAccount(double balance) {
        this.balance = balance;
    }
    void setBalance(double balance) {
        this.balance = balance;
    }
    @Override
    public void transfer(Transferable recipient, double amount) {
        if (amount <= balance) {
            balance -= amount;
            recipient.deposit(amount);
            history[count++] = "Transfer: -" + amount;
        } else {
            System.out.println("Ката: Акча жетишпейт!");
        }
    }

    @Override
    public void showHistory() {
        for (int i = 0; i < history.length; i++) {
            System.out.println(history[i]);
        }
    }

    @Override
    public void deposit(double amount) {
        this.balance += amount;
        history[count++] = "Deposited " + amount;
    }

    @Override
    public Double getBalance() {
        return balance;
    }

    @Override
    public void showInfo() {
        System.out.println("Current account");
        System.out.println("Balance: " + balance);
        System.out.println();
    }
}
