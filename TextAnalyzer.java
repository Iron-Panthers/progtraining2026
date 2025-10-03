import java.util.Scanner;

public class TextAnalyzer {

    public static boolean isPalindrome(String word) {
        char newChar;
        String newWord = "";
        for (int i = 0; i < word.length(); i++) {
            newChar = word.charAt(i);
            newWord = newChar + newWord;
        }
        if (newWord.equals(word)) {
            return true;
        }
        else {
            return false;
        }
    }

    public static int countVowels(String word) {
        int vowelCount = 0;
        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            switch (letter) {
                case 'a':
                    vowelCount++;
                    break;
                case 'e':
                    vowelCount++;
                    break;
                case 'i':
                    vowelCount++;
                    break;
                case 'o':
                    vowelCount++;
                    break;
                case 'u':
                    vowelCount++;
                    break;
                default:
                    vowelCount = vowelCount;
            }
        }
        return vowelCount;
    }

    public static String reverse(String word) {
        char newChar;
        String newWord = "";
        for (int i = 0; i < word.length(); i++) {
            newChar = word.charAt(i);
            newWord = newChar + newWord;
        }
        return newWord;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your word?");

        String userIn = input.nextLine();
        boolean palindrome = isPalindrome(userIn);
        if (palindrome) {
            System.out.println("Your word is a palindrome!");
        }
        else {
            System.out.println("Your word is not a palindrome.");
        }

        int numVowels = countVowels(userIn);
        System.out.println("Your word has " + numVowels + " vowels in it.");
        String reverseWord = reverse(userIn);
        System.out.println("The reverse of your word is " + reverseWord);
    }
}
