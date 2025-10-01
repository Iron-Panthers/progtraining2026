package week1;
import java.util.Scanner;
public class GuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            int answer = (int)(Math.random()*100);
            System.out.println("Guess Random number between 1-100");
           int guess = input.nextInt();
            boolean correct = false;
            if(guess == answer){
                correct = true;
                System.out.println("You guessed it!");
            }
            while(correct == false){
                System.out.println("Try again?");
             
                int cheese = input.nextInt();
                if (cheese==answer){
                    correct = true;
                    System.out.println("CORRECT, YEEEEEEAAAHHHH");
                    break;
                }
                else if (cheese > answer){
                    System.out.println("Your number is too high.");
                }
                else if (cheese < answer){
                    System.out.println("Your number is too low");
                }
            }
       }
    }


