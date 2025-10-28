package progtraining2026;

public class Student  {
    String name= "Preston";
    int age = 15;
    String grade = "Sophomore";
    boolean likesRobotics = true;

public static void main(String[] args) {
    Student student = new Student();
    student.introduceYourself();
    
}

public void introduceYourself() {
    System.out.println("Hello, my name is " + name + ".");
    System.out.println("I am " + age + " years old and in grade " + grade + ".");
    if (likesRobotics) {
        System.out.println("I love robotics!");
    } else {
        System.out.println("Robotics is not my favorite subject.");
    }
}
}


