package progtraining2026;
import java.util.Scanner;
import progtraining2026.*;

public class BankAccount { 
    
    String accountHolderName = "Bobby Smith";
    double balance = 1500.75;
    int ageOfAccountHolder = 30;
    boolean hadDebt = false;
    Scanner scanner = new Scanner(System.in);
    

    public static void main(String[] args) {
    
        BankAccount account = new BankAccount();
        account.introduceAccountHolder();
    }

    public void introduceAccountHolder() {
        accountHolderName = scanner.nextLine();
        balance = scanner.nextDouble();
        ageOfAccountHolder = scanner.nextInt();
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: $" + balance);
        System.out.println("Age of Account Holder: " + ageOfAccountHolder);
        if (hadDebt) {
            System.out.println("This account holder has had debt in the past.");
        } else {
            System.out.println("This account holder has no history of debt.");
        }
    }
}