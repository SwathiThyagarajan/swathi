package Assignments.Abstraction;

abstract class Book {

    abstract String getDetails();

    abstract void name();
    abstract void author();
    abstract void price();


    // Default constructors
    String name;
    String author;
    int price;

    // Parameterised constructors
    public Book(String name, String author, int price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

}
