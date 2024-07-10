package MAY.ex_07052024_Functions;

public class Lab150 {
    public static void main(String[] args) {

        // Until now, we saw Non-Return Type function
        // steps in Non-Return Type function
        // Define the function --> call the function

        // There are some function which can Return something
        // suppose I have a function as below

  //    double result = sum_of_two_number(); possible
  //    byte  result = sum_of_two_number(); not possible because byte is small data type compared to int
        int result = sum_of_two_number(); // since this function does not exist it will create a method
        System.out.println(result);

        // when we say int result = sum_of_two_number(); we are storing the result
        // the result int can be stored in double also --> widening
        // But you cannot store it in byte it is smaller basket narrowing
        /*
        Running the Program:
When you run this program, the following steps occur:

The main method is executed.
Inside the main method, sum_of_two_number is called.
The sum_of_two_number method computes 5 + 6 and returns 11.
The returned value 11 is stored in the variable result.
System.out.println(result); prints 11 to the console.
         */
    }

    /*
    A returning method is a method that performs some operations and then returns a value to the caller.
    The return type can be any valid Java data type, including primitive types (like int, double, char, etc.)
    and reference types (like objects of a class).

Key Characteristics:

The method signature specifies the return type.
The method body must include a return statement followed by a value that matches the specified return type.
     */
    static int sum_of_two_number() { // Defining a return type (int) instead of void
        return 5+6; // let's say ex: it can return the value of 5+6
        // since 5+6 is of a data type int we are changing void to int
    }
}
