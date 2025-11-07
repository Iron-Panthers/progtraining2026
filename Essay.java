public class Essay implements Printables {
    String essayContents;
    String title;
    int length;

    @Override
    public void printObject() {
        System.out.println(essayContents);
    }
}
