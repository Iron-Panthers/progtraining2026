import java.util.Scanner;

public class TicTacTwo {
    static Scanner input = new Scanner(System.in);
    static String[] av = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};

    public static void main(String[] args) {
        System.out.println("Tic-Tac-Toe (Kinda)");

        printBoard();
        ask();
        int move = input.nextInt();
        switch (move) {
            case 1:
                continueGame(1, 9);
                ask();
                move = input.nextInt();
                switch (move) {
                    case 2:
                        continueGame(2, 3);
                        ask();
                        move = input.nextInt();
                        switch (move) {
                            case 4:
                                compWin(4, 6);
                                break;
                            case 5:
                                compWin(5, 6);
                                break;
                            case 6:
                                continueGame(6, 7);   
                                ask();
                                move = input.nextInt();
                                switch (move) {
                                    case 4:
                                        compWin(4, 8);
                                        break;
                                    case 5:
                                        compWin(5, 8);
                                        break;
                                    case 8: 
                                        continueGame(8, 5);   
                                        tie(4);
                                    default:
                                        no();
                                }
                                break;
                            case 7:
                                compWin(7, 6);
                                break;
                            case 8:
                                compWin(8, 6);
                                break;
                            default:
                                no();
                        }
                        break;
                        //done
                    case 3:
                        continueGame(3, 2);
                        ask();
                        move = input.nextInt();
                        switch (move) {
                            case 4:
                                continueGame(4, 7);
                                ask();
                                move = input.nextInt();
                                switch (move) {
                                    case 5:
                                        compWin(5, 8);
                                        break;
                                    case 6:
                                        compWin(6, 8);
                                        break;
                                    case 8: 
                                        continueGame(8, 5);   
                                        tie(6);
                                    default:
                                        no();
                                }
                                break;                            
                            case 5:
                                continueGame(5, 7);
                                ask();
                                move = input.nextInt(); 
                                switch (move) {
                                    case 4:
                                        compWin(4, 8);
                                        break;
                                    case 6:
                                        compWin(6, 8);
                                        break;
                                    case 8: 
                                        continueGame(8, 4);   
                                        tie(6);
                                    default:
                                        no();
                                }
                                break;
                            case 6:
                                continueGame(6, 8);   
                                ask();
                                move = input.nextInt();
                                switch (move) {
                                    case 4:
                                        compWin(4, 5);
                                        break;
                                    case 5:
                                        compWin(5, 7);
                                        break;
                                    case 7: 
                                        compWin(7, 5);
                                        break;
                                    default:
                                        no();
                                }
                                break;
                            case 7:
                                continueGame(7, 4);   
                                ask();
                                move = input.nextInt();
                                switch (move) {
                                    case 5:
                                        playerWin(5);
                                        break;
                                    case 6:
                                        continueGame(6, 5);   
                                        tie(8);
                                    case 8: 
                                        continueGame(8, 5);   
                                        tie(6);                                        
                                    default:
                                        no();
                                }
                                break;   
                                //done                         
                            case 8:
                                continueGame(8, 5);   
                                ask();
                                move = input.nextInt();
                                switch (move) {
                                    case 4:
                                        continueGame(4, 7);   
                                        tie(6);                                        
                                    case 6:
                                        continueGame(6, 7);   
                                        tie(4);
                                    case 7: 
                                        continueGame(7, 4);   
                                        tie(6);                                        
                                    default:
                                        no();
                            }                            
                            default:
                                no();
                        }
                        break;
                        //done
                    case 4:
                        continueGame(4, 7);   
                        ask();
                        move = input.nextInt();
                        switch (move) {
                            case 2:
                                compWin(2, 8);
                                break;
                            case 3:
                                compWin(3, 8);
                                break;
                            case 5:
                                compWin(5, 8);
                                break;
                            case 6:
                                compWin(6, 8);
                                break;
                            case 8:
                                continueGame(8, 5);   
                                ask();
                                move = input.nextInt();
                                switch (move) {
                                    case 2:
                                        compWin(2, 3);
                                        break;
                                    case 3:
                                        compWin(3, 2);
                                        tie(6);
                                    case 6:
                                        compWin(6, 3);
                                        break;
                                    default:
                                        no();
                                }
                                break;
                            default:
                                no();
                        }
                        break;
                        //done
                    case 5:
                        continueGame(5, 7);
                        ask();
                        move = input.nextInt();
                        switch (move) {
                            case 2:
                                compWin(2, 8);
                                break;
                            case 3:
                                compWin(2, 8);
                                break;
                            case 4:
                                compWin(4, 8);
                                break;
                            case 6:
                                compWin(6, 8);
                                break;
                            case 8:
                                continueGame(8, 2);
                                ask();
                                move = input.nextInt();
                                switch (move) {
                                    case 3:
                                        continueGame(3, 6);
                                        tie(4);
                                    case 4:
                                        continueGame(4, 6);
                                        tie(3);
                                    case 6:
                                        continueGame(6, 4);
                                        tie(3);
                                    default:
                                        no();
                                }
                            default: 
                                no();
                        }
                        break;
                        //done
                    case 6:
                        continueGame(6, 7);
                        ask();
                        move = input.nextInt();
                            switch (move) {
                                case 2:
                                    compWin(2, 8);
                                    break;
                                case 3:
                                    compWin(3, 8);
                                    break;
                                case 4:
                                    compWin(4, 8);
                                case 5:
                                    compWin(5, 8);
                                case 8:
                                    continueGame(8, 3);
                                    ask();
                                    move = input.nextInt();
                                    switch (move) {
                                        case 2:
                                            compWin(2, 5);
                                        case 4:
                                            compWin(4, 5);
                                        case 5:
                                            continueGame(5, 2);
                                            playerWin(4);
                                        default:
                                            no();
                                    }
                                    break;
                                default:
                                    no();
                            }
                        break;
                        //done
                    case 7:
                        continueGame(7, 4);
                        ask();
                        move = input.nextInt();
                        switch (move) {
                            case 2:
                                continueGame(2, 3);
                                ask();
                                move = input.nextInt();
                                switch (move) {
                                    case 5:
                                        compWin(5, 6);
                                    case 6:
                                        continueGame(6, 5);
                                        tie(8);
                                    case 8:
                                        compWin(8, 6);
                                }
                                break;
                            case 3:
                                continueGame(3, 2);
                                ask();
                                move = input.nextInt();
                                switch (move) {
                                    case 5:
                                        playerWin(5);
                                    case 6:
                                        continueGame(6, 5);
                                        tie(8);
                                    case 8:
                                        continueGame(8, 5);
                                        tie(6);
                                    default:
                                        no();
                                }
                                break;
                                //done @9:44
                            case 5:
                                continueGame(5, 3);
                                ask();
                                move = input.nextInt();
                                switch (move) {
                                    case 2:
                                        compWin(2, 6);
                                    case 6:
                                        continueGame(6, 2);
                                        tie(8);
                                    case 8:
                                        compWin(8, 6);
                                    default:
                                        no();
                                }
                            case 6:
                                continueGame(6, 5);
                                ask();
                                move = input.nextInt();
                                switch (move) {
                                    case 2:
                                        continueGame(2, 3);
                                        tie(8);
                                    case 3:
                                        continueGame(3, 2);
                                        tie(8);
                                    case 8:
                                        continueGame(8, 2);
                                        tie(3);
                                    default:
                                        no();
                                }
                            case 8:
                                continueGame(8, 3);
                                ask();
                                move = input.nextInt();
                                switch (move) {
                                    case 2:
                                        compWin(2, 6);
                                    case 5:
                                        compWin(5, 6);
                                    case 6:
                                        continueGame(6, 2);
                                        tie(5);
                                    default:
                                        no();
                                }
                            default:
                                no();
                        }
                        break;
                        //done @9:54
                    case 8:
                        continueGame(8, 3);
                        ask();
                        move = input.nextInt();
                        switch(move) {
                            case 2:
                                compWin(2, 6);
                            case 4:
                                compWin(2, 6);
                            case 5:
                                compWin(2, 6);
                            case 6:
                                continueGame(6, 5);
                                ask();
                                move = input.nextInt();
                                switch(move) {
                                    case 2:
                                        compWin(2, 7);
                                    case 4:
                                        compWin(2, 7);
                                    case 7:
                                        continueGame(7, 4);
                                        tie(2);
                                    default:
                                        no();
                                }
                            case 7:
                                compWin(2, 6);
                            default:
                                no();
                        }
                        break;
                    default:
                        no();
                }
                break;
                //done @9:58
            case 2:
                continueGame(2, 9);
                ask();
                move = input.nextInt();
                break;

            case 3:
                continueGame(3, 7);   
                ask();
                move = input.nextInt();
                break;
 
            case 4:
                continueGame(4, 9);
                ask();
                move = input.nextInt();
                break;

            case 5:
                continueGame(5, 9);
                ask();
                move = input.nextInt();
                break;

            case 6:
                continueGame(6, 3);
                ask();
                move = input.nextInt();
                break;

            case 7:
                continueGame(7, 9);
                ask();
                move = input.nextInt();
                break;

            case 8:
                continueGame(8, 9);
                ask();
                move = input.nextInt();
                break;

            case 9:
                continueGame(9, 1);  
                ask();
                move = input.nextInt();
                break;
            default:
                no();
        }


        
    }
    public static void continueGame (int playerMove, int compMove) {
        av[playerMove-1] = "X";
        av[compMove-1] = "O";
        System.out.println("You put an \"X\" on " + playerMove + " and the computer put an \"O\" on " + compMove + ".");
        printBoard();        
    }     

    public static void compWin (int playerMove, int compMove) {
        av[playerMove-1] = "X";
        av[compMove-1] = "O";
        System.out.println("You put an \"X\" on " + playerMove + " and the computer WON by puttin an \"O\" on " + compMove + ".");
        printBoard();
        System.out.println("\"You can't win unless you learn how to lose\" by Kareem Abdul-Jabbar");
        System.exit(0);
    }     

    public static void playerWin (int playerMove) {
        av[playerMove-1] = "X";
        System.out.println("You WON by putting an \"X\" on " + playerMove + ".");
        printBoard();
        System.out.println("Beginner's Luck...");
        System.exit(0);
    }

    public static void tie (int playerMove) {
        av[playerMove-1] = "X";
        System.out.println("Your only move is to put an \"X\" on " + playerMove + ", leading to a TIE.");
        printBoard();
        System.out.println("Until next time...");
        System.exit(0);
    }     

    public static void printBoard() {
        System.out.println("["+av[0]+"] ["+av[1]+"] ["+av[2]+"] \n["+av[3]+"] ["+av[4]+"] ["+av[5]+"] \n["+av[6]+"] ["+av[7]+"] ["+av[8]+"]");
    }
    
    public static void no() {
        System.out.println("Invalid number!");
    }

    public static void ask() {
        System.out.println("Enter the number where you want to place your \"X\" (1-9): ");
    }

}


