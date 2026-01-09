import java.util.Scanner;

public class Richpersonnameproject { 
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Enter you name if you are a peasant"); 
        String name = scanner.nextLine(); 
        switch (name) {
            case "Riya":
                System.out.println("Hi!It's fun saying hi to you before P.E. "); 
                break;
            case "Samantha": 
                System.out.println("Hello! You are a great robotics teacher!");
                break;
            case "Liam": 
                System.out.println("Hi.You are a good robotics teacher. I was in a play with your sister last year."); 
                break; 
            case "Alisa": 
                System.out.println("Hi! you are so nice! It is fun saying hi to you in the halls!"); 
                break; 
            case "Kalista": 
                System.out.println("Hi! your shirt looks nice today!"); 
                break; 
            case "Chris": 
                System.out.println("Hi.You are in my spanish class!" ); 
                break; 
            case "Stanley": 
                System.out.println("Hi.You are very nice!"); 
                break; 
            case "Daisy": 
                System.out.println("Hi. You are so nice!"); 
                break; 
                default: 
                System.out.println("I dont really care who you are you peasant");
                break; 
        }
                



              


        
        }


    
    }
