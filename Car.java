
public class Car {

    public static void startCar() {
        System.out.println("Car starting...");
    }
    public static int checkFuel(int fuel) {
        return fuel;
    }
    
    public static String startEngine(boolean isWorking) {
        if (!isWorking) {
            return "Your engire is broken, go fix it.";
        }
        else {
            return "Your engine works.";
        }
    }
    public static void playMusic(String song) {
        System.out.println("Now playing: " + song);
    }
    public static void main(String[] args) {
        startCar();
        System.out.println(checkFuel(20) + " gallons of gas left");
        System.out.println(startEngine(true));
        playMusic("song mix");
     }
}
