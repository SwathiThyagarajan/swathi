package MAY.ex_16052024_Inheritance.Single_Inheritance;

public class Programming_Lang {

    // suppose we have a Programming language
    // Every Programming language has a version and author


    // Attributes  -- These are Instance variables
    int version;
    String author;

    // Right click and Generate a Default constructor by selecting none
    public Programming_Lang() {
        System.out.println("Default constructor");
    }

     // Parameterised constructor
    public Programming_Lang(int version, String author) {
        this.version = version;
        this.author = author;
    }

    // creating a method --> this is method not a function because it is created within a class
    void  printInfo(){
        System.out.println("Progam Info --> "+ this.version + "Author"+ this.author);
    }

// suppose Programming_Lang has a 3bhk this is available to child class java also
    void bhk3(){
        System.out.println("3BHK");
    }

    /*
       All the classes in java are inherited from object class
       Programming_Lang is also inherited from object class
       Java is inherited from Programming_Lang

       Therefore, Object class is Grand Parent
       Programming_Lang is parent
       Java is child


     */

}
