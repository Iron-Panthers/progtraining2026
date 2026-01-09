import java.util.Scanner;
import java.util.Random;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        String[][] grid = {
            {" ", " ", " "},
            {" ", " ", " "},
            {" ", " ", " "}
        };

        int[] coordinates = new int[2];

        String player;
        String comp;
        int turn;
        boolean compWin;
        boolean playerWin;

        System.out.println("Hello! Welcome to Tic-Tac-Toe!");

        while (true) {

            grid[0][0] = " ";
            grid[0][1] = " ";
            grid[0][2] = " ";
            grid[1][0] = " ";
            grid[1][1] = " ";
            grid[1][2] = " ";
            grid[2][0] = " ";
            grid[2][1] = " ";
            grid[2][2] = " ";

            compWin = false;
            playerWin = false;

            System.out.println("Would you like to play as X or O?");

            player = input.nextLine();
            if (player.equals("O")) {
                comp = "X";
                turn = 0;
            }
            else {
                comp = "O";
                player = "X";
                turn = 1;
            }
            System.out.println("To play, enter the x and y coordinates of the square you would like to play in.");

            System.out.println("[" + grid[0][0] + "]" + "[" + grid[0][1] + "]" + "[" + grid[0][2] + "]");
            System.out.println("[" + grid[1][0] + "]" + "[" + grid[1][1] + "]" + "[" + grid[1][2] + "]");
            System.out.println("[" + grid[2][0] + "]" + "[" + grid[2][1] + "]" + "[" + grid[2][2] + "]");

            while (true) {
                if (turn == 1) { 
                    while(true) {
                        System.out.println("It's your turn.");
                        System.out.println("Which row would you like to place your move in?");
                        coordinates[0] = input.nextInt();
                        input.nextLine();

                        System.out.println("Which column would you like to place your move in?");
                        coordinates[1] = input.nextInt();
                        input.nextLine();
                        if (grid[coordinates[0]-1][coordinates[1]-1].equals(" ")) {
                            break;
                        }
                        else {
                            System.out.println("This square is already occupied. Please select another one.");
                        }
                    }
                    grid[(coordinates[0]- 1)][(coordinates[1] - 1)] = player;

                    System.out.println("[" + grid[0][0] + "]" + "[" + grid[0][1] + "]" + "[" + grid[0][2] + "]");
                    System.out.println("[" + grid[1][0] + "]" + "[" + grid[1][1] + "]" + "[" + grid[1][2] + "]");
                    System.out.println("[" + grid[2][0] + "]" + "[" + grid[2][1] + "]" + "[" + grid[2][2] + "]");
                    turn = 0;
                }
                else if (turn == 0) {
                    System.out.println("It's the computer's turn.");
                    while (true) {    
                        coordinates[0] = rand.nextInt(3);
                        coordinates[1] = rand.nextInt(3);
                        if (grid[coordinates[0]][coordinates[1]].equals(" ")) {
                            break;
                        }
                        else {
                            continue;
                        }
                    }
                    grid[coordinates[0]][coordinates[1]] = comp;
                    System.out.println("[" + grid[0][0] + "]" + "[" + grid[0][1] + "]" + "[" + grid[0][2] + "]");
                    System.out.println("[" + grid[1][0] + "]" + "[" + grid[1][1] + "]" + "[" + grid[1][2] + "]");
                    System.out.println("[" + grid[2][0] + "]" + "[" + grid[2][1] + "]" + "[" + grid[2][2] + "]");

                    turn = 1;
                }
                if ((grid[0][0] == grid[0][1] && grid[0][1] == grid[0][2] && grid[0][2] == comp) ||
                    (grid[1][0] == grid[1][1] && grid[1][1] == grid[1][2] && grid[1][2] == comp) ||
                    (grid[2][0] == grid[2][1] && grid[2][1] == grid[2][2] && grid[2][2] == comp) ||
                    (grid[0][0] == grid[1][0] && grid[1][0] == grid[2][0] && grid[2][0] == comp) ||
                    (grid[0][1] == grid[1][1] && grid[1][1] == grid[2][1] && grid[2][1] == comp) ||
                    (grid[0][2] == grid[1][2] && grid[1][2] == grid[2][2] && grid[2][2] == comp) ||
                    (grid[0][0] == grid[1][1] && grid[1][1] == grid[2][2] && grid[2][2] == comp) ||
                    (grid[2][0] == grid[1][1] && grid[1][1] == grid[0][2] && grid[0][2] == comp)) {
                    compWin = true;
                }
                else if ((grid[0][0] == grid[0][1] && grid[0][1] == grid[0][2] && grid[0][2] == player) ||
                    (grid[1][0] == grid[1][1] && grid[1][1] == grid[1][2] && grid[1][2] == player) ||
                    (grid[2][0] == grid[2][1] && grid[2][1] == grid[2][2] && grid[2][2] == player) ||
                    (grid[0][0] == grid[1][0] && grid[1][0] == grid[2][0] && grid[2][0] == player) ||
                    (grid[0][1] == grid[1][1] && grid[1][1] == grid[2][1] && grid[2][1] == player) ||
                    (grid[0][2] == grid[1][2] && grid[1][2] == grid[2][2] && grid[2][2] == player) ||
                    (grid[0][0] == grid[1][1] && grid[1][1] == grid[2][2] && grid[2][2] == player) ||
                    (grid[2][0] == grid[1][1] && grid[1][1] == grid[0][2] && grid[0][2] == player)) {
                    playerWin = true;
                }
                if (playerWin || compWin) {
                    break;
                }
            }
            if (compWin) {
                System.out.println("The computer wins!");
            }
            else if (playerWin) {
                System.out.println("The player wins!");
            }
            
            System.out.println("Would you like to play again?");
            if (input.nextLine().equals("no")) {
                break;
            }

            }

        }

    }
