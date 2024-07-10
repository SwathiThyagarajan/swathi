package Assignments.Abstraction;

public class PrintMyBook extends Book {

    public PrintMyBook(String name, String author, int price) {
        super(name, author, price);
    }

    @Override
    String getDetails() {
        return name + ", " + author + ", " + price;
    }

    @Override
    void name() {

    }

    @Override
    void author() {

    }

    @Override
    void price() {

    }
}
