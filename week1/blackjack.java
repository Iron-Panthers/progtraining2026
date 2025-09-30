import java.util.Random;
import java.util.Scanner;
public class blackjack {
    private String suit;
    private int num;
    private int value;

    public blackjack(String suit, int num, int value){
        this.suit = suit;
        this.num = num;
        this.value = value;
    }
    public String getSuit(){
        return suit;
    }
    public int getNum(){
        return num;
    }
    public int getValue(){
        return value;
    }

    @Override
    public String toString(){
        return "blackjack [suit: " + suit + ", num: " + num + ", value: " + value + "]";
    }

    public static void main (String [] args){
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

        for (int card = 51; card >= 0; card--){
            System.out.println(deck[card]);
        }

        Random rand = new Random(52);
        Scanner input = new Scanner(System.in);

        System.out.println("draw a card?");
    }
}