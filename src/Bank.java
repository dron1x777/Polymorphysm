public class Bank {

    void collectMonthlyFees(BankAccount[] accounts) {
        for (BankAccount account : accounts) {
            account.calculateMonthlyFee();
        }
    }
    void getTotalBalance(BankAccount[] accounts) {
        double sum = 0;
        for (BankAccount account : accounts) {
            sum += account.getBalance();
        }
        System.out.println("Total Balance: " + sum);
    }
    void closeAccountsWithLowBalance(BankAccount[] accounts, double minBalance) {
        for (BankAccount account : accounts) {
            if (account.getBalance() < minBalance) {
                account.getAccountInfo();
            }
        }
    }
}
