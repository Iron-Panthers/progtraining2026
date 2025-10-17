import java.util.Scanner;

public class tictactoe {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        String player1 = "x";
        String player2 = "o";
        String grid[][] = {
            { "1", "2", "3" },
            { "4", "5", "6" },
            { "7", "8", "9" }
        };
        boolean win = false;
        boolean istie = false;

        while (win == false && istie == false) {
            // Print the grid
            for (int col = 0; col < 3; col++) {
                for (int row = 0; row < 3; row++) {
                    System.out.print(grid[row][col]);
                }
                System.out.println();
            }
    
            while (win == false && istie == false) {
                // Player 1 turn
                boolean turn1 = true;
                while (turn1 == true){
                System.out.println("Player 1: Enter the row:");
                int row1 = input.nextInt();
    
                System.out.println("Player 1: Enter the column:");
                int col1 = input.nextInt();
    
                if (grid[row1][col1].equals(player1) || grid[row1][col1].equals(player2)) {
                    System.out.println("This spot is already taken");
                    turn1 = true;
                } else {
                    grid[row1][col1] = player1;
                    turn1 = false;
                    // Print the updated grid
                    for (int r = 0; r < 3; r++) {
                        for (int c = 0; c < 3; c++) {
                            System.out.print(grid[r][c]);
                        }
                        System.out.println();
                    }
    
                    // Check if Player 1 won
                    for (int j = 0; j < 3; j++) {
                        if (grid[j][0].equals("x") && grid[j][1].equals("x") && grid[j][2].equals("x")) {
                            System.out.println("Player 1 has won the game!");
                            win = true;
                        }
                    }
                    for (int j = 0; j < 3; j++) {
                                if (grid[0][j].equals("x") && grid[1][j].equals("x") && grid[2][j].equals("x")) {
                                    System.out.println("Player 1 has won the game!");
                                    win = true;
                         }
                    }
                    if (grid[0][0] .equals("x") && grid[1][1] .equals("x") && grid[2][2] .equals("x")){
                        System.out.println("Player 1 has won!");
                        win = true;
                    }
                    if (grid[2][0] .equals("x") && grid[1][1] .equals("x") && grid[0][2] .equals("x")){
                        System.out.println("Player 1 has won!");
                        win = true;
                    } 
                    if (!win) {
                        // Player 2 turn
                        System.out.println("Player 2: Enter the row:");
                        int r = input.nextInt();
    
                        System.out.println("Player 2: Enter the column:");
                        int c = input.nextInt();
    
                        if (grid[r][c].equals(player1) || grid[r][c].equals(player2)) {
                            System.out.println("This spot is already taken");
                        } else {
                            grid[r][c] = player2;
    
                            // Print the updated grid
                            for (int o = 0; o < 3; o++) {
                                for (int y = 0; y < 3; y++) {
                                    System.out.print(grid[o][y]);
                                }
                                System.out.println();
                            }
                            for (int w = 0; w < 3; w++) {
                                if (grid[w][0].equals("o") && grid[w][1].equals("o") && grid[w][2].equals("o")) {
                                    System.out.println("Player 2 has won the game!");
                                    win = true;
                                }
                            }
                            for (int w = 0; w < 3; w++) {
                                if (grid[0][w].equals("o") && grid[1][w].equals("o") && grid[2][w].equals("o")) {
                                    System.out.println("Player 2 has won the game!");
                                    win = true;
                                }
                            }
                            
                            }
                            if (grid[0][0] .equals("o") && grid[1][1] .equals("o") && grid[2][2] .equals("o")){
                                System.out.println("Player 2 has won!");
                                win = true;
                            }
                            if (grid[2][0] .equals("o") && grid[1][1] .equals("o") && grid[0][2] .equals("o")){
                                System.out.println("Player 2 has won!");
                                win = true;
                            } 
                            istie = true;
                            for (int u = 0; u < 3; u++) {
                                for (int q = 0; q < 3; q++) {
                                    if (!grid[u][q].equals("x")&&!grid[u][q].equals("o")){
                                        istie = false;
                                        
                                    }
                                
                                }
                                
                                
                                }
                                if (istie == true)
                                System.out.println("It is a tie");
                            }
                            
                        
                        }
                    }
                }
            }
        }
    }
    
        
    
