package April.ex_27042024;

import java.util.concurrent.atomic.AtomicInteger;

public class Lab115 {
    public static void main(String[] args) {

        // While Loop

        // A - Init
        // B - Condition
        // C - Increment

        int i = 1; // A
        while (i <= 10) { // B
            // Execute the code
            System.out.println(i);
            i++; // C

            // i - 1 to 10 , print 1 to 10
        }
        /*Initialization (Step A):
        int i = 1; initializes an integer variable i to 1 before entering the loop. This is the initial value of i.
                Loop Condition (Step B):
        while (i <= 10) specifies the condition for continuing the loop. The loop will continue executing as long as the value of i is less than or equal to 10.
        Loop Body (Execution of Code):
        The statements inside the loop body (between {}) are executed repeatedly as long as the loop condition (i <= 10) remains true.
                System.out.println(i); prints the current value of i to the console during each iteration.
        Increment/Update (Step C):
        i++; increments the value of i by 1 after each iteration. This is necessary to ensure that the loop condition (i <= 10) eventually becomes false, terminating the loop.
        i++ is a shorthand for i = i + 1, meaning it increases the value of i by 1.
        Now, let's examine each iteration:

        1st iteration:
        i is initialized to 1 (Step A).
        Since i <= 10 (Step B) is true, the loop body is executed.
        The value of i (which is 1) is printed to the console (Step C).
                i is incremented by 1, becoming 2 (Step C).
        2nd iteration:
        i is now 2.
        The loop body is executed again, printing 2 to the console.
                i is incremented to 3.
        3rd iteration, and so on, until i becomes 10.
        Last iteration (10th):
        i is 10.
        The loop body is executed, printing 10 to the console.
                i is incremented to 11.
        After the 10th iteration:
        i becomes 11, and the loop condition i <= 10 is no longer true.
                The loop terminates, and the program continues with the next statement after the loop.*/

        for (int j = 1; j <= 10; j++) {  // for loop
            System.out.println(j);
        }


        /*For Loop:

        The for loop is a control flow statement used to execute a block of code multiple times.
                It's typically used when the number of iterations is known before entering the loop.
        The syntax of a for loop includes initialization, condition, and iteration expressions, all in one line.
                Example:*/
        for (int k = 0; k < 5; k++) {
            System.out.println("Iteration " + k);
        }
        /*In this example, the loop executes 5 times, starting from i = 0, incrementing i by 1 each time until i is less than 5.
        While Loop:

        The while loop is also a control flow statement used to execute a block of code multiple times.
        It's used when the number of iterations is not known beforehand and depends on a condition.
        The syntax of a while loop includes only the condition expression.
        Example:*/

        int a = 10;
        while (a <= 15) {
            System.out.println(a);
            a++;
        }



        /*In this example, the loop executes as long as the condition i < 5 is true.
            The loop initializes i outside the loop and increments it within the loop.
        Comparison:

        Both loops can be used to achieve the same result in many cases.
        The for loop is more compact and often used when the number of iterations is known.
        The while loop is more flexible and used when the loop's termination depends on a condition that may change during execution.
        It's important to ensure that the loop's condition is eventually false to prevent infinite loops.
        In summary, both the for loop and the while loop are used for iteration in Java,
        but they have different use cases and syntax.
        The choice between them depends on the specific requirements of the problem you're solving.*/

    }
        }





