public class Bank {
    public static void main(String[] args) {

        class bankAccount {
            String name;
            int age = 0;
            int balance;
            boolean hasDebt;

            public void depositMoney(int money) {
                balance = money;
            }
            public void incrementAge() {
                age++;
            }
            public void setDebt(boolean debt) {
                hasDebt = debt;
            }
            public boolean getDebt() {
                return hasDebt;
            }
        }
    }
}
