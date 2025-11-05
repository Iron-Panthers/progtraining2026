import java.util.Random;
import java.util.Scanner;

public class Randoms{
public static void main (String [] args){

Scanner input = new Scanner(System.in);

System.out.println ("What is your name?");
String name = input.nextLine();

System.out.println ("What is 100*38?");
String math = input.nextLine();

System.out.println ("Explain what a climax of a story is?");
String english = input.nextLine();

System.out.println ("What is the first step of the scientific process?");
String science = input.nextLine();

System.out.println ("What was the bloodiest battle in the civil war?");
String history = input.nextLine();

Random rand = new Random();

int randNum = rand.nextInt(5);

System.out.println ("Your IQ is " + randNum + ".");
}

}