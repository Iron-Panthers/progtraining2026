package progtraining2026;

public class functions {
    public static void main(String[] args) {
    startCar("huge");
    stopCar("ran out of gas");
    honkHorn("beep beep");

    }

    
    public static void startCar(String keyType) {
        System.out.println("The car is started using a " + keyType + " key.");
    }

    
    public static void stopCar(String reason) {
        System.out.println("The car is stopped because: " + reason);
    }

    
    public static String honkHorn(String sound) {
        System.out.println("The car horn goes: " + sound);
        return "The car horn goes: " + sound;
    }

   
}
