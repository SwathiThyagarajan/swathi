package MAY.ex_16052024_Inheritance.Single_Inheritance;

public class Java extends Programming_Lang {

//      Single Inheritance
//    A class inherits from one superclass. This is the most common type of inheritance.
//    Java is a Programming language
//    Python is a Programming language

//      here above we have -- is  a -- type of relation
//      whenever there is -- is a -- relation we can say Java extends Programming

//    Java can have it's own constructors

//    Attributes
      String newFeatures;
//      int version;
//      String author;
//    Java extends Programming_Lang means both the attributes of Programming_Lang
//    int version; and String author; is available to java


     // Default constructor
    public Java() {
        System.out.println("Default constructor");
    }

    // Parameterised constructor
    public Java(String newFeatures) {
        this.newFeatures = newFeatures;
    }

    void printInfo(){
        System.out.println("Feature is --> " + this.newFeatures);
        bhk3(); // this 3bhk is from parent class child class can access it
        // this is possible because of extends keyword
        // we can access attributes and functions/behaviour also
    }
// Here Programming_Lang is parent class
// Java is child class

}
