import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        
        System.out.println("You need a password in order to play.");
        String password = "password";
        String passwordGuess = input.nextLine();
        String play = "yes";

        boolean playerWantsToPlay = true;

        while (true) {

            if (passwordGuess.equals(password)) {
                break;
            }
            else {
                System.out.println("Wrong");
            }
            passwordGuess = input.nextLine();
        }

        while (play.equals("yes")) {
            int answer = rand.nextInt(101);
            System.out.println("Guess an integer from between 1 and 100, inclusive.");
            int userGuess = 0;
            int guessNum = 0;

            while (userGuess != answer) {
                userGuess = input.nextInt();
                guessNum++;
                if (userGuess == answer) {
                    break;
                }
                else if (userGuess > answer) {
                    System.out.println("Lower");
                }
                else if (userGuess < answer) {
                    System.out.println("Higher");
                }
            }
            input.nextLine();
            System.out.println("Yay!, you guessed correctly!");
            System.out.println("It took you " + guessNum + " guesses.");

            System.out.println("Do you want to play again?");
            String playAgain = input.nextLine();

            if(playAgain.equals("yes")) {
                playerWantsToPlay = true;
            }
            else {
                playerWantsToPlay = false;
                break;
            }
        }
    }
}
