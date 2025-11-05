public class PetProject {
    String name = "Fluffy";
    String animal = "Australian Shephard";
    double weight = 30.0;
    boolean hasFur = true;
    double happiness = 6.7;
    public PetProject(String name, String animal){
        this.name = name;
        this.animal = animal;
    }
    public PetProject(String name, String animal, double weight, boolean hasFur, double happiness){
        this.name = name;
        this.animal = animal;
        this.weight = weight;
        this.hasFur = hasFur;
        this.happiness = happiness;
    }
    public double walk (double happiness){
    double walk = 0;
    if (happiness > 8.0){
        walk++;
    }
    return walk;
    } 
    
    public void grow (){
    weight++;
    }

    public void printPet (){
    System.out.println ("Your pet's name is " + name + ". Your pet's animal is " + animal + ". Your pet's weight is " + weight + ". Your pet has fur is: " + hasFur + ". The happiness of your pet is " + happiness + ".");
    }
    public static void main(String[] args) {
        PetProject Riya = new PetProject("Riya", "German Shepherd", 15, true, 5.0);
        PetProject Samantha = new PetProject("Samantha", "poodle", 20.0, true, 1.0);
        PetProject Alisa = new PetProject ("Alisa", "pomeranian");
        Riya.printPet();
        Samantha.printPet();
        Alisa.printPet();

    }
}