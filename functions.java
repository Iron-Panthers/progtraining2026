package progtraining2026;

import java.util.Scanner;

public class functions {
    public static void main(String[] args) {
    
    Scanner button1 = new Scanner(System.in);
    boolean button = button1.nextBoolean();
        if (button) {
            
            startCar("huge");
            System.out.println(startCar("huge"));
        } 

        else {
        stopCar("we forgot the key");
        }
       
        Scanner button2 = new Scanner(System.in);
        String hornSound = button2.nextLine();
        if (hornSound.equals("beep")) {
            honkHorn("beep");
        }
    }

    
    public static String startCar(String keyType) {
        return "The car is started using a " + keyType + " key.";
    }

    
    public static void stopCar(String reason) {
        System.out.println("The car is stopped because: " + reason);
    }

    
    public static String honkHorn(String sound) {
        System.out.println("The car horn goes: " + sound);
        return "The car horn goes: " + sound;
    }

   
}
