package MAY.ex_23052024.static_Keyword;

import MAY.ex_14052024_Constructors.Person;

public class Lab202 {
    public static void main(String[] args) {
        // main method should always be static in nature beecause JVM has to recognise


        // creating an object
        person p1 = new person("Amit");
        person p2 = new person("Pramod");

//        p1.footBallClub; // this will be different from p2 only if footBallClub is non static
//        p2.footBallClub;

        // accessing footballclub both p1 and p2 have same footballclub
        System.out.println(person.footBallClub);

       // calling a static function
        // className.function
        person.m1();

        // calling a Non-static function using reference
        p1.m2();
        p2.m2();

        // changing the value of satic variable and static methods
     person.footBallClub = "ManU";
        System.out.println(p1.footBallClub);// output ManU
        System.out.println(p2.footBallClub);// output ManU


        p1.name = "Lucky";
        System.out.println(p2.name);// nothing will change in p2 even after changing p1 name

        // using reference to call static method
        p1.m1();
        p2.m1();

//        person.m2(); Non-static function cannot be accessed without reference

    }

}

// what u want to share across different objects
class person{

    // Amit and pramod join a football club
//    String footBallClub = "Arsenal"; // footBallClub is non static
    static String footBallClub = "Arsenal";


    // How many times a static block will be called
    static {
        System.out.println("I will be called once when class is loaded");
    }

    // creating an IIB
    {
        System.out.println("IIB");
    } // IIB is called twice because 2 objects are created

    // creating a static function
    static void m1(){
        System.out.println("I am a common function" );

//        System.out.println("I am a common function" + this.name);
//    u cannot access  this.name because it is non static member
//    non static member are called  when object is created

// but when static function is created they are loaded when class is loaded till then object is not created
    }

    // creating a Non-static function
    void m2(){
        System.out.println("I will print's the details of function, person -->" +this.name);
        // can this access footballclub ?? --> yes
        System.out.println(footBallClub);// whn object is created class was already created in class loader
        // and when class was loaded static variables are already loaded

    }

    String name;// everyone will have diffrent name son not common Therefore Non static

    // creating a parameterised constructor
    public person(String name) {
        this.name = name;
    }
}
/*
    The above code is a Java program that demonstrates the usage of static
    and non-static variables and methods in a class.
     Here's how the code will be executed in the Java Virtual Machine (JVM):

1. **Loading the Class**:
 When the JVM starts executing the program, it first loads the `person` class
  and its static members (the `footBallClub` variable and the `m1()` method) into memory.

2. **Executing the Static Block**:
 The static block `static { System.out.println("I will be called once when class is loaded"); }`
  is executed only once when the `person` class is loaded.

3. **Executing the `main()` Method**:
 The JVM then looks for the `main()` method in the `Lab202` class and starts executing it.

 Until objects are not created the Non static members, parameterized constructor



4. **Creating Objects**:
The moment you start creating an object it will call the parameterised constructor

 Inside the `main()` method, two objects (`p1` and `p2`) of the `person` class are created using
  the parameterized constructor `person(String name)`.
   For each object creation:
   - The instance initialization block (IIB) `{ System.out.println("IIB"); }` is executed,
    printing "IIB" twice (once for each object).
   - The non-static members (`name`) are initialized with the values
    passed to the constructor ("Amit" for `p1` and "Pramod" for `p2`).

5. **Accessing Static Members**:
 The static variable `footBallClub` and the static method `m1()` are accessed using
 the class name (`person.footBallClub` and `person.m1()`).
 Since static members are shared across all objects of the class,
  they will have the same value for both `p1` and `p2`.

6. **Accessing Non-Static Members**:
 The non-static method `m2()` is called using the object references (`p1.m2()` and `p2.m2()`).
  Inside `m2()`, the `name` instance variable and the static `footBallClub` variable are accessed.

7. **Modifying Static Members**:
 The static variable `footBallClub` is modified to "ManU",
  and this change is reflected for both `p1` and `p2` objects
   because static members are shared across all instances of the class.

8. **Modifying Non-Static Members**:
The non-static variable `name` of `p1` is modified to "Lucky".
 However, this change does not affect `p2` because non-static members are specific to each object instance.

9. **Calling Static Methods with Object References**:
 The static method `m1()` is called using object references (`p1.m1()` and `p2.m1()`).
 This is allowed in Java, but it is generally not recommended as it can lead to confusion and less readable code.

10. **Attempting to Call Non-Static Method with Class Name**:
 The commented line `//person.m2();` demonstrates that a non-static method cannot be called
 using the class name because non-static methods require an instance of the class to operate on.

Throughout the execution, the JVM manages the memory allocation and deallocation
 for objects and class members, as well as the execution of static and non-static code blocks and methods.


 */



