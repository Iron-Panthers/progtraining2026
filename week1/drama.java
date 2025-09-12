import java.util.Scanner;
public class drama {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        int children = 5;
        int student = 18;
        int adult = 60;
        String ageGroup;

        System.out.println("welcome to the movie theater: how old r u");
        int age = input.nextInt();
        int price = 0;
        if (age <= children) {
            price = 5;
            ageGroup = "child";
            System.out.print("child: " + price);
        } else if (age <= student) {
            price = 10;
            System.out.print("student: " + price);
            ageGroup = "student";
        } else if (age <= adult) {
            price = 15;
            System.out.print("adult: " + price);
            ageGroup = "adult";
        } else {
            price = 10;
            System.out.print("senior: " + price);
            ageGroup = "senior";
        }

        System.out.println("is it ur bday");
        boolean bday = input.nextBoolean();
        if (bday) {
            price -= 3;
            System.out.println("happy bday! u get a discount! of 3 dollars off");
            System.out.println("price: " + price);
        }
        
        String promo = "robotics";
        boolean hasPromo = input.nextBoolean();
        if (hasPromo) {
            System.out.println("input ur promo code");
            String userPromo = input.nextLine();
            if (userPromo.equals(promo)){
                price -= 2;
                System.out.println("yay! u get a discount of 2 dollars off");
                System.out.println("price: " + price);
            } else {
                System.out.println("sorry, that promo code is invalid");
                System.out.println("price: " + price);
            }
        }
        System.out.println("are u a member of cast");
        boolean isCast = input.nextBoolean();
        if (isCast) {
            if (ageGroup.equals("child")){
                System.out.print("do u want free rotten tomatoes");
                boolean tomatoes = input.nextBoolean();
                if (tomatoes){
                    System.out.println("yay u get free rotten tomatoes");
                } else{
                    System.out.println("ok no free rotten tomatoes");
                }
            } else if (ageGroup.equals("adult") || ageGroup.equals("senior")){
                System.out.print("do u want flowers for an extra $5");
                boolean flowers = input.nextBoolean();
                if (flowers){
                    price += 5;
                    System.out.println("ok u get flowers");
                    System.out.println("price: " + price);
                } else{
                    System.out.println("ok no flowers");
                }
            }
        }
        input.close();
    }
}