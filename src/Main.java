public class Main {
    public static void main(String[] args) {
        BankAccount[] bankAccounts ={
                new CheckingAccount("Shama", 350000),
                new PremiumAccount("Alish", 180000),
                new SavingsAccount("Aziret", 250000),
        };
        Bank bank = new Bank();
        bank.getTotalBalance(bankAccounts);
        bank.closeAccountsWithLowBalance(bankAccounts,300000);
        bank.collectMonthlyFees(bankAccounts);

    }
}