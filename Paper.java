public class Paper implements Printables {
    String contents = " ";
    String paperSize = "A4";
    int areaOfPaper = 62370;

    @Override
    public void printObject() {
        System.out.println(contents);
    }
}
