import java.util.Scanner;
import java.util.Random;

public class guessingGame {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("im thinking of a number between 1 and 100. can u guess it?");
        int numberToGuess = rand.nextInt(100) + 1;
        int userGuess = input.nextInt();
        while (userGuess != numberToGuess){
            if (userGuess > numberToGuess){
                System.out.println("too high!");
            } else if (userGuess < numberToGuess){
                System.out.println("too low!");
            }
            System.out.println("guess again!");
            userGuess = input.nextInt();
        }
        System.out.println("great job! u guessed the number: " + numberToGuess);
    }
}