import java.util.Arrays;
import java.util.Scanner;
import java.util.List;

public class analyzeText {
    public static String reverse(String text){
        String reversed = "";
        for (int i = text.length()-1; i >= 0; i--){
            reversed = reversed + text.charAt(i);
        }
        return reversed;
    }
    public static boolean isPalindrome(String text){
        String reversed = "";
        for (int i = text.length()-1; i >= 0; i--){
            reversed = reversed + text.charAt(i);
        }
        if (text.equals(reversed)){
            return true;
        } else{
            return false;
        }
    }
    public static int countVowels(String text){
        List<Character> vowels = Arrays.asList('a','e','i','o','u');
        int vowelCount = 0;
        for (int i = text.length() - 1; i >= 0; i--){
            for (int vowel = vowels.size() - 1; vowel >= 0; vowel--){
                if (text.charAt(i) == vowels.get(vowel)){
                    vowelCount += 1;
                }
            }
        }
        return vowelCount;
    }
    
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("is your string a palindrome?");
        String text = input.nextLine();
        System.out.println(isPalindrome(text));

        System.out.println("what's your text reversed?");
        text = input.nextLine();
        System.out.println(reverse(text));

        System.out.println("how many vowels are there?");
        text = input.nextLine();
        System.out.println(countVowels(text));

        input.close();
    }
}