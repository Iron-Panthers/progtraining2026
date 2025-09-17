import java.util.Scanner;

public class Drama {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("How old are you?");
        int age = input.nextInt();
        boolean isChild = age <14;
        boolean isStudent = (age >= 14 && age <= 18);
        boolean isAdult = (age > 18 && age < 65);
        boolean isSenior = (age >= 65 && !(age > 123));
        if (isChild == true) {
         System.out.println("Children go for free!");
       } else if (isStudent == true) {
         System.out.println("Students can go for free!");
       } else if (isAdult == true) {
         System.out.println("You should buy the adult ticket for $5.");
       } else if (isSenior == true) {
         System.out.println("You should buy the senior ticket for $3.");
       } else {
         System.out.println("Invalid age!");
       }
}
}
