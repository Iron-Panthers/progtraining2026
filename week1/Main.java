import java.util.Scanner;

public class Main{
    public static void main (String [] args){
        Scanner word = new Scanner(System.in);
        System.out.println("write an adjective");
        String adj = word.nextLine();
        System.out.println("write a noun");
        String noun = word.nextLine();
        System.out.println("write a verb");
        String verb = word.nextLine();
        System.out.println("write an adverb");
        String adverb = word.nextLine();
        System.out.println("write a preposition");
        String preposition = word.nextLine();
        System.out.println("write a possessive pronoun");
        String pronoun = word.nextLine();
        System.out.println("write a conjunction");
        String conjunction = word.nextLine();
        System.out.println("write a number");
        int number = word.nextInt();
        System.out.println("the " + adj + " " + noun + " " + adverb + " " + verb + " " + preposition + " the " + number + " dogs, " + conjunction + " the owner and " + pronoun + " dogs bit off the " + noun + "'s leg.");
        word.close();
    }
}