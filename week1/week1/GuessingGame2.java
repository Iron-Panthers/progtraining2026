package week1;
import java.util.Scanner;

public class GuessingGame2 {
    public static void main(String[] args){
    Scanner input = new Scanner (System.in);
    int answer = (int)(Math.random()*100);
    System.out.println("guess what number??????????????????????????");
    int guess = input.nextInt();
    boolean correct = false;
    
    while(correct == false){
        System.out.println("boi who is u");
        int cheese = input.nextInt();
    if (answer == guess){
        System.out.println("ig ur correct stoopid");
        break;
    
    }
    else if (cheese < answer){
        System.out.println("Your guess is too low stupid head");
    }

    else if (cheese > answer){
        System.out.println("Your guess is too high bat po dingus head");
    }
    }   
    }
}
