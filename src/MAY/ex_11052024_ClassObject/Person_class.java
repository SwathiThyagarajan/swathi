package MAY.ex_11052024_ClassObject;

public class Person_class {

    // This is how we create a class
            // Until now we have not created a main method which means we cannot Run this program
            // Therefore it also means  this class what we have created below is not loaded in JVM
            // If u go to Lab 162 and create a sout Hello--> here Person class that we created will not be loaded
            // So, in Lab 162 we need to create an object
            // for this, you need to call class Person_class that we have created it will be known as Person reference

    // How to create an object --> by using new operator with same name as class
    // Person_class personRef = new Person_class();
    // now class will be loaded in Lab 162

/*
      Whenever we create a class. class is a Blueprint
    The name of the class we created here is Person_class
    It is a public class. public basically means anyone can use it

    This clas will have 2 things Attributes and Behaviour/ Functionality
 */

    // Attributes are:--
    // name, age, DOB, height, is male, eye color, fingerprint, phone no., address, salary
    String name;
    byte age;
    long phone_no;
    String[] address;
    double height;
    boolean isMale;
    float salary;
    String DOB;
    String eye_color;

    // Behaviour/ Functionality are:--
    // walk,
    void walk(){
        System.out.println("I can Walk"); // this is no return type no parameter function
    }
    void talk(String msg){
        System.out.println("I will say -->"+ msg);// this is no return type parameter function
    }
    String sleep(){
        return "Sleeping"; // this is return type with no parameter
    }
    String eat(String item){
        return item; // this is return type with  parameter
    }




}
