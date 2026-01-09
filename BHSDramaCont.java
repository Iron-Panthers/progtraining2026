import java.util.Scanner;
public class BHSDramaCont {
    
    public static void main(String[] args) {

   

        System.out.println("Thank you for your interest in buying tickets for the BHS Drama production");

   
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

            System.out.println("is it your birthday?");
            String birthday = scanner.nextLine();
           if (birthday.equals("yes")){
            System.out.println("Happy Birthday!");
           }
           System.out.println("Do you have a promo code?");
           String promocode = scanner.nextLine();
           if (promocode.equals("Yes")) {
            System.out.println("You get 3 dollars off");


           }

        }


}