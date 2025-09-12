package progtraining2026.week1;

import java.util.Scanner;

// hi freshies your so sigma
public class Main{

// make a new comment that says something
// hi my name is samantha

public static void main (String [] args){
    Scanner input = new Scanner (System.in);
    System.out.println ("Enter your grade:");
    int grade = input.nextInt();
    input.nextLine();
    System.out.println ("Enter a sport");
    String sport = input.nextLine();
    input.nextLine();
    System.out.println ("Enter a city");
    String city = input.nextLine();
    input.nextLine();
    System.out.println ("Enter left or right");
    String direction = input.nextLine();
    input.nextLine();
    System.out.println ("Enter an object");
    String object = input.nextLine();
    input.nextLine();
    System.out.println ("Enter an verb");
    String verb = input.nextLine();
    input.nextLine();
    System.out.println ("Enter an body part");
    String bodypart = input.nextLine();
    input.nextLine();
    System.out.print("In (grade) grade, I was going to a (sport) tournament in (city). When our light turned green, my mom was taking the (direction) turn, when suddenly, a (object) came speeding down the road and (verb) into the side of our car. For a few seconds, I didn't even know what was happening. My (body part) hit the side of the car and when I looked up I saw smoke and airbags coming from the other car.");
}

}