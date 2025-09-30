public class pets {
    public static void main (String [] args){
        class Pet{
            String name;
            String animal;
            double weight;
            boolean hasFur;
            double happiness;

            Pet(String name, String animal, double weight, boolean hasFur, double happiness){
                this.name = name;
                this.animal = animal;
                this.weight = weight;
                this.hasFur = hasFur;
                this.happiness = happiness;
            }
            void walk(double distance){
            }
            void grow(double addedWeight){
                weight += addedWeight;
            }
            void printPet(){
                System.out.println(name);
            }
        }
        Pet bob = new Pet("bob", "dog", 3.14, true, 1.23);
        Pet jeff = new Pet("jeff", "cat", 6.7, false, 6.7);
        Pet jerbob = new Pet("jerbob", "worm", 8.9, false, 6.7);
    }
}
