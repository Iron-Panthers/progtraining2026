public class car {
    public static void startCar(){
    }
    public static String onMessage(String on){
        return on;
    }
    public static int checkGas(int gasAmount){
        return gasAmount;
    }
    public static void go(){
    }
    public static void main (String [] args){
        startCar();
        onMessage("hi");
        checkGas(10);
        go();
    }
}