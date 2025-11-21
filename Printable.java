 package progtraining2026;

interface Printable {
    public default void printObject() {
        System.out.println();
    }
    public String classy(String stringy);
    public String notes();
}