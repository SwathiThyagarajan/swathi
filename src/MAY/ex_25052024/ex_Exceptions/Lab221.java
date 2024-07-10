package MAY.ex_25052024.ex_Exceptions;

public class Lab221 {
    public static void main(String[] args) {
        try {
            String sh = args[0]; // 1 //5,15 -> String 5 -> java.lang.ArrayIndexOutOfBoundsException
            int x = Integer.parseInt(sh); // 2 ->  java.lang.NumberFormatException prmaod-> int?
            int a = 10 / x; // 3 - java.lang.ArithmeticException

            System.out.println(x);
            System.out.println(a);
        }catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println("Can you please enter Input?");
        }// if u don't handle the code it will go to JVM. JVM will terminate the program.
        //  so we should use try & catch so that JVM does not terminate the program

//
//         How program will be executed ????
//        JVM will be Initialized--> memory will be allocated
//        Creates and Starts the main Thread. --> main method will be called
//        main Thread will do the following tasks
//        1)Collects the Command Line Arguments
//        2)Creates the String array with CLA
//        3)Calls main method by passing String array as Parameter:
//         Lab211.main(5)
//        Now Control will be transfered from main Thread to main method
//        Control will come back to main thread in two ways.
//        A)When problem comes in main ->  JVM .
//       JVM  Creates the Object of Identified Exception class.
//      & give the error-->   Exception a=new Exception()

/*
     how the Java Virtual Machine (JVM) initializes and executes a Java program ??

    1) JVM Initialization and Memory Allocation:
     Yes, the JVM initializes and allocates memory for the program.

    2) Main Thread Creation and Execution:
     After initialization, the JVM creates and starts the main thread.
      The main thread is responsible for executing the main method of the program.

    3) Command Line Arguments:
     The main thread collects the command line arguments provided when the program is invoked
      and stores them in the args parameter of the main method.

    4) Main Method Invocation:
     The main method is called by the JVM, passing the command line arguments as a string array parameter.

    5) Control Transfer to main Method:
     Once the main method is invoked, control transfers to the main method,
      and the statements within it start executing.

    6) Handling Exceptions:
     If an exception occurs within the main method or any method it calls,
     the JVM follows the exception handling mechanism. When an exception occurs,
      the JVM creates an object of the exception class corresponding to the type of exception thrown.
       For example:
      Exception e = new Exception("Some message");
    This object can then be used to catch and handle the exception.
 */


    }
}
