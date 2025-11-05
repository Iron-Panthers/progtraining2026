import java.util.Scanner;
public class GameNight {

    public static void main(String[] args) {

        Body riya = new Body();

        while(riya.endGame() == false && riya.wonGame() == false) {
            Scanner input = new Scanner(System.in);
            System.out.println ("What letter would you like to guess?");
            String letterGuessed = input.nextLine();
            boolean correct = riya.guessedRight(letterGuessed);
            if (correct == false){
                System.out.println(riya.addBodyPart());
            }

            riya.printWord();
            System.out.println();
        }
        if (riya.endGame() == true){
            riya.endGame();
        }
        if (riya.wonGame() == true){
            riya.wonGame();
        }

    }    
}
