package progtraining2026;
import java.util.Scanner;
import java.util.Random;
// hi freshies your so sigma
public class Main{

public static void main (String [] args){
     System.out.println("Wanna play a game? (yes/no)");
     Scanner scan = new Scanner(System.in);
     Random random = new Random();
     int number = random.nextInt(100) + 1;
     int guess = 0;
     int attempts = 0;
     if (scan.nextLine().equals("yes")){
        System.out.println("Great! I'm thinking of a number between 1 and 100. Can you guess it?");
       
        while (guess != number) {
           guess = scan.nextInt();
        attempts++;
        if (guess < number) {
            System.out.println("Too low!");
        } else if (guess > number) {
            System.out.println("Too high!");
            
        } else {
            System.out.println("Correct! You guessed the number in " + attempts + " attempts.");
            break;
        }
        }
 } else {
         System.out.println("Ok, maybe next time!");
     }
    
    

     
    
   
}
}