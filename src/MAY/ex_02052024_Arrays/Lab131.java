package ex_02052024;

public class Lab131 {
    public static void main(String[] args) {

        // How command line arguments are injected/ given to String[]args in main method ??????

        // How to take user input and store it in an array??
        // (String[] args) in main method --> this is also an array

       // How to give arguments?? for main method
        // Accessing command-line arguments
       //   1. Type the following sout
        System.out.println("First argument: " + args[0]); //--> This prints the first element of the array args
        System.out.println("Second argument: " + args[1]);// --> This prints the second element of the array args

       /*   2.Next In above title bar next to debug symbol click on 3 dots and select edit
         now in program arguments box enter Swathi (this will be the 1st element)
         now give space and type the 2nd element 30 and click Run
         in console u can see the output as Swathi 30       */

        // the number 30 will be stored in string format
        // a `String` can contain any sequence of characters, including letters, digits, symbols, and whitespace.
        //Here are some examples of strings containing numbers:
        //
        String str1 = "123"; // A string containing the digits 1, 2, and 3
        String str2 = "Hello123"; // A string containing both letters and digits
        String str3 = "3.14"; // A string representing a decimal number
        String str4 = "42 is the answer"; // A string containing a number and additional text
        System.out.println(" A `String` can contain any sequence of characters, including letters, digits, symbols");
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        String[] d= {"Swathi", "45", "true", "45.35","","@!#$*&#@"};// initialized an array of strings named d with different types of data.
        //System.out.println(d); if u use sout d gives the location ([Ljava.lang.String;@3feba861) where d is stored
        for (String element : d) {
            System.out.println(element); // This for loop will print each element of the array d on a separate line.

            /*   In Java, when you directly print an array object (like System.out.println(d)),
         it doesn't print the contents of the array but rather the reference to the array object and its memory address.

Here's a breakdown of what you're seeing:

[Ljava.lang.String;: This part indicates that the object being printed is an array ([) of type java.lang.String (Ljava.lang.String;).
@3feba861: This is the hexadecimal representation of the memory address where the array object is stored.
To print the contents of the array d, you need to iterate over its elements and print each one individually */

        }

        /* Functions are pre-built utilities they are already present
           Function example -> Math.pow()--> pre-built utility
           General  example -> Pizza base which is readily available
         */

        /* Trying to find the default value of args in main method
        System.out.println(args[0]);// Printing the array - Index 0,
         The output will show an exception

        String[] Swathi = new String[6]; // only by using new operator you can find the default value
        System.out.println(Swathi[0]); // now default value will be null
         default value will be given only when u type new value */

        /*In Java, the args parameter in the main method is used to receive command-line arguments
         when the program is executed from the command line.
         However, if the program is run without any command-line arguments, the args array will still be present,
         but it will be an empty array, not null.
         This means args.length will be 0, and there will be no elements in the array.
         */

        /* When you try to access args[0] without passing any command-line arguments,
         it will throw an ArrayIndexOutOfBoundsException because there are no elements in the args array,
         and therefore, there's no element at index 0.
         To handle this situation, you should always check the length of the args array before accessing its elements:
         */

                if (args.length > 0) {
                    System.out.println(args[0]);
                } else {
                    System.out.println("No command-line arguments provided.");
                }
                /*  This code snippet is part of a Java program that checks whether any command-line arguments
                  were provided when the program is executed. Let's break it down:
                 args.length > 0: This condition checks whether the args array has a length greater than 0,
                 indicating that command-line arguments were provided when the program was executed.
System.out.println(args[0]);: If the condition is true (i.e., command-line arguments were provided),
this line prints the first command-line argument to the console.
 In Java, command-line arguments are stored as strings in the args array, and args[0] represents the first argument.
System.out.println("No command-line arguments provided.");:
If the condition is false (i.e., no command-line arguments were provided),
this line prints "No command-line arguments provided." to the console.
So, this code snippet essentially checks whether any command-line arguments were provided and prints the first argument if available,
 or a message indicating that no arguments were provided if the args array is empty.
          */
        // This way, you ensure that you're accessing elements of the args array only if it contains any elements,
              // thus avoiding the ArrayIndexOutOfBoundsException
    }
}
