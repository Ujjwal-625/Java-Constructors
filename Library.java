public class Library {
    Book[] booksBorrowed;
    static class LibraryMembers extends  Person{
        int memberId;
        LibraryMembers(String name,int age,char gender){
            super(name,age,gender);
            this.memberId=(int) (Math.random() * 1000000);
        }
    }
    LibraryMembers [] members;
    Library() {
        members = new LibraryMembers[10];  // Initialize the array of members
        booksBorrowed = new Book[10];  // Initialize the array of borrowed books
        members[0] = new LibraryMembers("fklaj", 17, 'M');  // Example member
    }

//    void displayMemberInfo() {
//        System.out.println("Name: " + name + ", Age: " + age + ", Gender: " + gender + ", Member ID: " + memberId);
//    }

    // BorrowBook method: Allows a library member to borrow a book
    void BorrowBook(int memberIndex, Book bookToBorrow) {
        // Check if the member exists and if there's space to borrow the book
        if (memberIndex >= 0 && memberIndex < members.length && booksBorrowed.length > 0) {
            // Find an empty spot to store the borrowed book
            for (int i = 0; i < booksBorrowed.length; i++) {
                if (booksBorrowed[i] == null) {
                    booksBorrowed[i] = bookToBorrow;
                    System.out.println("Book borrowed by " + members[memberIndex].name + ":");
//                    bookToBorrow.displayMemberInfo();
                    return;
                }
            }
            System.out.println("No space to borrow more books.");
        } else {
            System.out.println("Invalid member index or no books available for borrowing.");
        }
    }

    public static void main(String[] args) {
        Library library = new Library();

        // Create a book instance
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald",90);



        // Borrow the book
        library.BorrowBook(0, book1);
    }
}
