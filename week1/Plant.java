package week1;


public class Plant {

    private int numBranches;
    private int numLeaves;
    private String color;


    public Plant(){
        this.numBranches = 3;
        this.numLeaves = 4;
        this.color = "Green";
        System.out.println("PLANT??");
    }

    // public Plant(numBranches){
    //     this.numBranches = numBranches;
    //     this.numLeaves = 4;
    //     this.color = "Green";
    // }
    
    public int getNumLeaves(){
        return numLeaves;
    }
}