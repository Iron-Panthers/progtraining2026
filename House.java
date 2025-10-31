public class House extends Building {
    public House() {
        super("White", 7, 5, false);
    }

    @Override
    public void buildFloor(Building house) {
        System.out.println("You can't add floors to a house!");
    }
}
