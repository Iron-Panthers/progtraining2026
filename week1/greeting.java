import java.util.Scanner;
import java.util.Random;
public class greeting {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int num = rand.nextInt(6);
        System.out.println("whats ur name");
        String name = input.nextLine();
        switch (num){
            case 0:
                System.out.println("hi " + name);
            case 1:
                System.out.println("hello " + name);
                break;
            case 2:
                System.out.println("greetings " + name);
                break;
            case 3:
                System.out.println("salutations " + name);
                break;
            case 4:
                System.out.println("hey there " + name);
                break;
            default:
                System.out.println("hi there " + name);
                break;
        }
        input.close();
    }
}
