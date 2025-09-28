

import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class BHS_DramaProject{
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);

        System.out.println("BHS Drama Tickets On Sale! We offer Child, Adult, and Senior tickets, check the price for your age group here!");
        System.out.println("How old are you?");
        int age = input.nextInt();
        input.nextLine();
        System.out.println("What is your birthday? (mmdd) ");
        int bday = input.nextInt();
        input.nextLine();

        String ticket;
        int price = 0;

        if (age < 13) {
            ticket = "Child";
            price = 3;
        }
        else if (age > 65) {
            ticket = "Senior";
            price = 5;
        }
        else {
            ticket = "Adult";
            price = 10;
        }

        boolean isBday = false;

        if (bday == 923) {
            price = price - 3;
            isBday = true;
            System.out.println("Happy Birthday!");
        }

        System.out.println("Do you have a promo code?");
        String hasPromo = input.nextLine();

        if (hasPromo == "yes") {
            price = 3*price/5;
        }

        System.out.println("You should buy a " + ticket + " ticket.");
        System.out.println("Your ticket costs " + price + " dollars.");

        if (ticket == "Adult") {
            System.out.println("Would you like to buy flowers?");
        }
        else if (ticket == "Senior") {
            System.out.println("Would you like to buy flowers?");
        }
        else {
            System.out.println("Would you like to buy rotten tomatoes?");
        }

        String additionalProducts = input.nextLine();

        if (additionalProducts == "no") {
            System.out.println("Your total will be " + price + " dollars.");
        }
        else if (ticket == "Child") {
                System.out.println("Your total will be " + price + " dollars.");
            }
        else {
            price = price + 2;
            System.out.println("This will cost an additional 2 dollars.");
            System.out.println("Your total will be " + price + " dollars.");
        }
            
        }
        
      
    }
