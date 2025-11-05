import java.util.Scanner;

public class PersonalizedGreeting {
    Scanner input = new Scanner (System.in);
    System.out.println ("What is your name?");
    String response = input.nextLine();
    if (response == "Samanta"){
        System.out.println ("You are the gyattiest teacher ever!!");
    }
    if (response == "Kalista"){
        System.out.println ("Your cheescake is the best!!");
    }
    if (response == "Liam"){
        System.out.println ("idk wha to put for now.");
    }
}
