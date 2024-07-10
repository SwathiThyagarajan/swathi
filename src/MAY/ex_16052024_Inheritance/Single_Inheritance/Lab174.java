package MAY.ex_16052024_Inheritance.Single_Inheritance;

public class Lab174 {
    public static void main(String[] args) {

        /*
 //         What is Inheritance??
 // Inheritance means Inheriting some  Attributes and Behaviour from the parent or Grand parent.

Keywords

        // Superclass |  Parent Class | Base Class -->> all mean the same
        // Subclass |  Child Class | Derived Class -->> all mean the same

        // Parent -> Child

        // Child extends from Parent {}
        // extend keyword -> parent's Attributes are available to the child(class)
           extend is keyword used within classes

        // Single Inheritance
        // Parent class-> Programming language
        // Child class -> Java

        Java extends Programming language
        */

//      creating an Instance of programming language class
        Programming_Lang p = new Programming_Lang(12, "Kumar");
        Java j = new Java("lambda exp");

        p.printInfo(); // this will print, Progam Info --> 12AuthorKumar
        j.printInfo(); // this will print, Feature is --> lambda exp

        // p.printInfo(): Calls the printInfo() method of the Programming_Lang class,
        // printing Program Info --> 12 Author Kumar.

        // j.printInfo(): Calls the overridden printInfo() method of the Java class,
        // printing Feature is --> lambda exp.

//    this is a parent child relation. can java access the author from Programming_Lang parent class
//      Yes it can access

        Programming_Lang p1 = new Programming_Lang(12, "Van Russom");
        p1.printInfo();

        Python python = new Python();
        // only if Python class extends to programming_Lang class we can access print information
        python.printInfo(); // here this will 1st call parent function because python has no info. in it

        // Always 1st priority is for child class
        // If child is not found then it will go to parent class
        // By using child reference we can access the parent function
        // this is called as Inheritance














    }
}
