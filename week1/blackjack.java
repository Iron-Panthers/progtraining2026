//initialization
import java.util.Random;
import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class blackjack {
    //more initialization
    Random rand = new Random();
    Scanner input = new Scanner(System.in);

    //card attributes
    private String suit;
    private int num;
    private int value;

    //constructor
    public blackjack(String suit, int num, int value){
        this.suit = suit;
        this.num = num;
        this.value = value;
    }

    //"get" methods
    public String getSuit(){
        return suit;
    }
    public int getNum(){
        return num;
    }
    public int getValue(){
        return value;
    }

    //draws a card
    public int drawCard(int cardIndex, blackjack[] deckList, String user, ArrayList<blackjack> hand){
        while (deckList[cardIndex] == null){
            cardIndex = rand.nextInt(51);
        }
        if (user.equals("user")){
            System.out.println("ur card is " + deckList[cardIndex]);
            if (deckList[cardIndex].getValue() == 1){
                int userValue = 1;
                System.out.println("would u like ur ace to be worth 10 or 1?");
                int givenValue = input.nextInt();
                if (givenValue == 10){
                    userValue = givenValue;
                    value = userValue;
                }
            }
        }
        hand.add(deckList[cardIndex]);
        deckList[cardIndex] = null;
        while (deckList[cardIndex] == null){
            cardIndex = rand.nextInt(51);
        }
        return cardIndex;
    }

    //calculates the value of a hand
    public static int getHandValue(ArrayList<blackjack> hand){
        int runningValue = 0;
        for (int i = hand.size() - 1; i >= 0; i--){
            runningValue += hand.get(i).getValue();
        }
        return runningValue;
    }

    //prints out card
    @Override
    public String toString(){
        if (num <= 10 && num != 1){
            return num + " of " + suit;
        } else{
            if (num == 11){
                return "jack of " + suit;
            } else if (num == 12){
                return "queen of " + suit;
            } else if (num == 13){
                return "king of " + suit;
            } else {
                return "ace of " + suit;
            }
        }
    }

    public static void main (String [] args){
        //initialization
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        ArrayList<blackjack> userHand = new ArrayList<blackjack>();
        ArrayList<blackjack> dealerHand = new ArrayList<blackjack>();

        //creates card deck as an array
        blackjack currentCard;
        blackjack[] deck = new blackjack[52];
        int cardNum = 0;
        int currentValue = 0;
        
        while (cardNum < 52){
            for (int suitGenerator = 3; suitGenerator >= 0; suitGenerator--){
                String currentSuit;

                if (suitGenerator == 3){
                    currentSuit = "spades";
                }else if (suitGenerator == 2){
                    currentSuit = "hearts";
                }else if (suitGenerator == 1){
                    currentSuit = "diamonds";
                }else{
                    currentSuit = "clubs";
                }

                for (int numGenerator = 12; numGenerator >= 0; numGenerator--){
                    if ((numGenerator + 1) >= 10){
                        currentValue = 10;
                    } else{
                        currentValue = numGenerator + 1;
                    }
                    currentCard = new blackjack(currentSuit, (numGenerator+1), currentValue);
                    deck[cardNum] = currentCard;
                    cardNum += 1;
                }
            }
        }

        System.out.println("do u want to play blackjack?");
        String answer = input.nextLine();
        if (answer.equals("yes")){
            int newCard = rand.nextInt(51);

            //draws user's hand
            newCard = deck[newCard].drawCard(newCard, deck, "user", userHand);
            newCard = deck[newCard].drawCard(newCard, deck, "user", userHand);

            //draws dealer's hand
            newCard = deck[newCard].drawCard(newCard, deck, "dealer", dealerHand);
            newCard = deck[newCard].drawCard(newCard, deck, "dealer", dealerHand);
            
            //user plays
            while (getHandValue(userHand) <= 21){
                System.out.println("hit or stand?");
                String choice = input.nextLine();
                if (choice.equals("hit")){
                    newCard = deck[newCard].drawCard(newCard, deck, "user", userHand);
                } else if (choice.equals("stand")){
                    break;
                }
            }
            
            if (getHandValue(userHand) >= 21){
                System.out.println("bust! dealer wins, game over :(");
            } else{
                //dealer plays
                System.out.println("dealer's current hand: " + dealerHand.get(0) + " and " + dealerHand.get(1));
                while (getHandValue(dealerHand) <= 21){
                    if (getHandValue(dealerHand) <= 16){
                        newCard = deck[newCard].drawCard(newCard, deck, "dealer", dealerHand);
                        System.out.println("dealer drew " + dealerHand.get(dealerHand.size() - 1));
                    } else {
                        System.out.println("the dealer stands");
                        break;
                    }
                }
                if (getHandValue(dealerHand) >= 21){
                    System.out.println("dealer lost. you win! :D");
                }
            }
            
        } else{
            System.out.println("thanks 4 playing!");
        }
        input.close();
    }
}