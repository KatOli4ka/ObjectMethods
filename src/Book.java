import java.util.Objects;

public class Book {
    private String bookNames;
    private  int yearPublishing;
    private Author author;
    public Book(String bookNames, Author author, int yearPublishing) {
        this.bookNames = bookNames;
        this.yearPublishing = yearPublishing;
        this.author=author; }

    public String toString() {
        return "название - " + this.bookNames + ", год - " + this.yearPublishing + ", автор - " + this.author;
    }
    public String getBookNames(){
        return this.bookNames;
    }
    public int getYearPublishing(){
        return this.yearPublishing;    }
    public void setYearPublishing( int yearPublishing){
        this.yearPublishing = yearPublishing;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearPublishing == book.yearPublishing && Objects.equals(bookNames, book.bookNames) && Objects.equals(author, book.author);
    }
    @Override
    public int hashCode() {
        return Objects.hash(bookNames, yearPublishing, author);
    }
}