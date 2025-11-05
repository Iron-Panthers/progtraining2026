public class Hair {
    String color;
    double length;
    String type;
    
    Hair (){
        this.color = "blue";
        this.length = 5;
        this.type = "straight";
    }
    
    void GrowHair() {
        this.length = this.length +1;
    }
}
