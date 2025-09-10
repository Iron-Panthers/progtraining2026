package progtraining2026.week1;

import java.util.Scanner;

// hi freshies your so sigma
public class Main{

// make a new comment that says something
// hi my name is samantha

public static void main (String [] args){
    Scanner input = new Scanner(System.in);

    System.out.println("Pick a random number 1-100");
    int age = input.nextInt();

    System.out.println("Pick another random number 1-100");
    int place = input.nextInt();
    input.nextLine();

    System.out.println("Name a random adjective to describe a puppy.");
    String adj = input.nextLine();

    System.out.println("Name a random city.");
    String city = input.nextLine();

    System.out.println("Name a random family member. (Ex. mom)");
    String fam = input.nextLine();

    System.out.println("Name a country.");
    String country = input.nextLine();

    System.out.println("Name an action that you do daily. (Ex. walk)");
    String verb = input.nextLine();

    System.out.println("Your " + age + "-year-old " + fam + " "+ verb + "ed for hours and hours because they were extremely " + adj + ". They " + verb + "ed so well that "+ country + " chose them to represent the entire country at the Olympics, held in " + city+". Unfortunately, they placed " + place + "th. :(");
}

}