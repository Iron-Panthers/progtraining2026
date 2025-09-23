import java.util.Scanner;

public class BetterthanKalista {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println ("What is your age?");
        int age = input.nextInt();
        input.nextLine();
        double price = 0.0;

        String person = "";

        if (age>=65) {

            person = "Senior";

            price = 5.99;
        } 
        else if (age<=2) {

            person = "Baby";
            price = 3.99;
        }
        else if (age>=2 && age<=5){

            person = "Child";
            price = 7.99;
        }
        else if (age>5 && age<=18) {

            person = "Student";
            price = 11.99;
        } 
        else if (age>18 && age<=65) {

            person = "Adult";
            price = 15.99;
        }

        System.out.println("You are a " + person);
        System.out.println ("Is it your birthday?");

        String birthday = input.nextLine();
        if (birthday.equalsIgnoreCase("yes")){
            price -= 3;
        }

        System.out.println ("Do you have a promo code?");

        String promo = input.nextLine();
        if (promo.equalsIgnoreCase("yes")){
            price -= 2;
        }

        if (age>18) {
            System.out.println ("Do you want to spend 5 extra dollars to buy flowers?");

            String extra = input.nextLine();
            if (extra.equalsIgnoreCase("yes")){
                price += 5;
            }
        }
        System.out.println ("Your total price is " + price + ". Thank you for visiting!");
    }
}