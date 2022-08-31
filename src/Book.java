import java.util.Objects;

public class Book {
    final String nameOfBook;
    final String Author;
    private int yearPublishing;




    public String getNameOfBook(){
        return this.nameOfBook;}
    public int getYearPublishing(){
            return this.yearPublishing;}

    public Book(String nameOfBook,int yearPublishing, String author ) {
        this.nameOfBook = nameOfBook;
        this.yearPublishing = yearPublishing;
        Author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearPublishing == book.yearPublishing && Objects.equals(nameOfBook, book.nameOfBook) && Objects.equals(Author, book.Author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfBook, Author, yearPublishing);
    }

    @Override
    public String toString() {
        return "Книга " +
                " название книги '" + nameOfBook + '\'' +
                ", Автор '" + Author + '\'' +
                ", дата публикации - '" + yearPublishing +
                "'.";
    }

    public void setYearPublishing(int yearPublishing) {
        this.yearPublishing = yearPublishing;
        }
}

