// Base class Book
public class Book {
    public String ISBN;            // public access modifier
    protected String title;        // protected access modifier
    private String author;         // private access modifier

    // Constructor to initialize the Book details
    Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Method to get the author
    public String getAuthor() {
        return author;
    }

    // Method to set the author
    public void setAuthor(String author) {
        this.author = author;
    }

    // Method to display the author
    public void displayAuthor() {
        System.out.println("Author: " + author);
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Creating an instance of EBook
        EBook eBook = new EBook("12345", "Java Programming", "John Doe");

        // Accessing the ISBN (public)
        System.out.println("ISBN: " + eBook.ISBN);

        // Accessing the title (protected)
        System.out.println("Title: " + eBook.title);

        // Accessing and modifying the author (private in the parent class, accessed through methods)
        System.out.println("Author: " + eBook.getAuthor());
        eBook.setAuthor("Jane Smith");
        System.out.println("Updated Author: " + eBook.getAuthor());

        // Display author using the method in the Book class
        eBook.displayAuthor();
    }
}

// Subclass EBook that extends Book
class EBook extends Book {

    // Constructor to initialize EBook, calling the parent class constructor
    EBook(String ISBN, String title, String author) {
        super(ISBN, title, author);
    }

    // Additional methods for EBook can be added here
}
