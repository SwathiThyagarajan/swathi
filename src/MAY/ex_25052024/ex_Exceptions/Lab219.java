package MAY.ex_25052024.ex_Exceptions;

public class Lab219 {
    public static void main(String[] args) {

//    I have given a simple program to my client it basically takes an argument in string
//    & converts the string into integer then divide it by 10 & print the value of x 10



        String sh = args[0]; // 5
        int x = Integer.parseInt(sh); // (String)5 -> 5(int) // int x = 5
        int a = 10/x; // 10/5 -> 2 // java.lang.ArithmeticException
        System.out.println(x);
        System.out.println(a);

        // If I run the above program we will find exception
// pass some command line arguments-> 5. output will be 5 & 0
// Integer.parseInt is  a function, this means convert string 100 into Integer 100


        // Below are Test cases for the program which can be used
        // -=> Input was 5 - Happy Test case
        // what inputs user can enter??
        // No Input - java.lang.ArrayIndexOutOfBoundsException
        // 0 - java.lang.ArithmeticException
        // -5 results will be given no exception
        // pramod - java.lang.NumberFormatException
        // 3.45 - java.lang.NumberFormatException
        // @@#$%^&^%$#% - java.lang.NumberFormatException-> because strings are converted into integer

//   Overall there are 3 Exceptions that may occur

        //  1. NumberFormatException
        //  2. ArrayIndexOutOfBoundsException
        //  3. ArithmeticException


        // How top fix the issues???
//
//        try {
//            // Code that may throw an exception
//        } catch (ExceptionType1 e1) {
//            // Code to handle ExceptionType1
//        } catch (ExceptionType2 e2) {
//            // Code to handle ExceptionType2
//        }
//// Optionally, more catch blocks for different exception types
//        finally {
//            // Code that will always execute, regardless of an exception
//        }

//Detailed Syntax Breakdown
//try Block:
//
//Contains code that might throw an exception.
//If an exception occurs, the control is transferred to the corresponding catch block.
//catch Block(s):
//
//Each catch block handles a specific type of exception.
//You can have multiple catch blocks to handle different types of exceptions.
//The parameter in the catch block (e.g., ExceptionType1 e1) is the exception type and the variable name for the caught exception.
//finally Block (Optional):
//
//The finally block contains code that will always execute, regardless of whether an exception was thrown or not.
//Typically used for cleanup activities like closing files or releasing resources.


    }
}
