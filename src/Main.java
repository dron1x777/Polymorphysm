import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        SavingsAccount savingsAccount = new SavingsAccount(15000);
        SavingsAccount savingsAccount2 = new SavingsAccount(25000);
        CurrentAccount currentAccount = new CurrentAccount(150000);
        currentAccount.deposit(150000);
        Accountable[]  accountables = new Accountable[]{savingsAccount, savingsAccount2, currentAccount};
        for (Accountable accountable : accountables) {
            accountable.showInfo();
        }
    }
}
