public class Main {




    { Author king = new Author("Stephen", "King");
        Author lem = new Author("Stanislaw", "Lem");
        Book misery = new Book("Misery", 1918, king.getFullName());
        Book solaris = new Book("Solaris", 1961, lem.getFullName());
        misery.setYearPublishing(1981);
        System.out.println(misery.toString());
        System.out.println(solaris.toString());

    }


}