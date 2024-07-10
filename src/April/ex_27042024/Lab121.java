package April.ex_27042024;

import java.util.Scanner;

public class Lab121 {
    public static void main(String[] args) {

        // While Loop --> initialization -> condition -> Body -> Increment / Decrement

        // Do While Loop
        // Do While Loop - initialization -> Body -> condition -> Increment / Decrement

        int a = 0;
        do {
            System.out.println(a);
            a--;
        }while (a > -5);

        //step 1  -> initialization print a =0 output -> 0
        // step 2 -> body a-- -1 , is -1 greater than -5 output yes

       /*
      1.  Initialization:
        int a = 0;: Initializes an integer variable a with the value 0.

      2.  Do-While Loop Execution:
        The do-while loop executes the following steps:
        Loop Body:
        System.out.println(a);: Prints the current value of a to the console.
                a--;: Decrements the value of a by 1.

      3.  Loop Condition:
        while (a > -5): Checks if the value of a is greater than -5.
        If this condition is true, the loop continues; if false, the loop terminates.
        Loop Execution:
        In the first iteration:
        The value of a (0) is printed.
        a is decremented to -1.
        In the second iteration:
        The value of a (-1) is printed.
        a is decremented to -2.
        This process continues until the loop condition (a > -5) becomes false.

      4.          Termination:
        The loop continues until a reaches a value where it's not greater than -5.
        Since a is being decremented in each iteration,
        it will eventually reach a value where it's not greater than -5.
        The loop terminates when a becomes -5, as -5 is not greater than -5,
                causing the loop condition to evaluate to false.

      5.        Output:
        The loop prints the values of a from 0 down to -4, inclusive.
                The final value of a is -5, but it's not printed because the loop terminates before it can be printed.
        In summary, the do-while loop starts by executing the code block at least once, regardless of the loop condition.
        Then, it continues to execute the code block repeatedly as long as the loop condition remains true.
                The loop prints the values of a from 0 down to -4.
*/





    }
}
