package week1;

public class bankproject {
public String name; 
public int age; 
public double balance; 
public boolean hasDebt; 
public static void main(String[] args) {
}  
public bankproject (String name, int age, double balance, boolean hasDebt){
this.name = name;
this.age = age; 
this.balance = balance; 
this.hasDebt = hasDebt;
}
public void depositMoney(int amount) {
 balance += amount;
}
public void setDebt (boolean value ) {
hasDebt = value;
}
public boolean getDebt() {
    return hasDebt;
}
public int getAge(){
return age;
}
}