import java.util.Random;
import java.util.Scanner;

public class moodyChatbot {
    enum Moods {
        HAPPY(0),
        SAD(0),
        ANGRY(0),
        SCARED(0),
        DISGUSTED(0);

        int rating;
        private Moods(int rating){
            this.rating = rating;
        }
    }
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("hi im a moody chatbot. what part of ur code do u want me to look over?");
        String code = input.nextLine();
        int num = rand.nextInt(5);
        Moods currentMood;
        switch (num){
            case 0:
                currentMood = Moods.HAPPY;
                break;
            case 1:
                currentMood = Moods.SAD;
                break;
            case 2:
                currentMood = Moods.ANGRY;
                break;
            case 3:
                currentMood = Moods.SCARED;
                break;
            default:
                currentMood = Moods.DISGUSTED;
                break;
        }
        switch (currentMood){
            case HAPPY:
                System.out.println("wow this code is great! i love it! especially the part where u wrote: " + code);
                break;
            case SAD:
                System.out.println("this code makes me sad... especially the part where u wrote: " + code);
                break;
            case ANGRY:
                System.out.println("this code makes me angry! especially the part where u wrote: " + code);
                break;
            case SCARED:
                System.out.println("this code scares me... especially the part where u wrote: " + code);
                break;
            case DISGUSTED:
                System.out.println("this code disgusts me... especially the part where u wrote: " + code);
                break;
        }
        System.out.println("how would u rate my mood from 1-10?");
        int userRating = input.nextInt();
        currentMood.rating = (currentMood.rating + userRating);
        input.close();
    }
}