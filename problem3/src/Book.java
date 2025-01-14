import java.util.HashMap;
import java.util.Objects;

public class Book {
    private String ISBN;
    private String title;
    private String author;
    private boolean isBorrowed;
    private static HashMap<String,Book> books = new HashMap<>();

    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.isBorrowed = false;
    }

    public void addBook(String ISBN, String title, String author) {
        if (books.containsKey(ISBN)) System.out.println("This "+books.get(ISBN) + " is already exists");
        else {
            books.put(ISBN, new Book(ISBN, title, author));
            System.out.println("Successfully added " + books.get(ISBN));
        }
    }

    public void borrowBook(String ISBN) {
        if (!(isBorrowed() && books.containsKey(ISBN))) {
            System.out.println("\nsuccessfully borrowed book with title " + title);
            setBorrowed(true);
        } else System.out.println("\nSorry this book with title " + title + " is already borrowed");

    }

    public void returnBook(String ISBN) {
        if ((isBorrowed() && books.containsKey(ISBN))) {
            setBorrowed(false);
            System.out.println("Successfully returned book with title " + title);
        }
    }

    public String getISBN() {
        return ISBN;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    @Override
    public String toString() {
        return String.format(
                "Book{ISBN='%s', title='%s', author='%s'}",
                ISBN, title, author
        );
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof Book)) return false;

        Book other = (Book) obj;
        return Objects.equals(other.ISBN, ISBN) &&
               Objects.equals(other.title, title) &&
               Objects.equals(other.author, author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ISBN, title, author);
    }


}
