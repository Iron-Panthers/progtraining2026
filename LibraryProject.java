public class LibraryProject { 
    String name = "Gyatt";
    String author = "Samantha Ng";
    boolean isBorrowed = true;

    public LibraryProject(String name, String author, boolean isBorrowed){
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

    public void setBorrowed(boolean isBorrowed){
        this.isBorrowed = isBorrowed;
    }

    public String toString(){
    return "The book name is " + name + ". The author of the book is " + author + ". This book is borrowed is: " + isBorrowed + ".";
    }
    public static void main(String[] args) {
        LibraryProject Riya = new LibraryProject("Gyatt", "Samantha Ng", true);
        LibraryProject Samantha = new LibraryProject("BigBack", "Sonali Sharma", true);
        LibraryProject Alisa = new LibraryProject ("FOODDD", "Belle Tan", false);
        Riya.toString();
        Samantha.toString();
        Alisa.toString();

    }
}