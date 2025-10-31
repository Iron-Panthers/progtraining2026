public class Building {
    public String color;
    public int height;
    public int rooms;
    public boolean isExisting;

    public Building(String color, int height, int rooms, boolean isExisting) {
        this.color = color;
        this.height = height;
        this.rooms = rooms;
        this.isExisting = isExisting;
    }

    static void buildHouse(Building house) {
        house.isExisting = true;
    }

    public void buildFloor(Building house) {
        house.height++;
    }

    public static void buildRoom(Building house) {
        house.rooms++;
    }

    public static void paintHouse(Building house, String color) {
        house.color = color;
    }

    public static void main(String[] args) {
        Apartment apartments = new Apartment(false);
        House house = new House();
        Library library = new Library(1000);

        buildHouse(apartments);
        buildHouse(house);
        buildHouse(library);
        paintHouse(library, "Beige");
        buildRoom(house);

        System.out.println(apartments.isExisting);
    }
}