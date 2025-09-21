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
                                        break;
                                    default:
                                        no();
                                        break;
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
                                break;
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
                                        break;
                                    default:
                                        no();
                                        break;
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
                                        break;
                                    default:
                                        no();
                                        break;
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
                                        break;
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
                                        break;
                                    case 8: 
                                        continueGame(8, 5);   
                                        tie(6);   
                                        break;                                     
                                    default:
                                        no();
                                        break;
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
                                        break;                                    
                                    case 6:
                                        continueGame(6, 7);   
                                        tie(4);
                                        break;
                                    case 7: 
                                        continueGame(7, 4);   
                                        tie(6);
                                        break;                                        
                                    default:
                                        no();
                                        break;
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
                                        continueGame(3, 2);
                                        tie(6);
                                        break;
                                    case 6:
                                        compWin(6, 3);
                                        break;
                                    default:
                                        no();
                                        break;
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
                                        break;
                                    case 4:
                                        continueGame(4, 6);
                                        tie(3);
                                        break;
                                    case 6:
                                        continueGame(6, 4);
                                        tie(3);
                                        break;
                                    default:
                                        no();
                                        break;
                                }
                            default: 
                                no();
                                break;
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
                                    break;
                                case 5:
                                    compWin(5, 8);
                                    break;
                                case 8:
                                    continueGame(8, 3);
                                    ask();
                                    move = input.nextInt();
                                    switch (move) {
                                        case 2:
                                            compWin(2, 5);
                                            break;
                                        case 4:
                                            compWin(4, 5);
                                            break;
                                        case 5:
                                            continueGame(5, 2);
                                            playerWin(4);
                                            break;
                                        default:
                                            no();
                                            break;
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
                                        break;
                                    case 6:
                                        continueGame(6, 5);
                                        tie(8);
                                        break;
                                    case 8:
                                        compWin(8, 6);
                                        break;
                                }
                                break;
                            case 3:
                                continueGame(3, 2);
                                ask();
                                move = input.nextInt();
                                switch (move) {
                                    case 5:
                                        playerWin(5);
                                        break;
                                    case 6:
                                        continueGame(6, 5);
                                        tie(8);
                                        break;
                                    case 8:
                                        continueGame(8, 5);
                                        tie(6);
                                        break;
                                    default:
                                        no();
                                        break;
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
                                        break;
                                    case 6:
                                        continueGame(6, 2);
                                        tie(8);
                                        break;
                                    case 8:
                                        compWin(8, 6);
                                        break;
                                    default:
                                        no();
                                        break;
                                }
                            case 6:
                                continueGame(6, 5);
                                ask();
                                move = input.nextInt();
                                switch (move) {
                                    case 2:
                                        continueGame(2, 3);
                                        tie(8);
                                        break;
                                    case 3:
                                        continueGame(3, 2);
                                        tie(8);
                                        break;
                                    case 8:
                                        continueGame(8, 2);
                                        tie(3);
                                        break;
                                    default:
                                        no();
                                        break;
                                }
                            case 8:
                                continueGame(8, 3);
                                ask();
                                move = input.nextInt();
                                switch (move) {
                                    case 2:
                                        compWin(2, 6);
                                        break;
                                    case 5:
                                        compWin(5, 6);
                                        break;
                                    case 6:
                                        continueGame(6, 2);
                                        tie(5);
                                        break;
                                    default:
                                        no();
                                        break;
                                }
                            default:
                                no();
                                break;
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
                                break;
                            case 4:
                                compWin(2, 6);
                                break;
                            case 5:
                                compWin(2, 6);
                                break;
                            case 6:
                                continueGame(6, 5);
                                ask();
                                move = input.nextInt();
                                switch(move) {
                                    case 2:
                                        compWin(2, 7);
                                        break;
                                    case 4:
                                        compWin(2, 7);
                                        break;
                                    case 7:
                                        continueGame(7, 4);
                                        tie(2);
                                        break;
                                    default:
                                        no();
                                        break;
                                }
                            case 7:
                                compWin(2, 6);
                                break;
                            default:
                                no();
                                break;
                        }
                        break;
                    default:
                        no();
                        break;
                }
                break;
                //done @9:58
            case 2:
                continueGame(2, 9);
                ask();
                move = input.nextInt();
                switch(move) {
                    case 1:
                        continueGame(1, 3);
                        ask();
                        move = input.nextInt();
                        switch(move) {
                            case 4:
                                compWin(4, 6);
                                break;
                            case 5:
                                compWin(5, 6);
                                break;
                            case 6:
                                continueGame(6, 5);
                                ask();
                                move = input.nextInt();
                                switch(move) {
                                    case 4:
                                        compWin(4, 7);
                                        break;
                                    case 7:
                                        continueGame(7,4);
                                        tie(8);
                                        break;
                                    case 8:
                                        compWin(8, 7);
                                        break;
                                    default:
                                        no();
                                        break;
                                }
                            case 7:
                                compWin(7, 6);
                                break;
                            case 8:
                                compWin(8, 6);
                                break;
                            default:
                                no();
                                break;
                        }
                    case 3:
                        continueGame(3, 1);
                        ask();
                        move = input.nextInt();
                        switch(move) {
                            case 4:
                                compWin(4, 5);
                                break;
                            case 5:
                                continueGame(5, 8);
                                ask();
                                move = input.nextInt();
                                switch(move) {
                                    case 4:
                                        compWin(4, 7);
                                        break;
                                    case 6:
                                        compWin(6, 7);
                                        break;
                                    case 7:
                                        playerWin(7);
                                        break;
                                    default: 
                                        no();
                                        break;
                                }
                                break;
                            case 6:
                                compWin(6, 5);
                                break;
                            case 7:
                                compWin(7, 5);
                                break;
                            case 8:
                                compWin(8, 5);
                                break;
                            default:
                                no();
                                break;
                        }
                    case 4:
                        continueGame(4, 1);
                        ask();
                        move = input.nextInt();
                        switch(move) {
                            case 3:
                                compWin(3, 5);
                                break;
                            case 5:
                                continueGame(5,6);
                                ask();
                                move = input.nextInt();
                                switch(move) {
                                    case 3:
                                        continueGame(3,8);
                                        playerWin(7);
                                        break;
                                    case 7:
                                        compWin(7, 3);
                                        break;
                                    case 8:
                                        compWin(8, 3);
                                        break;
                                    default:
                                        no();
                                        break;
                                }
                            case 6:
                                compWin(3, 5);
                                break;
                            case 7:
                                compWin(3, 5);
                                break;
                            case 8:
                                compWin(3, 5);
                                break;
                            default:
                                no();
                                break;
                        }
                        break;
                        //done @10:33
                    case 5:
                        continueGame(5, 8);
                        ask();
                        move = input.nextInt();
                        switch(move) {
                            case 1:
                                compWin(1, 7);
                                break;
                            case 3:
                                compWin(3, 7);
                                break;
                            case 4:
                                compWin(4, 7);
                                break;
                            case 6:
                                compWin(6, 7);
                                break;
                            case 7:
                                continueGame(7, 4);
                                ask();
                                move = input.nextInt();
                                switch(move) {
                                    case 3:
                                        playerWin(3);
                                        break;
                                    case 6:
                                        playerWin(6);
                                        break;
                                    default:
                                        no();
                                        break;
                                }
                            default:
                                no();
                                break;
                        }
                        break;
                        //done @10:39
                    case 6:
                        continueGame(6, 1);
                        ask();
                        move = input.nextInt();
                        switch(move) {
                            case 3:
                                compWin(3, 5);
                                break;
                            case 4:
                                compWin(4, 5);
                                break;
                            case 5:
                                continueGame(5, 8);
                                ask();
                                move = input.nextInt();
                                switch(move) {
                                    case 3:
                                        compWin(3, 7);
                                        break;
                                    case 4:
                                        playerWin(4);
                                        break;
                                    case 7:
                                        continueGame(7, 3);
                                        playerWin(4);
                                        break;
                                    default:
                                        no();
                                        break;
                                }
                            case 7:
                                compWin(7, 5);
                                break;
                            case 8:
                                compWin(8, 5);
                                break;
                            default:
                                no();
                                break;
                        }
                        break;
                    case 7:
                        continueGame(7, 5);
                        ask();
                        move = input.nextInt();
                        switch(move) {
                            case 1:
                                continueGame(1, 3);
                                ask();
                                move = input.nextInt();
                                switch(move) {
                                    case 4:
                                        playerWin(4);
                                        break;
                                    case 6:
                                        continueGame(6, 4);
                                        tie(8);
                                        break;
                                    case 8:
                                        compWin(8, 6);
                                        break;
                                    default:
                                        no();
                                        break;
                                }
                                break;
                            case 3:
                                compWin(3, 1);
                                break;
                            case 4:
                                compWin(4, 1);
                                break;
                            case 6:
                                compWin(6, 1);
                                break;
                            case 8:
                                compWin(8, 1);
                                break;
                            default:
                                no();
                                break;
                        }
                    case 8:
                        continueGame(8, 5);
                        ask();
                        move = input.nextInt();
                        switch(move) {
                            case 1:
                                continueGame(1, 3);
                                ask();
                                move = input.nextInt();
                                switch(move) {
                                    case 4:
                                        compWin(4, 6);
                                        break;
                                    case 6:
                                        continueGame(6, 4);
                                        tie(7);
                                        break;
                                    case 7:
                                        compWin(7, 6);
                                        break;
                                    default:
                                        no();
                                        break;
                                }
                            case 3:
                                compWin(3, 1);
                                break;
                            case 4:
                                compWin(4, 1);
                                break;
                            case 5:
                                compWin(5, 1);
                                break;
                            case 6:
                                compWin(6, 1);
                                break;
                            case 7:
                                compWin(7, 1);
                                break;
                            default:
                                no();
                                break;
                        }
                    default:
                        no();
                        break;
                }
                break;
                //done @11:06
                case 3:
                continueGame(3, 7);   
                ask();
                move = input.nextInt();
                switch (move) {
                    case 1:
                        continueGame(1, 2);   
                        ask();
                        move = input.nextInt();
                        switch (move) {
                            case 4:
                                continueGame(4, 8);
                                ask();
                                move = input.nextInt();
                                switch (move) {
                                    case 5:
                                        compWin(5, 9);
                                        break;
                                    case 6:
                                        compWin(6, 9);
                                        break;
                                    case 9:
                                        compWin(9, 5);
                                        break;
                                    default:
                                        no();
                                        break;
                                }
                                break;
                            case 5:
                                continueGame(5, 9);
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
                                        break;
                                    default:
                                        no();
                                        break;
                                }
                                break;
                            case 6:
                                continueGame(6, 9);
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
                                        break;
                                    default:
                                        no();
                                        break;
                                }
                                break;
                            case 8:
                                compWin(8, 5);
                                break;
                            case 9:
                                compWin(9, 5);
                                break;
                            default:
                                no();
                                break;
                        }
                        break;
                    case 2:
                        continueGame(2, 1);
                        ask();
                        move = input.nextInt();
                        switch (move) {
                            case 4:
                                compWin(4, 5);
                                break;
                            case 5:
                                compWin(5, 4);
                                break;
                            case 6:
                                compWin(6, 5);
                                break;
                            case 8:
                                compWin(8, 5);
                                break;
                            case 9:
                                compWin(9, 5);
                                break;
                            default:
                                no();
                                break;
                        }
                        break;
                    case 4:
                        continueGame(4, 1);
                        ask();
                        move = input.nextInt();
                        switch (move) {
                            case 2:
                                compWin(2, 5);
                                break;
                            case 5:
                                continueGame(5, 8);
                                tie(6);
                                break;
                            case 6:
                                compWin(6, 5);
                                break;
                            case 8:
                                compWin(8, 5);
                                break;
                            case 9:
                                compWin(9, 5);
                                break;
                            default:
                                no();
                                break;
                        }
                        break;
                    case 5:
                        continueGame(5, 9);
                        ask();
                        move = input.nextInt();
                        switch (move) {
                            case 1:
                                compWin(1, 2);
                                break;
                            case 2:
                                compWin(2, 1);
                                break;
                            case 4:
                                compWin(4, 6);
                                break;
                            case 6:
                                compWin(6, 4);
                                break;
                            case 8:
                                continueGame(8, 4);
                                tie(6);
                                break;
                            default:
                                no();
                                break;
                        }
                        break;
                    case 6:
                        continueGame(6, 1);
                        ask();
                        move = input.nextInt();
                        switch (move) {
                            case 2:
                                compWin(2, 5);
                                break;
                            case 4:
                                compWin(4, 5);
                                break;
                            case 5:
                                continueGame(5, 8);
                                tie(4);
                                break;
                            case 8:
                                compWin(8, 5);
                                break;
                            case 9:
                                compWin(9, 5);
                                break;
                            default:
                                no();
                                break;
                        }
                        break;
                    case 8:
                        continueGame(8, 1);
                        ask();
                        move = input.nextInt();
                        switch (move) {
                            case 2:
                                compWin(2, 5);
                                break;
                            case 4:
                                compWin(4, 5);
                                break;
                            case 5:
                                continueGame(5, 4);
                                tie(6);
                                break;
                            case 6:
                                compWin(6, 5);
                                break;
                            case 9:
                                compWin(9, 5);
                                break;
                            default:
                                no();
                                break;
                        }
                        break;
                    case 9:
                        compWin(9, 5);
                        break;
                    default:
                        no();
                        break;
                }
                break;            
                case 4:
    continueGame(4, 1);
    ask();
    move = input.nextInt();
    switch (move) {
        case 2:
            continueGame(2, 3);
            ask();
            move = input.nextInt();
            switch (move) {
                case 5:
                    continueGame(5, 8);
                    ask();
                    move = input.nextInt();
                    switch (move) {
                        case 6:
                            compWin(6, 9);
                            break;
                        case 7:
                            compWin(7, 9);
                            break;
                        case 8:
                            tie(5);
                            break;
                        case 9:
                            compWin(9, 6);
                            break;
                        default:
                            no();
                            break;
                    }
                    break;
                case 6:
                    compWin(6, 9);
                    break;
                case 7:
                    compWin(7, 9);
                    break;
                case 8:
                    compWin(8, 5);
                    break;
                case 9:
                    compWin(9, 6);
                    break;
                default:
                    no();
                    break;
            }
            break;
        case 3:
            continueGame(3, 2);
            ask();
            move = input.nextInt();
            switch (move) {
                case 5:
                    continueGame(5, 8);
                    ask();
                    move = input.nextInt();
                    switch (move) {
                        case 6:
                            compWin(6, 9);
                            break;
                        case 7:
                            compWin(7, 9);
                            break;
                        case 8:
                            tie(5);
                            break;
                        case 9:
                            compWin(9, 6);
                            break;
                        default:
                            no();
                            break;
                    }
                    break;
                case 6:
                    compWin(6, 9);
                    break;
                case 7:
                    compWin(7, 9);
                    break;
                case 8:
                    compWin(8, 5);
                    break;
                case 9:
                    compWin(9, 6);
                    break;
                default:
                    no();
                    break;
            }
            break;
        case 5:
            continueGame(5, 8);
            ask();
            move = input.nextInt();
            switch (move) {
                case 1:
                    compWin(1, 2);
                    break;
                case 2:
                    compWin(2, 1);
                    break;
                case 3:
                    compWin(3, 6);
                    break;
                case 6:
                    compWin(6, 3);
                    break;
                case 7:
                    continueGame(7, 6);
                    tie(9);
                    break;
                case 8:
                    tie(5);
                    break;
                case 9:
                    continueGame(9, 6);
                    tie(7);
                    break;
                default:
                    no();
                    break;
            }
            break;
        case 6:
            continueGame(6, 3);
            ask();
            move = input.nextInt();
            switch (move) {
                case 1:
                    compWin(1, 2);
                    break;
                case 2:
                    tie(6);
                    break;
                case 3:
                    tie(6);
                    break;
                case 5:
                    continueGame(5, 8);
                    tie(4);
                    break;
                case 7:
                    compWin(7, 9);
                    break;
                case 8:
                    compWin(8, 5);
                    break;
                case 9:
                    tie(6);
                    break;
                default:
                    no();
                    break;
            }
            break;
        case 7:
            continueGame(7, 5);
            ask();
            move = input.nextInt();
            switch (move) {
                case 1:
                    compWin(1, 2);
                    break;
                case 2:
                    tie(7);
                    break;
                case 3:
                    compWin(3, 6);
                    break;
                case 5:
                    tie(7);
                    break;
                case 6:
                    compWin(6, 3);
                    break;
                case 8:
                    compWin(8, 9);
                    break;
                case 9:
                    tie(7);
                    break;
                default:
                    no();
                    break;
            }
            break;
        case 8:
            continueGame(8, 5);
            ask();
            move = input.nextInt();
            switch (move) {
                case 1:
                    compWin(1, 2);
                    break;
                case 2:
                    tie(8);
                    break;
                case 3:
                    compWin(3, 6);
                    break;
                case 5:
                    tie(8);
                    break;
                case 6:
                    compWin(6, 3);
                    break;
                case 7:
                    compWin(7, 9);
                    break;
                case 9:
                    tie(8);
                    break;
                default:
                    no();
                    break;
            }
            break;
        case 9:
            continueGame(9, 6);
            ask();
            move = input.nextInt();
            switch (move) {
                case 1:
                    compWin(1, 2);
                    break;
                case 2:
                    tie(9);
                    break;
                case 3:
                    compWin(3, 6);
                    break;
                case 5:
                    tie(9);
                    break;
                case 6:
                    tie(9);
                    break;
                case 7:
                    compWin(7, 4);
                    break;
                case 8:
                    compWin(8, 5);
                    break;
                default:
                    no();
                    break;
            }
            break;
        default:
            no();
            break;
    }
    break;          
            case 5:
                continueGame(5, 1);
                            ask();
                            move = input.nextInt();
                            switch (move) {
                                case 2:
                                    continueGame(2, 3);
                                    ask();
                                    move = input.nextInt();
                                    switch (move) {
                                        case 4:
                                            compWin(4, 7);
                                            break;
                                        case 6:
                                            compWin(6, 9);
                                            break;
                                        case 7:
                                            continueGame(7, 4);
                                            ask();
                                            move = input.nextInt();
                                            switch (move) {
                                                case 4:
                                                    tie(7);
                                                    break;
                                                case 9:
                                                    compWin(9, 6);
                                                    break;
                                                default:
                                                    no();
                                                    break;
                                            }
                                            break;
                                        case 8:
                                            compWin(8, 6);
                                            break;
                                        case 9:
                                            compWin(9, 6);
                                            break;
                                        default:
                                            no();
                                            break;
                                    }
                                    break;
                                case 3:
                                    continueGame(3, 2);
                                    ask();
                                    move = input.nextInt();
                                    switch (move) {
                                        case 1:
                                            compWin(1, 7);
                                            break;
                                        case 4:
                                            compWin(4, 7);
                                            break;
                                        case 6:
                                            continueGame(6, 9);
                                            ask();
                                            move = input.nextInt();
                                            switch (move) {
                                                case 1:
                                                    compWin(1, 7);
                                                    break;
                                                case 7:
                                                    tie(6);
                                                    break;
                                                case 9:
                                                    compWin(9, 7);
                                                    break;
                                                default:
                                                    no();
                                                    break;
                                            }
                                            break;
                                        case 7:
                                            continueGame(7, 4);
                                            ask();
                                            move = input.nextInt();
                                            switch (move) {
                                                case 1:
                                                    compWin(1, 2);
                                                    break;
                                                case 2:
                                                    tie(7);
                                                    break;
                                                case 4:
                                                    tie(7);
                                                    break;
                                                default:
                                                    no();
                                                    break;
                                            }
                                            break;
                                        case 8:
                                            compWin(8, 4);
                                            break;
                                        case 9:
                                            compWin(9, 6);
                                            break;
                                        default:
                                            no();
                                            break;
                                    }
                                    break;
                                case 1:
                                    continueGame(1, 2);
                                    ask();
                                    move = input.nextInt();
                                    switch (move) {
                                        case 3:
                                            compWin(3, 6);
                                            break;
                                        case 4:
                                            compWin(4, 7);
                                            break;
                                        case 6:
                                            compWin(6, 3);
                                            break;
                                        case 7:
                                            continueGame(7, 4);
                                            ask();
                                            move = input.nextInt();
                                            switch (move) {
                                                case 3:
                                                    tie(7);
                                                    break;
                                                case 4:
                                                    tie(7);
                                                    break;
                                                case 8:
                                                    compWin(8, 6);
                                                    break;
                                                default:
                                                    no();
                                                    break;
                                            }
                                            break;
                                        case 8:
                                            compWin(8, 6);
                                            break;
                                        case 9:
                                            compWin(9, 3);
                                            break;
                                        default:
                                            no();
                                            break;
                                    }
                                    break;
                                case 4:
                                    continueGame(4, 7);
                                    ask();
                                    move = input.nextInt();
                                    switch (move) {
                                        case 1:
                                            compWin(1, 2);
                                            break;
                                        case 2:
                                            compWin(2, 1);
                                            break;
                                        case 3:
                                            compWin(3, 6);
                                            break;
                                        case 6:
                                            compWin(6, 3);
                                            break;
                                        case 7:
                                            continueGame(7, 4);
                                            tie(8);
                                            break;
                                        case 8:
                                            compWin(8, 6);
                                            break;
                                        case 9:
                                            compWin(9, 6);
                                            break;
                                        default:
                                            no();
                                            break;
                                    }
                                    break;
                                case 6:
                                    continueGame(6, 3);
                                    ask();
                                    move = input.nextInt();
                                    switch (move) {
                                        case 1:
                                            compWin(1, 2);
                                            break;
                                        case 2:
                                            continueGame(2, 1);
                                            tie(3);
                                            break;
                                        case 3:
                                            tie(6);
                                            break;
                                        case 4:
                                            compWin(4, 7);
                                            break;
                                        case 7:
                                            continueGame(7, 4);
                                            tie(8);
                                            break;
                                        case 8:
                                            compWin(8, 4);
                                            break;
                                        case 9:
                                            continueGame(9, 3);
                                            tie(8);
                                            break;
                                        default:
                                            no();
                                            break;
                                    }
                                    break;
                                case 7:
                                    continueGame(7, 4);
                                    ask();
                                    move = input.nextInt();
                                    switch (move) {
                                        case 1:
                                            compWin(1, 2);
                                            break;
                                        case 2:
                                            tie(7);
                                            break;
                                        case 3:
                                            tie(7);
                                            break;
                                        case 6:
                                            compWin(6, 3);
                                            break;
                                        case 8:
                                            compWin(8, 6);
                                            break;
                                        case 9:
                                            compWin(9, 6);
                                            break;
                                        default:
                                            no();
                                            break;
                                    }
                                    break;
                                case 8:
                                    continueGame(8, 4);
                                    ask();
                                    move = input.nextInt();
                                    switch (move) {
                                        case 1:
                                            compWin(1, 2);
                                            break;
                                        case 2:
                                            tie(8);
                                            break;
                                        case 3:
                                            compWin(3, 6);
                                            break;
                                        case 4:
                                            tie(8);
                                            break;
                                        case 6:
                                            compWin(6, 3);
                                            break;
                                        case 7:
                                            compWin(7, 4);
                                            break;
                                        case 9:
                                            compWin(9, 6);
                                            break;
                                        default:
                                            no();
                                            break;
                                    }
                                    break;
                                case 9:
                                    continueGame(9, 6);
                                    ask();
                                    move = input.nextInt();
                                    switch (move) {
                                        case 1:
                                            compWin(1, 2);
                                            break;
                                        case 2:
                                            tie(9);
                                            break;
                                        case 3:
                                            compWin(3, 6);
                                            break;
                                        case 4:
                                            compWin(4, 7);
                                            break;
                                        case 6:
                                            tie(9);
                                            break;
                                        case 7:
                                            compWin(7, 4);
                                            break;
                                        case 8:
                                            compWin(8, 6);
                                            break;
                                        default:
                                            no();
                                            break;
                                    }
                                    break;
                                default:
                                    no();
                                    break;
                            }
                            break;
                            case 6:
                            continueGame(6, 3);
                            ask();
                            move = input.nextInt();
                            switch (move) {
                                case 1:
                                    continueGame(1, 2);
                                    ask();
                                    move = input.nextInt();
                                    switch (move) {
                                        case 4:
                                            continueGame(4, 7);
                                            ask();
                                            move = input.nextInt();
                                            switch (move) {
                                                case 5: compWin(5, 8); break;
                                                case 7: tie(4); break;
                                                case 8: compWin(8, 5); break;
                                                case 9: compWin(9, 5); break;
                                                default: no(); break;
                                            }
                                            break;
                                        case 5: 
                                            continueGame(5, 8);
                                            ask();
                                            move = input.nextInt();
                                            switch (move) {
                                                case 4: compWin(4, 7); break;
                                                case 7: compWin(7, 4); break;
                                                case 8: tie(5); break;
                                                case 9: compWin(9, 4); break;
                                                default: no(); break;
                                            }
                                            break;
                                        case 7: 
                                            continueGame(7, 4);
                                            ask();
                                            move = input.nextInt();
                                            switch (move) {
                                                case 4: tie(7); break;
                                                case 5: compWin(5, 8); break;
                                                case 8: tie(7); break;
                                                case 9: compWin(9, 5); break;
                                                default: no(); break;
                                            }
                                            break;
                                        case 8: compWin(8, 5); break;
                                        case 9: compWin(9, 5); break;
                                        default: no(); break;
                                    }
                                    break;
                        
                                case 2:
                                    continueGame(2, 1);
                                    ask();
                                    move = input.nextInt();
                                    switch (move) {
                                        case 4: continueGame(4, 7); 
                                            ask();
                                            move = input.nextInt();
                                            switch (move) {
                                                case 5: compWin(5, 8); break;
                                                case 7: tie(4); break;
                                                case 8: compWin(8, 5); break;
                                                case 9: compWin(9, 5); break;
                                                default: no(); break;
                                            }
                                            break;
                                        case 5: continueGame(5, 8);
                                            ask();
                                            move = input.nextInt();
                                            switch (move) {
                                                case 4: compWin(4, 7); break;
                                                case 7: compWin(7, 4); break;
                                                case 8: tie(5); break;
                                                case 9: compWin(9, 4); break;
                                                default: no(); break;
                                            }
                                            break;
                                        case 7: continueGame(7, 4);
                                            ask();
                                            move = input.nextInt();
                                            switch (move) {
                                                case 4: tie(7); break;
                                                case 5: compWin(5, 8); break;
                                                case 8: tie(7); break;
                                                case 9: compWin(9, 5); break;
                                                default: no(); break;
                                            }
                                            break;
                                        case 8: compWin(8, 5); break;
                                        case 9: compWin(9, 5); break;
                                        default: no(); break;
                                    }
                                    break;
                        
                                case 3: tie(6); break; // Already occupied by computer
                                case 4:
                                    continueGame(4, 7);
                                    ask();
                                    move = input.nextInt();
                                    switch (move) {
                                        case 1: continueGame(1, 2); tie(5); break;
                                        case 2: continueGame(2, 1); tie(5); break;
                                        case 5: continueGame(5, 8); tie(4); break;
                                        case 7: tie(4); break;
                                        case 8: tie(5); break;
                                        case 9: continueGame(9, 5); tie(7); break;
                                        default: no(); break;
                                    }
                                    break;
                        
                                case 5:
                                    continueGame(5, 8);
                                    ask();
                                    move = input.nextInt();
                                    switch (move) {
                                        case 1: continueGame(1, 2); tie(4); break;
                                        case 2: continueGame(2, 1); tie(4); break;
                                        case 4: continueGame(4, 7); tie(5); break;
                                        case 7: compWin(7, 4); break;
                                        case 8: tie(5); break;
                                        case 9: continueGame(9, 4); tie(7); break;
                                        default: no(); break;
                                    }
                                    break;
                        
                                case 7:
                                    continueGame(7, 4);
                                    ask();
                                    move = input.nextInt();
                                    switch (move) {
                                        case 1: continueGame(1, 2); tie(5); break;
                                        case 2: continueGame(2, 1); tie(5); break;
                                        case 4: tie(7); break;
                                        case 5: compWin(5, 8); break;
                                        case 8: tie(7); break;
                                        case 9: continueGame(9, 5); tie(8); break;
                                        default: no(); break;
                                    }
                                    break;
                        
                                case 8: continueGame(8, 5); tie(6); break;
                                case 9: continueGame(9, 4); tie(7); break;
                                default: no(); break;
                            }
                            break;
                        
                            case 7:
                            continueGame(7, 4); // Player X at 7, computer O at 4
                            ask();
                            move = input.nextInt();
                            switch (move) {
                                case 1:
                                    continueGame(1, 2);
                                    ask();
                                    move = input.nextInt();
                                    switch (move) {
                                        case 3: compWin(3, 6); break;
                                        case 5: continueGame(5, 8); tie(6); break;
                                        case 6: compWin(6, 3); break;
                                        case 8: tie(5); break;
                                        case 9: compWin(9, 6); break;
                                        default: no(); break;
                                    }
                                    break;
                        
                                case 2:
                                    continueGame(2, 1);
                                    ask();
                                    move = input.nextInt();
                                    switch (move) {
                                        case 3: compWin(3, 6); break;
                                        case 5: continueGame(5, 8); tie(6); break;
                                        case 6: compWin(6, 3); break;
                                        case 8: tie(5); break;
                                        case 9: compWin(9, 6); break;
                                        default: no(); break;
                                    }
                                    break;
                        
                                case 3:
                                    continueGame(3, 6);
                                    ask();
                                    move = input.nextInt();
                                    switch (move) {
                                        case 1: tie(3); break;
                                        case 2: tie(3); break;
                                        case 5: continueGame(5, 8); tie(6); break;
                                        case 8: tie(5); break;
                                        case 9: compWin(9, 6); break;
                                        default: no(); break;
                                    }
                                    break;
                        
                                case 4: tie(7); break; // Already occupied by computer
                                case 5:
                                    continueGame(5, 8);
                                    ask();
                                    move = input.nextInt();
                                    switch (move) {
                                        case 1: continueGame(1, 2); tie(4); break;
                                        case 2: continueGame(2, 1); tie(4); break;
                                        case 3: compWin(3, 6); break;
                                        case 6: compWin(6, 3); break;
                                        case 8: tie(5); break;
                                        case 9: continueGame(9, 6); tie(8); break;
                                        default: no(); break;
                                    }
                                    break;
                        
                                case 6: compWin(6, 3); break;
                                case 8: tie(5); break;
                                case 9:
                                    continueGame(9, 6);
                                    ask();
                                    move = input.nextInt();
                                    switch (move) {
                                        case 1: continueGame(1, 2); tie(5); break;
                                        case 2: continueGame(2, 1); tie(5); break;
                                        case 3: compWin(3, 6); break;
                                        case 5: continueGame(5, 8); tie(6); break;
                                        case 6: compWin(6, 3); break;
                                        case 8: tie(5); break;
                                        default: no(); break;
                                    }
                                    break;
                        
                                default:
                                    no();
                                    break;
                            }
                            break;
                        
                            case 8:
                            continueGame(8, 5); // Player X at 8, computer O at 5
                            ask();
                            move = input.nextInt();
                            switch (move) {
                                case 1:
                                    continueGame(1, 2);
                                    ask();
                                    move = input.nextInt();
                                    switch (move) {
                                        case 3: compWin(3, 6); break;
                                        case 4: continueGame(4, 7); tie(6); break;
                                        case 6: compWin(6, 3); break;
                                        case 7: tie(4); break;
                                        case 9: continueGame(9, 6); tie(7); break;
                                        default: no(); break;
                                    }
                                    break;
                        
                                case 2:
                                    continueGame(2, 1);
                                    ask();
                                    move = input.nextInt();
                                    switch (move) {
                                        case 3: compWin(3, 6); break;
                                        case 4: continueGame(4, 7); tie(6); break;
                                        case 6: compWin(6, 3); break;
                                        case 7: tie(4); break;
                                        case 9: continueGame(9, 6); tie(7); break;
                                        default: no(); break;
                                    }
                                    break;
                        
                                case 3:
                                    continueGame(3, 6);
                                    ask();
                                    move = input.nextInt();
                                    switch (move) {
                                        case 1: tie(3); break;
                                        case 2: tie(3); break;
                                        case 4: continueGame(4, 7); tie(6); break;
                                        case 6: compWin(6, 3); break;
                                        case 7: tie(4); break;
                                        case 9: continueGame(9, 6); tie(7); break;
                                        default: no(); break;
                                    }
                                    break;
                        
                                case 4:
                                    continueGame(4, 7);
                                    ask();
                                    move = input.nextInt();
                                    switch (move) {
                                        case 1: continueGame(1, 2); tie(3); break;
                                        case 2: continueGame(2, 1); tie(3); break;
                                        case 3: continueGame(3, 6); tie(4); break;
                                        case 6: compWin(6, 3); break;
                                        case 7: tie(4); break;
                                        case 9: continueGame(9, 6); tie(7); break;
                                        default: no(); break;
                                    }
                                    break;
                        
                                case 5: tie(8); break; // Already occupied by computer
                        
                                case 6: compWin(6, 3); break;
                        
                                case 7:
                                    continueGame(7, 4);
                                    ask();
                                    move = input.nextInt();
                                    switch (move) {
                                        case 1: continueGame(1, 2); tie(3); break;
                                        case 2: continueGame(2, 1); tie(3); break;
                                        case 3: continueGame(3, 6); tie(4); break;
                                        case 4: tie(7); break;
                                        case 5: compWin(5, 8); break;
                                        case 9: continueGame(9, 6); tie(5); break;
                                        default: no(); break;
                                    }
                                    break;
                        
                                case 9:
                                    continueGame(9, 6);
                                    ask();
                                    move = input.nextInt();
                                    switch (move) {
                                        case 1: continueGame(1, 2); tie(3); break;
                                        case 2: continueGame(2, 1); tie(3); break;
                                        case 3: continueGame(3, 6); tie(4); break;
                                        case 4: continueGame(4, 7); tie(6); break;
                                        case 5: compWin(5, 8); break;
                                        case 6: compWin(6, 3); break;
                                        case 7: continueGame(7, 4); tie(5); break;
                                        default: no(); break;
                                    }
                                    break;
                        
                                default:
                                    no();
                                    break;
                            }
                            break;
                        
                            case 9:
                            continueGame(9, 1); // Player X at 9, computer O at 1
                            ask();
                            move = input.nextInt();
                            switch (move) {
                                case 2:
                                    continueGame(2, 3);
                                    ask();
                                    move = input.nextInt();
                                    switch (move) {
                                        case 4: continueGame(4, 7); tie(5); break;
                                        case 5: continueGame(5, 8); tie(4); break;
                                        case 6: compWin(6, 3); break;
                                        case 7: tie(4); break;
                                        case 8: tie(5); break;
                                        default: no(); break;
                                    }
                                    break;
                        
                                case 3:
                                    continueGame(3, 2);
                                    ask();
                                    move = input.nextInt();
                                    switch (move) {
                                        case 4: continueGame(4, 7); tie(5); break;
                                        case 5: continueGame(5, 8); tie(4); break;
                                        case 6: compWin(6, 3); break;
                                        case 7: tie(4); break;
                                        case 8: tie(5); break;
                                        default: no(); break;
                                    }
                                    break;
                        
                                case 4:
                                    continueGame(4, 7);
                                    ask();
                                    move = input.nextInt();
                                    switch (move) {
                                        case 2: continueGame(2, 3); tie(5); break;
                                        case 3: continueGame(3, 2); tie(5); break;
                                        case 5: continueGame(5, 8); tie(6); break;
                                        case 6: compWin(6, 3); break;
                                        case 7: tie(4); break;
                                        case 8: tie(5); break;
                                        default: no(); break;
                                    }
                                    break;
                        
                                case 5:
                                    continueGame(5, 8);
                                    ask();
                                    move = input.nextInt();
                                    switch (move) {
                                        case 2: continueGame(2, 3); tie(4); break;
                                        case 3: continueGame(3, 2); tie(4); break;
                                        case 4: continueGame(4, 7); tie(6); break;
                                        case 6: compWin(6, 3); break;
                                        case 7: tie(4); break;
                                        case 8: tie(5); break;
                                        default: no(); break;
                                    }
                                    break;
                        
                                case 6:
                                    continueGame(6, 3);
                                    ask();
                                    move = input.nextInt();
                                    switch (move) {
                                        case 2: continueGame(2, 1); tie(5); break;
                                        case 3: compWin(3, 6); break;
                                        case 4: continueGame(4, 7); tie(5); break;
                                        case 5: continueGame(5, 8); tie(4); break;
                                        case 7: tie(4); break;
                                        case 8: tie(5); break;
                                        default: no(); break;
                                    }
                                    break;
                        
                                case 7:
                                    continueGame(7, 4);
                                    ask();
                                    move = input.nextInt();
                                    switch (move) {
                                        case 2: continueGame(2, 3); tie(5); break;
                                        case 3: continueGame(3, 6); tie(4); break;
                                        case 4: tie(7); break;
                                        case 5: continueGame(5, 8); tie(6); break;
                                        case 6: compWin(6, 3); break;
                                        case 8: tie(5); break;
                                        default: no(); break;
                                    }
                                    break;
                        
                                case 8:
                                    continueGame(8, 5);
                                    ask();
                                    move = input.nextInt();
                                    switch (move) {
                                        case 2: continueGame(2, 3); tie(4); break;
                                        case 3: continueGame(3, 6); tie(4); break;
                                        case 4: continueGame(4, 7); tie(6); break;
                                        case 5: tie(8); break;
                                        case 6: compWin(6, 3); break;
                                        case 7: continueGame(7, 4); tie(5); break;
                                        default: no(); break;
                                    }
                                    break;
                        
                                case 9: tie(9); break; // Already occupied by player
                        
                                default:
                                    no();
                                    break;
                            }
                            break;
                        
            default:
                no();
                break;
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
        System.out.println("You put an \"X\" on " + playerMove + " and the computer WON by putting an \"O\" on " + compMove + ".");
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


