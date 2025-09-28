

// hi freshies your so sigma

import java.util.Scanner;
import java.util.Random;

public class ProfileGeneratorProject{

public static void main (String [] args){
    System.out.println("Welcome to the Profile Generator!");
    System.out.println("Enter your information to continue:");

    System.out.print("Name: ");
    Scanner name = new Scanner(System.in);
    String userName = name.nextLine();

    System.out.print("Age: ");
    Scanner age = new Scanner(System.in);
    int userAge = age.nextInt();

    System.out.print("Height(cm): ");
    Scanner height = new Scanner(System.in);
    int userHeight = height.nextInt();

    System.out.print("Favorite subject: ");
    Scanner subject = new Scanner(System.in);
    String favSubject = subject.nextLine();

    System.out.print("Favorite color: ");
    Scanner color = new Scanner(System.in);
    String favColor = color.nextLine();

    System.out.print("Favorite number: ");
    Scanner num = new Scanner(System.in);
    int favNum = num.nextInt();

    System.out.println("All done!");
    System.out.println("Here's your predictions!");

    Random rand = new Random();
    int luckyNum = favNum + rand.nextInt(42);
    int recClass = rand.nextInt(4);
    int IQ = userHeight + userAge + luckyNum - rand.nextInt(100);
    int totalLife = rand.nextInt(120);
    int GPA = rand.nextInt(4);
    double deci = Math.random();
    int lifespan = Math.abs(totalLife-userAge);

    System.out.println("Your lucky Number: " + luckyNum);
    System.out.println("Class you should take next year: " + favSubject + " " + (recClass + 1));
    System.out.println("Predicted GPA: " + (deci+GPA));
    System.out.println("Your IQ: " + IQ);
    System.out.println("Remaining lifespan: " + lifespan);
    
}

}