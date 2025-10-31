public class Apartment extends Building {
    boolean isRented = false;

    public Apartment(boolean isRented) {
        super("Gray", 20, 15, false);
        this.isRented = isRented;
    }

    public void rentApartment(Apartment building) {
        building.isRented = true;
    }   
}