
package week1;
import java.util.Scanner;
import java.util.Random; 
public class guessinggame2 {
public static Scanner input = new Scanner (System.in); 
public static Random random = new Random(); 

public static void main(String[] args) {
    int number = random.nextInt(100); 
  System.out.println("Guess a number between 1 and 100"); 
   int guess = -8;
   while(number != guess){
    guess = input.nextInt(); 
    if(guess<number){ 
    System.out.println("Go higher"); 
    }
    else if(guess>number){
System.out.println("Go lower"); 
    }
   }
System.out.println("Congratulation! You have guessed the number"); 


}

}
