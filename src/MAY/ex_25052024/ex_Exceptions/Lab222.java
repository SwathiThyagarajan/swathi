package MAY.ex_25052024.ex_Exceptions;

public class Lab222 {
    public static void main(String[] args) {


        int a = 0;
        try {
            a = Integer.parseInt(args[0]);
        } catch (NumberFormatException exception) {
            exception.printStackTrace();
        }

        try {
            int b = 10 / a;
        } catch (ArithmeticException exception) {
            exception.printStackTrace();
        }


        try {
            String ip = args[0];
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace(); //StackTrace is thge log messages showing which line has error
        }
// The above same thing can be done as below which a good programmer does

        int a1 = 0; // Initialize a1 with a default value of 0 outside of the try block

        try {
            // Attempt to parse the first command line argument to an integer
            a1 = Integer.parseInt(args[0]);

            // Attempt to divide 10 by the value of a1
            int b = 10 / a1;

            // Attempt to access the first command line argument
            String ip = args[0];
        } catch (NumberFormatException | ArithmeticException | ArrayIndexOutOfBoundsException exception) {
            // Catch and handle NumberFormatException, ArithmeticException, and ArrayIndexOutOfBoundsException
            exception.printStackTrace(); // Print the stack trace for debugging purposes
        }

        System.out.println("End of Program!");


    }
}
