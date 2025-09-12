import java.util.Scanner;
public class drama {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        int children = 5;
        int student = 18;
        int adult = 60;
        System.out.println("welcome to the movie theater: how old r u");
        int age = input.nextInt();
        boolean isChild = age <= children;
        boolean isStudent = age > children && age <= student;
        boolean isAdult = age > student && age <= adult;
        boolean isSenior = age > adult;
        System.out.println("child: " + isChild);
        System.out.println("student: " + isStudent);
        System.out.println("adult: " + isAdult);
        System.out.println("senior: " + isSenior);
        }
    }