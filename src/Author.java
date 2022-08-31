public class Author {
    final String firstname;
    final String surename;

    public Author(String firstName, String surename) {
        this.firstname = firstName;
        this.surename = surename;
    }


    public String getFirstname() {
        return this.firstname;
    }

    public String getSurename() {
        return this.surename;
    }

    public String getFullName() {
        return this.surename + " " + this.firstname;

    }


}
