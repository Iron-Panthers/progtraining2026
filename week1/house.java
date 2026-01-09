package week1;

public class house extends Building {
    String firepit;

    public house(String name, String address, int numFloors, int stairs, String firepit){
        super(name);
        this.firepit = firepit;
    }
    public house() {
        super("house");
    }
    
    @Override
    public void stairs(){
        super.stairs();
        int amount = 1;
    }
 

    }

