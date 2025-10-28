package progtraining2026;
import java.util.Scanner;

public class Dogs {
    String name = "Cookie";
    double weight = 25.5;
    String animal = "Dog";
    boolean hasFur = true;
    double happinessLevel = 8.5;
    Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        Dogs dog = new Dogs();
        System.out.print("Your dog is this happy: "+dog.getHappinessLevel());
        if (dog.getHappinessLevel() > 7.0) {
            System.out.println(" Your dog is very happy!");
        } else {
            System.out.println("Your dog could be happier, take them on a walk or give them a treat!");
        }
       
        String action = dog.input.nextLine();

        if (action.equals("walk")) {
            dog.happinessLevel += 1.5;
            System.out.print("Your dog is this happy now: "+dog.getHappinessLevel());
        } else if (action.equals("treat")) {
            dog.happinessLevel += 2.0;
            System.out.print("Your dog is this happy now: "+dog.getHappinessLevel());
        } else {
            System.out.println("Unknown action. Your dog's happiness remains the same.");
        }

        
    }



public double getHappinessLevel() {
    return happinessLevel;
}
}