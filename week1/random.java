import java.util.Random;
import java.util.Scanner;
public class random {
    public static void main (String [] args){
        Random rand = new Random();
        Scanner input = new Scanner(System.in);

        System.out.println("welcome to the personal info stealer muahahaha");
        System.out.println("whats ur social security");
        int socialSecurity = input.nextInt();
        System.out.println("whats ur credit card number");
        int creditCard = input.nextInt();
        System.out.println("where do u live");
        String address = input.nextLine();
        System.out.println("how many toes do u have");
        int toes = input.nextInt();
        System.out.println("are you human");
        boolean isHuman = input.nextBoolean();
        System.out.println("can u read this");
        boolean canRead = input.nextBoolean();
        System.out.println("are u cool");
        boolean isCool = input.nextBoolean();

        double gpa = rand.nextDouble(4.0);
        System.out.println("ur gpa is:" + gpa);
        int toesCut = rand.nextInt(11);
        System.out.println("i hacked ur toes and cut off " + toesCut + " toes muahahaha");
        double money = rand.nextDouble(1000000);
        System.out.println("i hacked ur bank account and stole $" + money + " muahahaha");
        System.out.println("thank u for ur info");
        input.close();
    }
}