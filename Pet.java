public class Pet {
        String name;
        String animal;
        double weight;
        boolean hasFur;
        double happiness;

        public Pet(String name, String animal, double weight, boolean hasFur, double happiness) {
            this.name = name;
            this.animal = animal;
            this.weight = weight;
            this.hasFur = hasFur;
            this.happiness = happiness;
        }

        public void walk() {
            weight--;
            happiness++;
        }
        public void grow() {
            weight++;
        }
        public void printPet() {
            System.out.println("Name: " + name);
            System.out.println("Species: " + animal);
            System.out.println("Weight: " + weight);
            if (hasFur) {
                System.out.println("Has fur.");
            }
            else {
                System.out.println("Doesn't have fur");
            }
            System.out.println("Happiness: " + happiness);
        }
    }
    

    public static void main(String[] args) {

        Pet Adam = new Pet("Adam", "cat", 15.0, true, 10.0);
        Pet Bob = new Pet("Bob", "dog", 30.0, true, 10.0);
        Pet Cindy = new Pet("Cindy", "rabbit", 5.0, true, 10.0);

        Adam.printPet();
        Bob.printPet();
        Cindy.printPet();
        
    }

