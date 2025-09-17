import java.util.Scanner;
import java.util.Random;

public class Greeting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("What is your name? (Don't mess around!!!)");
        String yourName = input.nextLine();
        int randInt = rand.nextInt(10);
        String printMsg;
        String numMsg;
        switch (yourName){
            case "Liam":
                printMsg = "Hello Liam, \nThanks for being the best programming teacher! (Ignore this Samatha)";
                break;
            case "Samantha":
                printMsg = "Hi Samantha, \nThanks for being the best programming teacher! (Ignore this Liam)";
                break;
            case "Riya":
                printMsg = "Good morning, Riya";
                break;
            case "Kalista":
                printMsg = "Good night, Kalista";
                break;
            case "Chris":
                printMsg = "Hi Chris, \nI really like your name! :)";
                break;
            default: 
                printMsg = "Hi " + yourName + ", \nSorry for forgetting you! :(";
        }
        System.out.println(printMsg);
        switch (randInt){
            case 0:
                numMsg = " (0)";
                break;
            case 1:
                numMsg = "a (1)";
                break;
            case 2:
                numMsg = "as (2)";
                break;
            case 3:
                numMsg = "asd (3)";
                break;
            case 4:
                numMsg = "asdf (4)";
                break;
            case 5:
                numMsg = "asdfa (5)";
                break;
            case 6:
                numMsg = "asdfas (6)";
                break;
            case 7:
                numMsg = "asdfasd (7)";
                break;
            case 8:
                numMsg = "asdfasdf (8)";
                break;
            case 9:
                numMsg = "asdfasdfa (9)";
                break;
            default:
                numMsg = "Bro what? (Not 0-9)";
                break;
        }
        System.out.println(numMsg);

    }
}
