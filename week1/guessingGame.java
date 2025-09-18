import java.util.Scanner;
import java.util.Random;

public class guessingGame {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        String password = "password";
        System.out.println("would u like to play a guessing game? (y/n)");
        String play = input.nextLine();
        int guessed = 0;

        while (play.equals("yes")){
            System.out.println("whats the password");
            String guessedPW = input.nextLine();
            if (guessedPW.equals(password)){
                System.out.println("im thinking of a number between 1 and 100. can u guess it?");
                int numberToGuess = rand.nextInt(100) + 1;
                int userGuess = input.nextInt();
                while (userGuess != numberToGuess){
                    if (userGuess > numberToGuess){
                        guessed += 1;
                        System.out.println("too high!");
                    } else if (userGuess < numberToGuess){
                        guessed += 1;
                        System.out.println("too low!");
                    }
                    System.out.println("guess again!");
                    userGuess = input.nextInt();
                }
                input.nextLine();
                System.out.println("great job! u guessed the number: " + numberToGuess);
                System.out.println("you guessed the number in " + guessed + " tries");
                System.out.println("play again? (y/n)");
                play = input.nextLine();
                if (play.equals("yes")){
                    continue;
                } else {      
                    System.out.println("thanks for playing!");
                    break;
                }
            } else {
                System.out.println("the password was wrong. :( u dont get to play");
                break;
            }        
            }
        input.close();
    }
}