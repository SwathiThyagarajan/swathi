package MAY.ex_25052024.ex_Exceptions;

public class Lab223 {
    public static void main(String[] args) {

//        String s1 = "Pramod";
//        s1 = null; This code is Vulnerable so, I will put it in Try and catch block
//   when u knw abt NullPointException instead of using Exception e
//   we can use NullPointException.
//        System.out.println(s1.trim());
// int a = 10 / 0; now this is not NullPointException. it is ArithmeticException u can add it side by side
//  String a1 = args[0]; if 1 more error is made u need to add 1 more exception

//  Until u know wht the exception is about u will add the exception name in catch
//  if u don't know u will call the father --> Exception e.

        try {
            // Initialize a string variable with a value
            String s1 = "Pramod";

            // Attempt to access the first command line argument
            // Potential issue: If no argument is provided, this will throw ArrayIndexOutOfBoundsException
            String a1 = args[0];

            // Attempt to divide by zero
            // This will throw ArithmeticException
            int a = 10 / 0;

            // Set the string variable to null
            s1 = null;

            // Attempt to call a method on a null object
            // This will throw NullPointerException if it were to be executed
            System.out.println(s1.trim());
        } catch (Exception e) {
            // Catch any exception that is a subclass of Exception
            // This block will execute if any exception occurs in the try block
            System.out.println("something went wrong!");
        }

        System.out.println("End of Program!");
        // This line will always execute, regardless of whether an exception occurred or not

/*
     Exception Handling:
    In this specific program:

    1) If no command line arguments are provided, String a1 = args[0];
    will throw an ArrayIndexOutOfBoundsException.
    2) int a = 10 / 0; will always throw an ArithmeticException.
    3) System.out.println(s1.trim()); is never reached because the previous line throws an exception.

    The catch block will catch any of these exceptions and print "something went wrong!"
    before the program prints "End of Program!".
 */

        try {
            String s1 = "Pramod";
            String a1 = args[0];
            int a = 10 / 0;
            s1 = null;
            System.out.println(s1.trim());
        } catch (Exception e) {
            System.out.println("something went wrong!");
        }
        System.out.println("End of Program!");

    }
}
