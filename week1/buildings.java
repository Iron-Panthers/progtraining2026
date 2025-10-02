
public class buildings {
    double height;
    String color;
    int rooms;

    public int getRooms(){
        return rooms;
    }

    public double getHeight(){
        return height;
    }

    public String getColor(){
        return color;
    }

    public buildings(double height, String color, int rooms){
        this.height = height;
        this.color = color;
        this.rooms = rooms;
    }

    public class skyscraper extends buildings {
        int floors;
        public int getFloors(){
            return floors;
        }
        public skyscraper(double height, String color, int rooms, int floors){
            super(height, color, rooms);
            this.floors = floors; 
        }
    }

    public class house extends buildings {
        @Override
        public int getRooms(){
            return super.getRooms() + 2;
        }
        public house(double height, String color, int rooms){
            super(height, color, rooms);
        }
    }

    public class school extends buildings {
        int people;
        public school(double height, String color, int rooms, int people){
            super(height, color, rooms);
            this.people = people;
        }

    }
}

public static void main (String [] args){
    buildings.school bhs = new buildings.school(6.7, "blue", 5, 1000);
    buildings.house home = new buildings.house(6.7, "red", 3);
    buildings.skyscraper tower = new buildings.skyscraper(67, "blue", 1000, 100);

    System.out.println(bhs.getColor());
    System.out.println(bhs.getRooms());
    System.out.println(bhs.getHeight());
    System.out.println(home.getRooms());
    System.out.println(tower.getFloors());

}