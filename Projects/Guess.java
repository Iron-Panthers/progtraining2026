import java.util.Random;
import java.util.Scanner;
public class Guess {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        Random randInt = new Random();
        int random = randInt.nextInt(100) + 1;
        System.out.println("Guess a random number 1-100: ");
        int guess;
        while (true) {
        guess = input.nextInt();

        if (guess == random) {
            System.out.println("You correctly guessed that the answer was " + random + "!");
            System.exit(0);
        }else if (guess > random) {
            System.out.println("You guessed " + guess + ". The real answer is lower...\nGuess again!");
        }else {
            System.out.println("You guessed " + guess + ". The real answer is higher...\nGuess again!");
        

}
}
}
}
