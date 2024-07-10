package MAY.ex_18052024.super_thisKeyword;

public class Lab185 {
    public static void main(String[] args) {
        // Creating Dog object
        Dog d1 = new Dog();
        // output
//Animal - Default constuructor
//Dog - Default constuructor

        /* Constructor chaining --- Rarely used in Automation but important concept
 If child's default constructor is called automatically parent's default constructor will also be called
        even if u don't type automatically a super keyword is present in child class

 Constructor chaining in Java allows one constructor to call another constructor
  within the same class or from its superclass.
         This helps to reuse the code and maintain consistency in initializing objects.

 If we have 1  Default constructor, Parameterised constructor 2, 3 & 4.
  Parameterised constructor 4 can call PC 3, PC 3 can call PC 2, PC 2 can call PC 1
  and PC 1 can call     Default constructor . Bottom  to Top approach
         */

        // Creating another type of Dog object
        Dog d2 = new Dog("Husky");
        d2.display();

        // Creating another type of Dog object
        Dog d3 = new Dog("Golden Retriever" , "Dog TT");
        d3.display();
    }


    }
    // Creating an Animal class
    class Animal {
    String type;
    //Generating an empty constructor by right click
         Animal() {
            System.out.println("Animal - Default constuructor ---1--called because super is printed automatically in Dog");
        }
        Animal(String type){
            this.type = type;
            System.out.println("Animal - Parameterised constructor");
        }
    }

// Creating a Dog class
class Dog extends  Animal{
    String breed;
    int a;
    //Generating an empty constructor by right click
     Dog() {
        System.out.println("Dog - Default constuructor---2");
    }
    // Creating Parameterised constructor with 1 parameter
     Dog(String breed) {  // Parameterised constructor
         this.breed = breed;
    }

    // Creating another Dog where we mention the type in Dog constructor with 2 parameters
    // constructor calls another Dog constructor
    // Dog with 2 parameters calling Dog with 1 parameter
    Dog(String breed, String type){
         this("Breed Set by Dog only"); // it will call Dog(String breed) {
        this.type = type;
        System.out.println("parameterised constructor with 2 arguments");

    }
    // Creating another Dog constructor with 3 parameters
    Dog(String breed, String type, int a) {
        this("Breed Set by Dog only", "Golden Retriever"); // it will call
        // here we have 3 parameters, to set String breed, String type--> this keyword is used
        // this keyword will set the breed as well as type
        this.a = a;
        System.out.println("parameterised constructor with 2 arguments");

    }

    // Adding a display function
    void display(){
        System.out.println("Type: " + type + " , Breed: " + breed);
        // type is coming from parent Animal--super
        // breed is coming from child Dog--this
        // even if u don't use the keyword this and super automatically they are present
    }
}

