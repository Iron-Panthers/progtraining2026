import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class Memory {
    private int value;
    private String flipped = " ";
    private boolean isFlipped = false; //blank side is flipped
    private String pair;
    private boolean isPaired = false;

    public Memory(int value, String flipped, boolean isFlipped, String pair, boolean isPaired) {
        this.value = value;
        this.flipped = flipped;
        this.isFlipped = isFlipped;
        this.pair = pair;
        this.isPaired = isPaired;
    }

    public int getValue(Memory card) {
        return card.value; //used for printing the front side of card
    }

    public boolean getFlipped(Memory card) {
        return card.isFlipped; //used to check which side of card to print
    }

    public void flipCard(Memory card) {
        if (card.isFlipped) {
            card.isFlipped = false;
        }
        else {
            card.isFlipped = true;
        }
    }

    public String getPair(Memory card) {
        return card.pair; //used to check pairs
    }

    public static boolean getIsPaired(Memory card) {
        return card.isPaired;
    }

    public static void makePair(Memory card1, Memory card2, int values) {
        if (!card1.isPaired && !card2.isPaired) {
            card1.value = values;
            card2.value = values;
            card1.isPaired = true;
            card2.isPaired = true;
        }
        //pair unpaired cards and set values
    }

    public static void printCard(Memory card) {
        if (card.isFlipped) {
            System.out.print("[" + card.flipped + "]");
        }
        else {
            System.out.print("[" + card.value + "]");
        }
        //will be used to print the card array
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int level = 0;

        ArrayList<ArrayList<Memory>> cards = new ArrayList<>();
        ArrayList<Memory> row1 = new ArrayList<>();
        for (int j = 0; j < 3; j++) {
            row1.add(new Memory(-1, " ", false, " ", false));
        }
        ArrayList<Memory> row2 = new ArrayList<>();
        for (int j = 0; j < 3; j++) {
            row2.add(new Memory(-1, " ", false, " ", false));
        } 
        cards.add(row1);
        cards.add(row2); //initialize stuff

        System.out.println("Hello! This is a simple memory game.");
        System.out.println("For a few seconds, there will be an array of cards with some values on them shown.");
        System.out.println("Afterwards, they will be flipped, your task is to match pairs of the same cards.");
        System.out.println("You get 3 points for every correct pair, but lose 1 point for every wrong match.");
        System.out.println("If you get everything right you get to move onto the next level, but you lose if you score a negative number.");
        System.out.println("Are you ready?");
        String ready = input.nextLine();
        if (ready.equalsIgnoreCase("no")) {
            return;
        }
        System.out.println("Good luck!"); //game instructions

        while (true) {
            int value = 0;
            int points = 0;

            while (true) {  //make all pairs and set values through makePair function
                int x1 = rand.nextInt(level + 3);
                int y1 = rand.nextInt(level + 2);
                int x2 = rand.nextInt(level + 3);
                int y2 = rand.nextInt(level + 2);

                if (x1 != x2 || y1 != y2) {
                    makePair(cards.get(y1).get(x1), cards.get(y2).get(x2), value);
                    value++;
                }

                boolean allPaired = true;
                for (int i = 0; i < level + 2; i++) {
                    for (int j = 0; j < level + 3; j++) {
                        if ((getIsPaired(cards.get(i).get(j))) == false) {
                            allPaired = false;
                        }
                    }
                }
                if (allPaired) {
                    break;
                }
            }

            for (int i = 0; i < level + 2; i++) { //print all the cards
                for (int j = 0; j < level + 3; j++) {
                    printCard(cards.get(i).get(j));
                }
                System.out.print("\n");
            }

            try { //wait for some amount of seconds and then makes array disappear
                Thread.sleep(5000);
            } catch (InterruptedException ie) {
                Thread.currentThread().interrupt();
            }
            System.out.print("\033[H\033[2J");
            System.out.print("\033[H\033[2J");

            for (int i = 0; i < level + 2; i++) {
                for (int j = 0; j < level + 3; j++) {
                    cards.get(i).get(j).isFlipped = true;
                    printCard(cards.get(i).get(j));
                }
                System.out.print("\n");
            }
            while (true) {
                //ask user to match cards and check (+potential scoring system?)
                System.out.println("What is the x-coordinate of your first card?");
                int guessX1 = input.nextInt();
                System.out.println("What is the y-coordinate of your first card?");
                int guessY1 = input.nextInt();
                input.nextLine();
                cards.get(guessY1-1).get(guessX1-1).isFlipped = false;

                for (int i = 0; i < level + 2; i++) {
                    for (int j = 0; j < level + 3; j++) {
                        printCard(cards.get(i).get(j));
                    }
                    System.out.print("\n");
                }
                
                System.out.println("What is the x-coordinate of your second card?");
                int guessX2 = input.nextInt();
                System.out.println("What is the y-coordinate of your second card?");
                int guessY2 = input.nextInt();
                input.nextLine();
                cards.get(guessY2-1).get(guessX2-1).isFlipped = false;

                for (int i = 0; i < level + 2; i++) {
                    for (int j = 0; j < level + 3; j++) {
                        printCard(cards.get(i).get(j));
                    }
                    System.out.print("\n");
                }

                if (cards.get(guessY1-1).get(guessX1-1).value == cards.get(guessY2-1).get(guessX2-1).value) {
                    System.out.println("That's correct!");
                    points += 3;
                }
                else {
                    System.out.println("Whoops! Try again");
                    cards.get(guessY1-1).get(guessX1-1).isFlipped = true;
                    cards.get(guessY2-1).get(guessX2-1).isFlipped = true;
                    for (int i = 0; i < level + 2; i++) {
                        for (int j = 0; j < level + 3; j++) {
                            printCard(cards.get(i).get(j));
                        }
                        System.out.print("\n");
                    }
                    points -= 1;
                }

                boolean allMatched = true;
                for (int i = 0; i < level + 2; i++) {
                    for (int j = 0; j < level + 3; j++) {
                        if (cards.get(i).get(j).isFlipped == true) {
                            allMatched = false;
                        }
                    }
                }
                if (allMatched) {
                    System.out.println("Congrats! You matched all the pairs!");
                    System.out.println("You got " + points + " points this round.");
                    break;
                }
            }

            if (points < 0) {
                System.out.println("Game over. \n You made too many wrong matches.");
                System.out.println("You got to level " + level + ".");
                return;
            }

            System.out.println("Continue to next level?");
            if (input.nextLine().equalsIgnoreCase("no")) {
                break;
            }
            level++;
            ArrayList<Memory> newRow = new ArrayList<>();
            for (int j = 0; j < 3; j++) {
                newRow.add(new Memory(-1, " ", false, " ", false));
            }
            cards.add(newRow);
            for (int i = 0; i < level + 2; i++) {
                cards.get(i).add(new Memory(-1, " ", false, " ", false));
            }
            //increase difficulty (+1 row and column for array)
        }
    }
}
