public class Main {


 //   public static void main(String[] args) {

    { Author king = new Author("Stephen", "King");
        Author lem = new Author("Stanislaw", "Lem");
        Book misery = new Book("Misery", 1918, king.getFullName());
        Book solaris = new Book("Solaris", 1961, lem.getFullName() );

        System.out.println(misery.getNameOfBook()+" "+misery.getYearPublishing()+ " " + king.getFullName());
        System.out.println(solaris.getNameOfBook()+" "+solaris.getYearPublishing()+ " " + lem.getFullName());

    }


}