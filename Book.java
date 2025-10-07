public class Book {

    private String name;
    private String author;
    private boolean isBorrowed;

    public Book(String name, String author, boolean isBorrowed) {
        this.name = name;
        this.author = author;
        this.isBorrowed = isBorrowed;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public boolean getBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    public static String toString(Book book) {
        return "Book title: " + book.name + ", Author: " + book.author + ", Borrowed: " + book.isBorrowed;
    }    
    public static void main(String[] args) {
        Book[] book = new Book[5];
        
        book[0] = new Book("The Hate U Give", "Angie Thomas", true);
        book[1] = new Book("Fahrenheit 451", "Ray Bradbury", true);
        book[2] = new Book("Crime and Punishment", "Fyodor Dostoyevsky", false);
        book[3] = new Book("The Kite Runner", "Khaled Hosseini", false);
        book[4] = new Book("The Hitchhiker's Guide to the Galaxy", "Douglas Adams", true);

        for (int i = 0; i < 5; i++) {
            System.out.println(toString(book[i]));
        }

    }
    
}
