import java.util.Scanner;
public class liamsnewcar {
    public static void main (String [] args){
        System.out.println("Type STARTCAR to start the car. ");
        Scanner input = new Scanner(System.in);
        String startcar = input.nextLine();
        boolean fire = false;
        if (startcar .equals("STARTCAR")){
            System.out.println("Buttons: OPENTRUNK, HORN, HEADLIGHTS, NOTSUSBUTTON");
            fire = true;
        }
        int temp = 70;
        while( fire == true){
        
            String ot = input.nextLine();
            if (ot .equals( "OPENTRUNK")){
                System.out.println (opentrunk());
            }
            if (ot .equals("HORN")){
                System.out.println(honk());
            }
            if (ot .equals("HEADLIGHTS")){
            System.out.println(light());
            }
            if (ot .equals("TEMP+")){
                System.out.println(temp++);
            }
            if (ot .equals("TEMP-")){
                System.out.println(temp--);
            }
            if (ot .equals("NOTSUSBUTTON")){
                System.out.println("What is the passcode");
                String password = input.nextLine();
                if (password .equals("BLOWUP")){
                    System.out.println(notatrap());
                    fire = false;
                    break;
                }
                if (password .equals("ARM")){
                    System.out.println(armor());
                    System.out.println(honk());
                }
                if (password .equals("DISARM")){
                    System.out.println(honk());
                    System.out.println(disarm());
                }
                if (password .equals ("FLY")){
                    System.out.println(airplane());
                }
            }
         }
    }
    public static String opentrunk(){
        return "your trunk is open";
    }
    public static String honk(){
        return "BEEP! BEEP! BEEP!";
    }
    public static String light(){
        return "MAY THERE BE LIGHT!!!";
    }
    public static String notatrap(){
        return "This car is going to self distruct...";
    }
    public static String armor(){
        return "Your car is now armored and has military grade weapons that are armed. Your security team is coming...";
    }
    public static String disarm(){
        return "Disarmed";
    }
    public static String airplane(){
        return "FLYING AWAY...";
    }
}
