import java.util.Scanner;

public class BankProject {

    String name = "Samantha";
    int age = 16;
    double balance = 1000;
    int hasDebt = 1000000;


    // this.name = name;
    // this.age = age;
    // this.balance = balance;
    // this.hasDebt = hasDebt;

    public double depositMoney (double money){
        balance = balance + money;
        return balance;
    }
    public int incrementAge (int yearsPassed){
        age = yearsPassed;
        return age;
    }
    public void setDebt (int setDebt){
        this.hasDebt = setDebt;
    }
    public int getDebt (){
        return hasDebt;
    }
    public static void main(String[] args) {

        BankProject riya = new BankProject();
    
        System.out.println ("Your balance is " + riya.balance);
        System.out.println ("Your age is " + riya.age);
        System.out.println ("Your debt is " + riya.getDebt());
    
        Scanner input = new Scanner(System.in);
        System.out.println ("What would you like to do today? Press 1 for seeing your balance.  Press 2 to change your age. Press 3 for seeing your debt.");
        int check = input.nextInt();
        if (check == 1){
            System.out.println ("Your balance is " + riya.balance);
        }
        if (check == 2){
            System.out.println ("What would you like to change your age to?");
            int changedAge = input.nextInt();
            System.out.println ("You changed your age to " + changedAge + ".");
        }
        if (check == 3){
            System.out.println ("Your debt is " + riya.getDebt() + ".");
        }
        
    }    
    public boolean isMinor(int age){
        if (age<18){
            return true;
        }
        else {
            return false;
        }
    }
}
