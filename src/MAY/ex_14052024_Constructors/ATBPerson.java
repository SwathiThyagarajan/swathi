package MAY.ex_14052024_Constructors;

public class ATBPerson {


    // Attributes
    String name;// This is an Instance variable. default value is null
//        String name = "Amit"; directly assinning the value This should not be done
//    Because when u assign a value at class level then every object created will share or take the same value
//    All these attributes are unique for each objects
    long phone_no; // default value is Zero
    String email;
    boolean isMarried; //default value is false
    String courseName;

    // For Instance variables default values are automatically assigned
    // For Local variables default values are never assigned

//    Default constructor
//         Syntax of default constructor:
//               <class_name>(){}

    ATBPerson() {
        System.out.println("Default constructor. Hello, I will be called when You create an Object of class");

        courseName = "ATB"; // This is common to all the students
        //   What u will assign in  Default constructor is only something which is common to all the objects
    }

    // Method named ATBPerson1
    void ATBPerson1() {// This is a method
        System.out.println("Method ATBPerson1. Hello, I will be called when you invoke this method");
    }
    // every function/method returns something
    // void basically indicates that the method does not return any value.


    // Parameterized constructor--> it is also a method with just parameters

    /* ATBPerson(String givenName, long phone_no){
        System.out.println("Parameterized constructor");
        this.name = givenName;
//        this.phone_no = 9876543210l; this will give u error everyone's ph.no. will be same To fix this add another parameter while defining
        this.phone_no = phone_no; // assigning this keyword to phone_no.
        // Here this keyword says change the value of name in the current class/this class to the value whatever u pass in the givenName

If parameter list is keep on growing then delete all the above which is created  in parameterised constructor:-
copy all the Attributes--> Right click select Generate-->select constructors--> select all of them click ok
Now all of them will be present automatically using this keyword
         */

    public ATBPerson(String name, long phone_no, String email, boolean isMarried, String courseName) {
        this.name = name;
        this.phone_no = phone_no;
        this.email = email;
        this.isMarried = isMarried;
        this.courseName = courseName;
    }

    // Constructor overloading with one parameter
    public ATBPerson(String name) {
        this.name = name;
    } // overlaoding means same name different arguments

    // Constructor overloading with two parameters
    public ATBPerson(String name,long phone_no) {
        this.name = name;
        this.phone_no = phone_no;
    } // we can have multiple parameterised constructor


//    Creating a function/Behaviour to print details
    void printDetails(){
        // creating a Local variable inside a function/method
 //       int age;  if u don't assign any value it will throw error to initialise
 //       System.out.println(age);
        System.out.println("Printing details of the student");
    }

/*          CONSTRUCTOR
          constructors are special methods used to initialize objects.
          They have the same name as the class and do not have a return type.

          Every time an object is created using the new() keyword, at least one constructor is called.

It calls a default constructor if there is no constructor available in the class.
In such case, Java compiler provides a default constructor by default.

          1. Default constructor
A constructor is called "Default Constructor" when it doesn't have any parameter.

The moment an object is created using new keyword JVM provides a default constructor by default
The default constructor is used to provide the default values to the object like 0, null, etc., depending on the type.

Default constructor is
         1. Special Method with no return type
         2. called once, when you create new Object
         3. It has same name as the className

        2 constructors cannot have same name
        constructors does not return anything
        In one class there is only one default constructor created
        but, it can be called as many times as many objects are created
*/

}