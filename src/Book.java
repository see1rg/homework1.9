public class Book {
    private String nameOfBook;
    private String Author;
    public int yearPublishing;

    public Book (String nameOfBook, int yearPublishing, String Author){
        this.nameOfBook = nameOfBook;
        this.yearPublishing = yearPublishing;
        this.Author = Author;
    }


    public String getNameOfBook(){
        return this.nameOfBook;}
    public int getYearPublishing(){
            return this.yearPublishing;}

    public void setYearPublishing(int yearPublishing) {
        this.yearPublishing = yearPublishing;
        }
}

