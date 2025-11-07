public class Newspaper implements Printables {
    String heading;
    String contents;
    int edition;

    @Override
    public void printObject() {
        System.out.println(heading);
        System.out.println(edition + "th edition");
        System.out.println(contents);
    }
}
