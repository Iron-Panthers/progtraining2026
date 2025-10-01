import java.util.Scanner;

public class a{


public static void main (String [] args){
    System.out.println("Welcome to BHS Drama!");
        System.out.println("Whats your age.");
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        int price = 10;
        if (age <= 17 && age >= 13){
            System.out.println("your ticket price is $15");
            price = 15;
        }
        if(age <=12){
            System.out.println("Your ticket price is $13");
            price = 13;
        }
        if(age >=18 && age <=60){
            System.out.println("Your ticket price is $20");
            price = 20;
        }
        if(age >=61){
            System.out.println("your ticket price is $12");
            price = 12;
        }
        System.out.println("Is it your birthday? Type yes if it is.");
        
        input.nextLine();
        String bday = input.nextLine();
        if(bday.equals("yes")){
            System.out.println("Happy birthday! Tickets are $3 off!");
            price -= 3;
            System.out.print("Your ticket price is $");
             System.out.print(price);
        } else{
            System.out.println("Tickets are regular price.");
        }
         System.out.println(" Do you have a promo code?");
           String promo = input.nextLine();
        if (promo.equals("abcdefghi")){
              System.out.println("valid promo code");
              price -= 5;
              System.out.print("Your ticket price is $");
              System.out.println(price);
              
        }else{
            System.out.println("that is not valid");
        }
              System.out.println("Are you a family of the cast?");
               String fam = input.nextLine();
              if (fam.equals("yes")){
               System.out.println("Ticket price reduced by $3");
               price -= 3;
               System.out.println("Your total price is now $" + price);
              }else{
                  System.out.println("Ok,the ticket price stays the same.");
              }
              if (age >=18 && fam.equals("yes")){
                  System.out.println("Do you want to spend $5 for flowers?");
              }
              String flower = input.nextLine();
              if (flower.equals("yes") && fam.equals("yes")){
                  System.out.println("Ok $5 have been added to the price");
                  price += 5;
                  System.out.println("Your total price now is $" + price);
              }
              if (age <=17 && fam.equals("yes")){
                System.out.println("Do you want some free rotten tomatos?");
              }
              System.out.println("Ok, your ticket price is $" + price);
}
}