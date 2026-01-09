import java.util.Scanner;
public class BHSDrama {
    
    public static void main(String[] args) throws InterruptedException {

     System.out.println("Thank you for your interest in buying tickets for the BHS Drama production");
     Thread.sleep(1500);

        @SuppressWarnings("resource")
        Scanner scanner = new Scanner (System.in);
         System.out.println("Please enter your age");
        int age = scanner.nextInt();
        if (age <0||age > 105){
            System.out.println("You cant buy a ticket");
        } else if (age >=0 && age<=12){
            System.out.println("Ticket is $5");
        } else if (age >=13 && age <=18){
            System.out.println("Ticket is $10");
        }else if (age>= 19 && age <=54){
        System.out.println("Ticket is $15");
        } else if (age>=55 && age <= 100){
            System.out.println("Ticket is free!");
        }
        System.out.println("Thank you for you purchase");
    }
}