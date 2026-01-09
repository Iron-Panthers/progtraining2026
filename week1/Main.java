package week1;

import java.util.Random;
import java.util.Scanner;

public class Main {
    
    public static Scanner input = new Scanner (System.in); 
    public static Random random = new Random(); 
    
    public static void main(String[] args) {
        int number = random.nextInt(100); 
        System.out.println("Guess a number between 1 and 100"); 
        int guess =  -8;
                while(number != guess){
                    guess = input.nextInt(); 
                    // if(guess == number){ 
                    //     break; 
                    // }
                    System.out.println((guess > number )?"lower" : "higher"); 

                }

            
         System.out.println("You guessed the correct answer");
    }
}