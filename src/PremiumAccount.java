public class PremiumAccount extends BankAccount {

    public PremiumAccount(String ownerName,double balance) {
        super(ownerName, balance);
    }
    @Override
    void calculateMonthlyFee() {
        setBalance(getBalance() - 500);
        double result = (getBalance()*12)*5/100;
        setBalance(getBalance()+result);
        System.out.println("Monthly fee is " + 500 + " now your balance is " + getBalance() + " and you have " + result + " in balance");
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
