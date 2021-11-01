package seminar1.book;

public class BookTest {

    public static void main(String[] args) {
        Book b1 = new Book("Peace and War", 125);
        Book b2 = new Book("The Outcast");
        Book b3 = new Book(34);
        b3.setBookName("Harry Potter");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}
