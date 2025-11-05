import java.time.Year;
import java.util.Scanner;
public class TicTacToe{
    public static void main (String[]args){
            //   String name [][] = new String[3][3];
            Scanner input = new Scanner(System.in);
            int robotRow;
            int robotColumn;
            String robotMove = "O";
            boolean gameOver = false;
            boolean goodRobotMove = false;
                
                String grid [][] = {{"1","2","3"}, {"4","5","6"}, {"7", "8", "9"}};
    
            while (gameOver == false) {
            for(int i =0; i<3; i++){
            for(int w=0;w<3; w++){
                System.out.print("|" + grid[i][w] + "|");
            }
            System.out.println();
            }
                System.out.println( );
                System.out.println ( );
                System.out.println ( );

                System.out.println("What row do you want to play? (1-3)");
                    int row = input.nextInt() -1;

                System.out.println("What column do you want to play? (1-3)");
                    int column = input.nextInt() -1;

                grid [row][column] = "X";
                

                while (goodRobotMove == false){
                robotRow = (int)(Math.random()*3);
                robotColumn = (int)(Math.random()*3);
                    if (grid[robotRow][robotColumn] != "X" && grid[robotRow][robotColumn] != "O"){
                        grid[robotRow][robotColumn] = "O";

                        goodRobotMove = true;
                    }
                }
                goodRobotMove = false;

                for (int y = 0; y < 3; y++) {
                    if (grid [0][y].equals(grid[1][y])&&grid[2][y].equals(grid[0][y])&&grid[y][0].equals("X")){
                        System.out.println("You won!!!");
                        gameOver = true;

                    }
                }
                for (int x = 0; x < 3; x++){
                    if (grid [x][0].equals(grid[x][1])&&grid[x][2].equals(grid[x][0])&&grid[x][0].equals("X")){
                        System.out.println("You won!!!");
                        gameOver = true;
                    }
                }
                if (grid [0][0].equals("X")&& grid [1][1].equals("X") && (grid[2][2]).equals("X")){
                    System.out.println("You win!");
                    gameOver = true;
                }
                if (grid [0][2].equals ("X") && (grid [1][1]).equals ("X") && (grid [0][2].equals("X") && (grid[2][0]).equals("X"))){
                    System.out.println("You win!");
                }
                for (int y = 0; y < 3; y++) {
                    if (grid [0][y].equals(grid[1][y])&&grid[2][y].equals(grid[0][y])&&grid[y][0].equals("X")){
                        System.out.println("You won!!!");
                        gameOver = true;
                    }
                }
                for (int z = 0; z < 3; z++){
                    if (grid[z][0].equals(grid[z][1])&&grid[z][2].equals(grid[z][0])&&grid[z][0].equals("O")){
                    System.out.println("You lose :(");
                    gameOver = true;

                }
                if (grid [0][0].equals("O")&& grid [1][1].equals("O") && (grid[2][2]).equals("O")){
                    System.out.println("You lose :(");
                }
                if (grid [0][2].equals ("O") && (grid [1][1]).equals ("O") && (grid [0][2].equals("O") && (grid[2][0]).equals("O"))){
                    System.out.println("You lose :(");
                }

                }
                }
            }
}