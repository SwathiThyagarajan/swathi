package April.ex_20042024;

public class Lab053 {
    public static void main(String[] args) {

        /**
         * There are two ways to create a string
         * 1.Assignment operator (=)
         * 2.New operator (new)
         *
         *Both of them, save the name and name2 variable values in different ways in JVM  ---INTERVIEW QUESTION
         *
         * How they store the values in JVM???
         *which one we need to use when we create a string???
         */

        String name = "Swathi"; // Assignment operator
        // String name2 = new String(original: "Swathi"); // New operator
        //if you want to print name for string using Assignment operator then the options are
        System.out.println(name);// 1st option
        System.out.println("Your name is ->"+ name);// 2nd option by concatenation
        System.out.printf("Your name is -> %s",name);// 3rd option by using string format

        System.out.println("-- All the Functions available in String --");

        System.out.println(name.length()); // this prints the no. of characters present in name
        System.out.println(name.toLowerCase());// --> this converts the output in small case characters
        System.out.println(name.toUpperCase());// once you type name. what ever appears in dark black are extra functionalities
        //this converts the output in upper case characters
        int age = 65;
        char c = 'a';
        boolean b = true;

        byte num1 = 10;
        int num2 = 500;
        double num3 = 3.14;
        char letter = 'A';
        boolean flag = true;

        // Primitive Datatypes - byte, int, long, short, double, float,char
        // All of them don't have extra functionalities.
        /**
         * Primitive Data Types: These are the most basic data types and are predefined by the language.
         * They are used to store simple values. There are eight primitive data types in Java:
         * byte: 8-bit integer data type.
         * short: 16-bit integer data type.
         * int: 32-bit integer data type.
         * long: 64-bit integer data type.
         * float: 32-bit floating-point data type.
         * double: 64-bit floating-point data type.
         * char: 16-bit Unicode character data type.
         * boolean: Represents true or false values.
         */

        /** Reference Data Types / Non-Primitive Data Types:
         *  These data types are used to create objects and provide a way to access objects.
         *  Reference data types are also known as non-primitive data types.
         *  Some common reference data types include:
         *  String: Represents a sequence of characters.
         *  Array: Represents a collection of elements of the same data type.
         *  Class: Represents a blueprint for creating objects.
         *  Interface: Defines a set of methods that a class must implement.
         *  Enumeration: Represents a list of named constants.
         **/

        // Non-Primitive Data Type - String
        // They have extra functionalities


        // Java is not purely object oriented because of oops
        // OOPs condition is you don't have anything which is not in class format/ primitive
        // Definition of OOPs is everything should belong to a class
        // but primitive variables are not class that is why java is not purely object oriented programming language



    }
}
