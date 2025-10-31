public class Library extends Building {
    int books;

    public Library(int books) {
        super("Brown", 10, 10, false);
        this.books = books;
    }

    public int getBooks(Library library) {
        return library.books;
    }

    public void borrowBooks(Library library) {
        library.books--;
    }

    public void returnBooks(Library library) {
        library.books++;
    }
}
