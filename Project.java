package progtraining2026;
import java.util.ArrayList;
import java.util.Scanner;
public class Project {
  public static void main (String[] args) { 
    
    ArrayList<Integer> numberList = new ArrayList<Integer>();
    String[][] numberArray = { {"1", "2", "3"},
                                {"4","5", "6"} ,
                                {"7","8","9"}};
                           

                                                       
    
     
                                
    Scanner scan = new Scanner(System.in);
    System.out.println("Type the x-coordinate of the place u wanna place ur mark on the 3 by 3 tic tac toe board");
    int xCoord= scan.nextInt();
    System.out.println("Type da y-coordinate of the place u wanna place ur mark on the 3 by 3 tic tac toe board");
    int yCoord= scan.nextInt();
    System.out.println("Type true if u won, false if u didnt");
    boolean win = scan.nextBoolean();
       
      while(win==false){
    while (xCoord<=3 && yCoord<= 3){
      if (xCoord>3 || yCoord>3){
        System.out.println("Bruh, the board is only 3 by 3");
        System.out.println("Type the x-coordinate of the place u wanna place ur mark on the 3 by 3 tic tac toe board");
         xCoord= scan.nextInt();
        System.out.println("Type da y-coordinate of the place u wanna place ur mark on the 3 by 3 tic tac toe board");
         yCoord= scan.nextInt();
         numberArray[xCoord-1][yCoord-1] = "X";
         System.out.println("Type true if u won, false if u didnt");
          win = scan.nextBoolean();
         break;

        //  System.out.println(numberArray[xCoord-1][yCoord-1]);
      } else {

        numberArray[xCoord-1][yCoord-1] = "X";
        System.out.println("Type true if u won, false if u didnt");
         win = scan.nextBoolean();
         System.out.println("Type the x-coordinate of the place u wanna place ur mark on the 3 by 3 tic tac toe board");
         xCoord= scan.nextInt();
        System.out.println("Type da y-coordinate of the place u wanna place ur mark on the 3 by 3 tic tac toe board");
         yCoord= scan.nextInt();
        break;
        }
    }   
    for (int i = 0; i < numberArray.length; i++) {
      for (int j = 0; j < numberArray[i].length; j++){
        System.out.print(numberArray[i][j] + " ");
      }
      System.out.println();
      

    //  System.out.println(numberArray[xCoord-1][yCoord-1]);
    //  numberArray[xCoord-1 ][yCoord-1 ] = "X";
    
    
      
  
  }
  
      
}
    }
  }

