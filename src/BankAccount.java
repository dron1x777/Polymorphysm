public class BankAccount {
    private String ownerName;
    private int accountNumber;
    private double balance;
    private static int counter;
    private double fee = 0;

    public BankAccount(String ownerName,double balance) {
        this.ownerName = ownerName;
        this.accountNumber = ++counter;
        this.balance = balance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        BankAccount.counter = counter;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    void deposit(double amount) {
        if  (amount > 0) {
            this.balance += amount;
            System.out.println("Deposited " + amount + " to account " + this.accountNumber);
        }
    }
    void withdraw(double amount) {
    }
    void calculateMonthlyFee() {
    }
    void getAccountInfo() {
        System.out.println("Account number " + accountNumber);
        System.out.println("Owner name " + ownerName);
        System.out.println("Account balance " + balance);
    }
}
