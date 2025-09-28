import java.util.Scanner;
import java.util.Random;

enum Mood {
    HAPPY,
    SAD,
    ANGRY,
}

//happy is more like a typical chatbot, sad is emo/depressed, angry is just very mean

public class MoodyChatbot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int randNum = rand.nextInt(3);

        Mood botMood;
        switch (randNum) {
            case 0:
                botMood = Mood.HAPPY;
                break;
            case 1:
                botMood = Mood.SAD;
                break;
            default:
                botMood = Mood.ANGRY;
        }
        System.out.println("Hello! I am a chatbot specializing in code, what would you like help with today? Enter 1 for coding, 2 for other things.");
        int ans = input.nextInt();

        String out;
        if (ans == 1) {
            switch (botMood) {
                case HAPPY:
                    out = "Your code is great! I'll do my best to help you with any concerns!";
                    break;
                case SAD:
                    out = "Wow, look at this code... I could never improve on something like this.";
                    break;
                default:
                    out = "What were you thinking? Your code is filled with errors and inconsistencies, you should relearn coding!";
            }
        }
        else if (ans == 2)  {
            switch (botMood) {
                case HAPPY:
                    out = "I am a coding assistant, please find another bot more suited for your task. Good luck on your project! :)";
                    break;
                case SAD:
                    out = "*cries*";
                    break;
                default:
                    out = "What are you doing here then? Go ask someone else!";
            }
        }
        else {
            switch (botMood) {
                case HAPPY:
                    out = "Sorry, I'm unsure of your request.";
                    break;
                case SAD:
                    out = "I don't understand what you mean.";
                    break;
                default:
                    out = "Give clearer instructions next time";
            }
        }
        System.out.println(out);
    }
}
