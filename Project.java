package progtraining2026;
import java.util.ArrayList;
import java.util.Scanner;
public class Project {
    public static void main(String[] args) {
        ArrayList<Integer> numberList = new ArrayList<Integer>();
        int[][] numberGrid = {
            {1, 2, 3},
            {1,2,3 },
            {1,2,3},
          };
          System.out.println("Type the x-coordinate of the place u wanna place ur mark on the 3 by 3 tic tac toe board");
          Scanner scan = new Scanner(System.in);
          int xCoord = scan.nextInt();
          if (xCoord < 0 || xCoord > 3) {
            System.out.println("Invalid x-coordinate. Please enter a value between 0 and 3.");
            return; // Exit the program or handle the error as needed
          }else if (xCoord == 1) {
            System.out.println("You placed your mark at (1, y)"+ numberGrid);
          } else if (xCoord == 2) {
            System.out.println("You placed your mark at (2, y)"+ numberGrid);
            } else  {
            System.out.println("You placed your mark at (3, y)"+ numberGrid);
             }
            System.out.println("Type the y-coordinate of the place u wanna place ur mark on the 3 by 3 tic tac toe board");
            Scanner input = new Scanner(System.in);
            int yCoord = input.nextInt();
            if (yCoord < 0 || yCoord > 3) {
                System.out.println("Invalid y-coordinate. Please enter a value between 0 and 3.");
                return; // Exit the program or handle the error as needed
              }else if (yCoord == 1) {
                System.out.println("You placed your mark at (" +xCoord+", 1)"+ numberGrid);
              } else if (yCoord == 2) {
                System.out.println("You placed your mark at ("+xCoord+",2)"+ numberGrid);
                } else  {
                System.out.println("You placed your mark at ("+xCoord+",3)"+ numberGrid);
            }
           
           
           
    }
    
}
