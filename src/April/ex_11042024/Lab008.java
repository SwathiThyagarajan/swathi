package April.ex_11042024;

public class Lab008 {

    public static void main(String[] args) {



        /**
         * Variables--> value of this can be changed throughout the program.
         *
         * suppose my name is swathi after sometime I changed my name to nethra
         * again name changed to nethu
         * here name is being changed again and again
         * Therefore the property here is the values are getting changed
         */

        /** Variable is a container (storage area) used to hold data
         * Each variable should be given a unique name (Identifier)
         * Identifier is a name given to a class, variable or method
         * Memory will be allocated for variable while executing the program
         */
        /**
         * Ex: In our kitchen we have a container for sugar.
         * The container is named/labelled as sugar
         * Inside the container there is some quantity sugar.
         * similarly you can store the values in programming language
         * eg; int age = 65
         * here int is integer it is a datatype
         * here int is a type of container and name given to it is age
         * the value it contains is 65
         */

        System.out.println(2+2);

        int age = 65;
        // it is Integer type of container storing 65 as value in the variable name age
        // the advantage of this is in future I can change the value by 70
        age = 70;
        //here you have changed the value of age from 65 to 70
        //to print the age in sout println bracket type (age)
        System.out.println(age);

        //java is a very strict language you cannot assign 70.2 to age
        // because this is not integer it is a decimal type of value
        // integer container is small container whereas decimal is of a big container
        // you cannot store bigger value in small container

        age = -1;
        System.out.println(age);
        // -1 is also an integer so, it is allowed
        //if you run the program the output is -1

        age = age +1;
        System.out.println(age);
        //if you run the program the output is 0 because -1 +1 = 0

        // Example 02 for VARIABLES

                // Declare and initialize variables
                int x = 5; // integer variable named x, initialized with value 5
                double y = 3.5; // double variable named y, initialized with value 3.5
                String name = "John"; // String variable named name, initialized with value "John"

                // Print the values of variables
                System.out.println("Value of x: " + x); // Output: Value of x: 5
                System.out.println("Value of y: " + y); // Output: Value of y: 3.5
                System.out.println("Name: " + name); // Output: Name: John

                // Update variable values
                x = 10; // Update the value of x to 10
                y = 7.2; // Update the value of y to 7.2
                name = "Alice"; // Update the value of name to "Alice"

                // Print updated values
                System.out.println("Updated value of x: " + x); // Output: Updated value of x: 10
                System.out.println("Updated value of y: " + y); // Output: Updated value of y: 7.2
                System.out.println("Updated name: " + name); // Output: Updated name: Alice



    }

}
