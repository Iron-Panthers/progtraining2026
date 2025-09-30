public class bank {
    public static void main (String [] args){
        class BankUser {
            String name;
            int age;
            double balance;
            boolean hasDebt;

            public void despositMoney(int money){
                balance += money;
            }
            public void incrementAge(){
                age += 1;
            }
            public void setDebt(boolean debt){
                hasDebt = debt;
            }
            public boolean getDebt(){
                return hasDebt;
            }
            public boolean isMinor(){
                if (age >= 18){
                    return false;
                } else{
                    return true;
                }
            }
        }
    }
}
