public class MiniCarProject {

    public static void main(String [] args){
    carPart(true, 4);
    carPart2(true, 2);
    maxSpeed(30, 60.0);
    engineType ("Internal Combustion");
    }


    public static void carPart (boolean startCar, int part){
        System.out.println("Is the car running? " + startCar);
        System.out.println("Part " + part + " is broken");
    }
    public static void carPart2 (boolean headlights, int part2){
        System.out.println("Are the headlights on? " + headlights);
        System.out.println(part2 + " lights are on");
    }
    public static int maxSpeed (int boost, double speed){
        return (int)(boost + speed);
    }
    public static String engineType (String type){
        return (type);

    }
    
}