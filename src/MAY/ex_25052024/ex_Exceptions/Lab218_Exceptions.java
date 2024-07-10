package MAY.ex_25052024.ex_Exceptions;
public class Lab218_Exceptions {
    public static void main(String[] args) {

        //Exceptions
        //An exception is an event that occurs during the execution of a program
        // that disrupts the normal flow of instructions.
 //       String s1 = null; // output--> NullPointerException:
 //       s1.trim();// Cannot invoke "String.trim()" because "s1" is null

        int a = 10; // ArithmeticException
        int c = a/0;// u cannot divide any no. with 0
        System.out.println(c); // this is not possible u will get arithmetic exception
/*
       In Java, exceptions are organized into a hierarchy,
        with the root of the hierarchy being the Throwable class.
         The Throwable class has two main subclasses: Error and Exception.
          Here's a basic overview of the exception hierarchy:

Throwable class:-

This is the root class of the Java exception hierarchy.
 It has two main subclasses: Error and Exception.

 1.Error

   Errors are exceptional conditions that are external to the application,
and that the application usually cannot anticipate or recover from.
  Examples include OutOfMemoryError, StackOverflowError, etc.
   Errors are typically not caught by applications.

2.Exception

    Exceptions are exceptional conditions that occur during the execution of the program.
They can be caused by a variety of factors, including user error, system malfunctions,
or programming errors.

a. Checked Exceptions

Checked exceptions are exceptions that the compiler requires you to handle explicitly
by either catching them or declaring that your method throws them.
 Examples include IOException, SQLException, etc.

b. Unchecked Exceptions (Runtime Exceptions)

Unchecked exceptions are exceptions that the compiler does not require you to handle explicitly.
They usually represent programming errors or conditions that are unlikely to occur in normal operation.
Examples include NullPointerException, ArrayIndexOutOfBoundsException, ArithmeticException, etc.

c. Custom Exceptions

You can also define your own exception classes by extending either Exception or one of its subclasses.
This allows you to create custom exception types tailored to your application's specific needs.
 */


        // INTERVIEW QUESTION
        // 1. what is error?
        // error is something uncontrollable if error occurs humans can't handle it
        // it will stop the execution

        // we can only handle exceptions



    }
}





