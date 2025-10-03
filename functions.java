package progtraining2026;

public class functions {
    public static void main(String[] args) {
    startCar("hi");
    }

    // Void function to start the car
    public static void startCar(String keyType) {
        System.out.println("The car is started using a " + keyType + " key.");
    }

    // Void function to stop the car
    public static void stopCar(String reason) {
        System.out.println("The car is stopped because: " + reason);
    }

    // String function to honk the horn
    public static String honkHorn(String sound) {
        return "The car horn goes: " + sound;
    }

    // Int function to calculate fuel efficiency
    public static int calculateFuelEfficiency(int distance, int fuelUsed) {
        return distance / fuelUsed; // Returns fuel efficiency in distance per unit of fuel
    }
}
