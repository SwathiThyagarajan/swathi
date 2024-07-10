package Assignments.Abstraction;

public class Runnerclass {
    public static void main(String[] args) {

        Book myBook = new PrintMyBook("Harry Potter","J.K. Rowling", 120);
        System.out.println(myBook.getDetails());


    }

}
