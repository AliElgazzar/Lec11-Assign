//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

       Book book1 = new Book("135-147-22", "Love", "Alice");
       Book book2 = new Book("122-555-22", "Physics",     "david");
       Book book3 = new Book("147-666-11", "Math", "james");
       Book book4 = new Book("147-666-11", "Math", "james");


        book1.addBook("135-147-22", "Love", "Alice");
        book2.addBook("122-555-22", "Physics", "david");
        book3.addBook("147-666-11", "Math", "james");
        book4.addBook("147-666-11", "math", "james");

        book1.borrowBook("135-147-22");
        book1.borrowBook("135-147-22");
        book4.borrowBook("147-666-11");

        book1.returnBook("135-147-22");
        book4.returnBook("147-666-11");




    }
}