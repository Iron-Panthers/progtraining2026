package progtraining2026;
import java.util.Scanner;
import java.util.Random;

public class Mario {
    String charecter = ":)";
    String[][] levels = {{"_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_"},{"_","_","_", "_", "_", "_", "_", "_", "_", "_","_", "_", "_", "_", "_", "_", "_", "_"}};
    Scanner input = new Scanner(System.in);
    boolean keepgoing = true;
    int score = 0;
    int i = 7;
    public void printFirstLevel() {
        while (keepgoing){  
        System.out.println(levels[0][1] + levels[0][2] + levels[0][3]+ levels[0][4] + levels[0][5]+levels[0][6]+levels[0][7]);
        System.out.println(levels[1][1]+levels[1][2]+levels[1][3]+levels[1][4]+levels[1][5]+levels[1][6]+levels[1][7]);
        System.out.println((printScoreKeep(score++)));
        //System.out.println((goDown(charecter)));
        jumpingCode();
        System.out.println(levels[0][1] + levels[0][2] + levels[0][3]+ levels[0][4] + levels[0][5]+levels[0][6]+levels[0][7]);
        System.out.println(levels[1][1]+levels[1][2]+levels[1][3]+levels[1][4]+levels[1][5]+levels[1][6]+levels[1][7]+"\n");
        goDown(charecter);
        System.out.println(levels[0][1] + levels[0][2] + levels[0][3]+ levels[0][4] + levels[0][5]+levels[0][6]+levels[0][7]);
        System.out.println(levels[1][1]+levels[1][2]+levels[1][3]+levels[1][4]+levels[1][5]+levels[1][6]+levels[1][7]+"\n");
        obstacle();

        }
    }
    public int printScoreKeep(int score) {
        Mario mario = new Mario();
        
        String counter = input.nextLine();
        
       while (keepgoing) {
        if (counter.equals( "jump")) {
            score++;
            break;
        }
    }
        return score;
    }
    public void jumpingCode() {
        int p = 0;
        int w = 1;
        levels[p][w]= charecter;
        levels[1][1]= "_";

    }
    public String goDown(String boing){
        levels[0][1]= "_";
        levels[1][1]= charecter;
        charecter = boing;
        return boing;
        
    }
    public void obstacle(){
        Random random = new Random();
        i--;
        int o =1;
        int number = random.nextInt(2); 
      
        if (number>=1) {

           levels[o][i] = "7";
           

        }
        levels[o][i+1] = "_";
        levels[o][i]="7";
        if (o == 1 && i == 1) {
            System.out.print("The goomba killed u?");
        }
       
       
        
    }
    
    
    public static void main(String[] args) {
        Mario game = new Mario();
        
        game.printFirstLevel();
        game.printScoreKeep(0);
        


       
    }
}
    