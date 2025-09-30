import java.util.Scanner;
public class ticTacToe {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);

        //Welcome message
        System.out.println("welcome to tic tac toe!");
            String[][] board = {
                {"[ ]", "[ ]", "[ ]"},
                {"[ ]", "[ ]", "[ ]"},
                {"[ ]", "[ ]", "[ ]"}
            };
            for (int row = 0; row < board.length; row++){
                for (int i = 0; i < board[row].length; i++){
                    System.out.print(board[row][i]);
                }
                System.out.println();
            }

        //Starting variable setup
        int chosenRow = 0;
        int chosenColumn = 0;
        int playerNum = 1;
        String symbol = "[X]";
        String answer;

        //Game loop start
        while (true){
            System.out.println("player "+ playerNum + ": please pick a row");
            chosenRow = input.nextInt() - 1;
            System.out.println("player " + playerNum + ": please pick a column");
            chosenColumn = input.nextInt() - 1;
            board[chosenRow][chosenColumn] = symbol;
            for (int row = 0; row < board.length; row++){
                for (int i = 0; i < board[row].length; i++){
                    System.out.print(board[row][i]);
                }
                System.out.println();
            }

            //Check winState
            if (board[0][0] == symbol && board[0][1] == symbol && board[0][2] == symbol){
                System.out.println("player " + playerNum + " has won!");
                input.nextLine();
                System.out.println("do u want to play again?");
                answer = input.nextLine();
                if (answer.equals("yes")){
                    System.out.println("welcome to tic tac toe!");
                    for (int row = 0; row < board.length; row++){
                        for (int i = 0; i < board[row].length; i++){
                            board[row][i] = "[ ]";
                        }
                    }
                    for (int row = 0; row < board.length; row++){
                        for (int i = 0; i < board[row].length; i++){
                            System.out.print(board[row][i]);
                        }
                        System.out.println();
                    }

                    //Starting variable setup
                    chosenRow = 0;
                    chosenColumn = 0;
                    playerNum = 1;
                    symbol = "[X]";
                    continue;
                } else {
                    break;
                }
            } else if (board[1][0] == symbol && board[1][1] == symbol && board[1][2] == symbol){
                System.out.println("player " + playerNum + " has won!");
                input.nextLine();
                System.out.println("do u want to play again?");
                answer = input.nextLine();
                if (answer.equals("yes")){
                    System.out.println("welcome to tic tac toe!");
                    for (int row = 0; row < board.length; row++){
                        for (int i = 0; i < board[row].length; i++){
                            board[row][i] = "[ ]";
                        }
                    }
                    for (int row = 0; row < board.length; row++){
                        for (int i = 0; i < board[row].length; i++){
                            System.out.print(board[row][i]);
                        }
                        System.out.println();
                    }

                    //Starting variable setup
                    chosenRow = 0;
                    chosenColumn = 0;
                    playerNum = 1;
                    symbol = "[X]";
                    continue;
                } else {
                    break;
                }
            } else if (board[2][0] == symbol && board[2][1] == symbol && board[2][2] == symbol){
                System.out.println("player " + playerNum + " has won!");
                input.nextLine();
                System.out.println("do u want to play again?");
                answer = input.nextLine();
                if (answer.equals("yes")){
                    System.out.println("welcome to tic tac toe!");
                    for (int row = 0; row < board.length; row++){
                        for (int i = 0; i < board[row].length; i++){
                            board[row][i] = "[ ]";
                        }
                    }
                    for (int row = 0; row < board.length; row++){
                        for (int i = 0; i < board[row].length; i++){
                            System.out.print(board[row][i]);
                        }
                        System.out.println();
                    }

                    //Starting variable setup
                    chosenRow = 0;
                    chosenColumn = 0;
                    playerNum = 1;
                    symbol = "[X]";
                    continue;
                } else {
                    break;
                }
            } else if (board[0][0] == symbol && board[1][0] == symbol && board[2][0] == symbol){
                System.out.println("player " + playerNum + " has won!");
                input.nextLine();
                System.out.println("do u want to play again?");
                answer = input.nextLine();
                if (answer.equals("yes")){
                    System.out.println("welcome to tic tac toe!");
                    for (int row = 0; row < board.length; row++){
                        for (int i = 0; i < board[row].length; i++){
                            board[row][i] = "[ ]";
                        }
                    }
                    for (int row = 0; row < board.length; row++){
                        for (int i = 0; i < board[row].length; i++){
                            System.out.print(board[row][i]);
                        }
                        System.out.println();
                    }

                    //Starting variable setup
                    chosenRow = 0;
                    chosenColumn = 0;
                    playerNum = 1;
                    symbol = "[X]";
                    continue;
                } else {
                    break;
                }
            } else if (board[0][1] == symbol && board[1][1] == symbol && board[2][1] == symbol){
                System.out.println("player " + playerNum + " has won!");
                input.nextLine();
                System.out.println("do u want to play again?");
                answer = input.nextLine();
                if (answer.equals("yes")){
                    System.out.println("welcome to tic tac toe!");
                    for (int row = 0; row < board.length; row++){
                        for (int i = 0; i < board[row].length; i++){
                            board[row][i] = "[ ]";
                        }
                    }
                    for (int row = 0; row < board.length; row++){
                        for (int i = 0; i < board[row].length; i++){
                            System.out.print(board[row][i]);
                        }
                        System.out.println();
                    }

                    //Starting variable setup
                    chosenRow = 0;
                    chosenColumn = 0;
                    playerNum = 1;
                    symbol = "[X]";
                    continue;
                } else {
                    break;
                }
            } else if (board[0][2] == symbol && board[1][2] == symbol && board[2][2] == symbol){
                System.out.println("player " + playerNum + " has won!");
                input.nextLine();
                System.out.println("do u want to play again?");
                answer = input.nextLine();
                if (answer.equals("yes")){
                    System.out.println("welcome to tic tac toe!");
                    for (int row = 0; row < board.length; row++){
                        for (int i = 0; i < board[row].length; i++){
                            board[row][i] = "[ ]";
                        }
                    }
                    for (int row = 0; row < board.length; row++){
                        for (int i = 0; i < board[row].length; i++){
                            System.out.print(board[row][i]);
                        }
                        System.out.println();
                    }

                    //Starting variable setup
                    chosenRow = 0;
                    chosenColumn = 0;
                    playerNum = 1;
                    symbol = "[X]";
                    continue;
                } else {
                    break;
                }
            } else if (board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol){
                System.out.println("player " + playerNum + " has won!");
                input.nextLine();
                System.out.println("do u want to play again?");
                answer = input.nextLine();
                if (answer.equals("yes")){
                    System.out.println("welcome to tic tac toe!");
                    for (int row = 0; row < board.length; row++){
                        for (int i = 0; i < board[row].length; i++){
                            board[row][i] = "[ ]";
                        }
                    }
                    for (int row = 0; row < board.length; row++){
                        for (int i = 0; i < board[row].length; i++){
                            System.out.print(board[row][i]);
                        }
                        System.out.println();
                    }

                    //Starting variable setup
                    chosenRow = 0;
                    chosenColumn = 0;
                    playerNum = 1;
                    symbol = "[X]";
                    continue;
                } else {
                    break;
                }
            } else if (board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol){
                System.out.println("player " + playerNum + " has won!");
                input.nextLine();
                System.out.println("do u want to play again?");
                answer = input.nextLine();
                if (answer.equals("yes")){
                    System.out.println("welcome to tic tac toe!");
                    for (int row = 0; row < board.length; row++){
                        for (int i = 0; i < board[row].length; i++){
                            board[row][i] = "[ ]";
                        }
                    }
                    for (int row = 0; row < board.length; row++){
                        for (int i = 0; i < board[row].length; i++){
                            System.out.print(board[row][i]);
                        }
                        System.out.println();
                    }

                    //Starting variable setup
                    chosenRow = 0;
                    chosenColumn = 0;
                    playerNum = 1;
                    symbol = "[X]";
                    continue;
                } else {
                    break;
                }
            }

            //Swap player
            if (playerNum == 3){
                playerNum = 1;
            } else {
                playerNum += 1;
            }
            if (playerNum == 1){
                symbol = "[O]";
            } else if (playerNum == 2){
                symbol = "[X]";
            } else if (playerNum == 3){
                symbol = "[I]";
            }
        }
        input.close();
    }
}