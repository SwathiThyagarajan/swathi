package MAY.ex_11052024_ClassObject;

public class Lab162 {
    public static void main(String[] args) {

        /*  OOPS CONCEPT:--
              Before oops concept we had Procedural Programming

        Procedural Oriented Programming
            This means we will convert everything into functions
           before oops concept we had Procedural Programming.
         *  Functions / steps to prepare Tea
            1. take bowl
            2. put water
            3. putMilkSugar
            4. put Teapowder
            5. wait for sometime
            6. Ready to serve
            Procedural Programming are like blocks (legos)
            you can use legos to create something which is not real
            Therefore we needed a programming language which is very real and can be used by humans
            and therefore oops concept was introduced
         */
        /* oops - Object-Oriented Programming
        oops concept is very close to real life
           Here 1st we need to understand Class then Object
           Class and Object together oops concept
           ex: Class is blueprint
           ex: you have a blueprint of a building
           I want to create a building, evrry building will have attributes and behaviour
           Every building will have a colour which is an attribute
           In same way every building will have lift you have walking space this is behaviour

            Suppose God has created a blueprint for how humans will look like.
           Every human will consist of Attributes and Behaviour
           Attributes are eye color, name, Fingerprint, 2 hands, address etc
           Behaviour are we can walk, talk and eat
           using Attributes and Behaviour as blueprint we can create humans
           ex we created Amit a real human using the blueprint with different Attributes and Behaviour
           I can create unlimited no. of real entities

         */

        /* What is this Blueprint
        Class is a Blueprint
        Every class will have attribute and functions(behaviour)
        Therefore class is nothing but a blueprint to create object
        when class is  created no memory is allocated
        when object is created memory is allocated

        HOW TO CREATE A CLASS ???
        We can create a class by name Person_class (Person_class is created refer it )

        // If u  create a sout Hello--> here Person_class the class that we created will not be loaded
            // So,we need to create an object
            // for this, you need to call class Person_class that we have created it will be known as Person reference

    // How to create an object --> by using new keyword with same name as class
    // Person_class personRef = new Person_class();
    // now class will be loaded in Lab 162
         */

        System.out.println("Hello");
        Person_class personRef = new Person_class();

        /*
           Here in line no. 64 the execution will happen like this
           In JVM now we have another concept called as class loader and object area which is present in heap area
           The moment we type Person_class p = new Person_class();  here p is reference
           Here 1st Person_class will be picked up and person class will be loaded
           So, class loader will load the class but still memory will not be allocated
           Next we have the Reference p. which means p will be assigned to Person_class
           here p is not pointing to anything, so as of now p will point to null
           we cannot assign anything to class loader so this p will be pointing to null in object area

           suppose if u type only Person_class p;
           then class will be loaded and p will be pointing to null in object area

           When u type new then a new memory is created with attributes and behaviour/functions
           and now this memory will be allocated to Person_class
           Now this is a real entity/ object and p will be pointing to this after new operator
           So, p can access all the Attributes and functions/behaviour

           When u create a new person Amit then a new memory will be created in object area
           with attributes and behaviour/functions and amit will be pointing to this memory

           Let's consider the reference p is pramod
           The attributes and behaviour/functions will be different from amit
           ex: pramod can walk fast amit cannot walk fast
           */

        System.out.println("Hi");
        Person_class amit = new Person_class(); // i have created amit reference
        amit.name = "Amit"; // if i say amit.name then name will be Amit
        System.out.println(amit.name);// if i print amit.name the value it will print is "Amit"
        Person_class pramod = new Person_class(); //now we have 2 objects
//        Person_class kanika; // still we have 2 classes only this is just class name with reference
        // Kanika will point to null
        Person_class kanika = null;// here kanika cannot access attributes and behaviour
        System.out.println(kanika);// it will give u error asking u to assign it to null

        /*  INTERVIEW QUESTION
    SYNTAX
              ClassName  object_Reference = object()--> (new ClassName())

           So, here new Person_class is the object
           amit is reference variable of size 8 bit
           Person_class this is the blueprint which is  class

           So, a class Person_class is used to create an object new Person_class();
           and amit is the reference variable which is pointing new Person_class();

           so, in the JVM class loader will have Person_class
           in the object area a new person is created with the attributes and behaviour
           and amit reference is pointing to this

        Class ->is blueprint -it will have Attribute, Behaviour - Not Real because it is just  blueprint
        Object -> Real Entities ->created from Class -they also have Attributes, Behviours => functions
        only after creating object only then u can assign name, attributes and behaviour

*/



    }

}
