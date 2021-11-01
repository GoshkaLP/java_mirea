package seminar1.book;

public class Book {
    private String bookName;
    private int pagesCount;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getPagesCount() {
        return pagesCount;
    }

    public void setPagesCount(int pagesCount) {
        this.pagesCount = pagesCount;
    }

    public Book(String n, int c) {
        setBookName(n);
        setPagesCount(c);
    }

    public Book(String n) {
        setBookName(n);
        setPagesCount(111);
    }

    public Book(int c) {
        setBookName("DefaultName");
        setPagesCount(c);
    }

    public String toString() {
        return "Book's name is " + getBookName() + " and it has " + getPagesCount() + " pages";
    }
}
