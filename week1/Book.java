public class Book{
    private String name;
    private String author;
    private boolean isBorrowed;

    public Book(String name, String author, boolean isBorrowed){
        this.name = name;
        this.author = author;
        this.isBorrowed = isBorrowed;
    }

    public String getName(){
        return name;
    }
    public String getAuthor(){
        return author;
    }
    public boolean getBorrowed(){
        return isBorrowed;
    }
    public void setBorrowed(boolean borrowed){
        borrowed = isBorrowed;
    }

    @Override
    public String toString(){
        return "Book [name: " + name + ", author: " + author + ", isBorrowed: " + isBorrowed + "]";
    }
    public static void main (String []args){
        Book[] bookList = new Book[5];

        bookList[0] = new Book("A Raisin in the Sun", "Lorraine Hansberry", false);
        bookList[1] = new Book("The Catcher in the Rye", "J.D. Salinger", true);
        bookList[2] = new Book("The Kitchen", "Banana Yoshimoto", false);
        bookList[3] = new Book("The Alchemist", "Paulo Coelho", false);
        bookList[4] = new Book("Macbeth", "William Shakespeare", false);

        for (int i = 4; i >= 0; i--){
            System.out.println(bookList[i]);
        }
    }
}
    