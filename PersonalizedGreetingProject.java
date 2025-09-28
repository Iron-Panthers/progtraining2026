

import java.util.Scanner;
import java.util.Random;

public class PersonalizedGreetingProject {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Name: ");
        String name = input.nextLine();
        String message;

        switch (name) {
            case "Samantha":
                message = "Hi Samantha, thanks for teaching me how to program!";
                break;
            case "Naina":
                message = "Hi Naina, nice to see you.";
                break;
            case "Kalista":
                message = "Hi Kalista, how's it going?";
                break;
            case "Vienna":
                message = "Good afternoon, Vienna.";
                break;
            case "Riya":
                message = "Greetings, Riya!";
                break;
            default:
                message = "Hi " + name + "!";
        }

        Random rand = new Random();
        int randNum = rand.nextInt(3);
        String message2;

        switch (randNum) {
            case 0:
                message2 = "Robotics is fun!";
                break;
            case 1:
                message2 = "How are your projects coming along?";
                break;
            default:
                message2 = "The weather is nice today.";
        }

        System.out.println(message + " " + message2);
    }
}
