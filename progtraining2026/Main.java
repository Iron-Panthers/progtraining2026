package progtraining2026;
import java.util.Random;
import java.util.Scanner;
// hi freshies your so sigma
public class Main{

public static void main (String [] args){

Scanner input = new Scanner(System.in);
System.out.println("What is  your name");
String name = input.nextLine();
System.out.println("Do you have any pets");
String pets = input.nextLine();
System.out.println("What is your favorite class");
String fav = input.nextLine();
System.out.println("Do u like tech?");
String tech = input.nextLine();
Random rand = new Random();
int randNum = rand.nextInt(10);
System.out.println("Probability of getting job: %"+randNum);
int randNum2 = rand.nextInt(4);
System.out.println("IQ: "+ randNum2);
int ranum = rand.nextInt(4);
System.out.println("GPA: "+ ranum);   
int randNum3 = rand.nextInt(15);
System.out.println("Pets: " + randNum3);

int age = 16;
boolean canVote = age >= 18 ;


}

}