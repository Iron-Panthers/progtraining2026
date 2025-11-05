import java.util.Random;
import java.util.Scanner;

public class ProfileGenerator{

public static void main (String [] args){
    Scanner input = new Scanner(System.in);

    System.out.println ("What's your name?");
    String name = input.nextLine();
    
    System.out.println ("What's your favorite thing to do?");
    String activity = input.nextLine();
    
    System.out.println ("How old are you?");
    String age = input.nextLine();
    
    System.out.println ("What's your type? Be descriptive.");
    String type = input.nextLine();

    Random rand = new Random();
    
    int randNum = rand.nextInt(5);
    
    System.out.println ("Hi! My name is " + name + " and my favorite thing to do is " + activity + "." + " I am " + age + " years old." + " My type is " + type + ".");
    }
    }