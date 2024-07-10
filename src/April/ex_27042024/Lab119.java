package April.ex_27042024;

public class Lab119 {
    public static void main(String[] args) {

        int i = 1;
        while (i <= 10){
            System.out.println(i);
            i = i + 2;
        }
        /*
            Step - 1 Initial value of i = 1
            Step - 2 Iteration1 i = i+2-> 1+2= 3
            Step - 3 Iteration2 i = i+2-> 3+2= 5
            Step - 4 Iteration2 i = i+2-> 5+2= 7
            Step - 5 Iteration2 i = i+2-> 7+2= 9
            Step - 6 Iteration2 i = i+2-> 9+2= 11 --- not executable because condition is i = <= 10
         */

        int t = 1;
        while (t <= 10){
            System.out.println(t);
            t = t + 3;
        }
        /*
        Step - 1 Initial value of t = 1
        Step - 2 Iteration1 t = t+3-> 1+3= 4
        Step - 3 Iteration2 t = t+3-> 4+3= 7
        Step - 4 Iteration2 t = t+3-> 7+3= 10
        */

        int z = 10;
        while (z >= 1){
            System.out.println(z);
            z--; // z = z-- this is wrong it will lead to infinite loop
        }

        /*
        int z = 10;                 // Initialize z to 10
        while (z >= 1) {            // Check if z is greater than or equal to 1
            System.out.println(z);  // Print the current value of z
            z = z--;                // Decrement z by 1 (incorrect decrement)
        }
        In the line z = z--;, the intention seems to be to decrement z by 1.
        However, this expression results in undefined behavior.
        The post-fix decrement operator (z--) decrements the value of z,
        but it also returns the original value of z before the decrement.
        Then, the assignment operator (=) assigns the original value back to z,
        effectively making no change to the value of z.

        Because of this incorrect usage, the value of z remains the same in each iteration of the loop,
        causing it to continue indefinitely, resulting in an infinite loop.

       To fix the code and achieve the intended behavior of decrementing z by 1 in each iteration,
       you should remove the postfix decrement operator and simply use z = z - 1; or z--;.
       Here's the corrected code:

        int z = 10;
        while (z >= 1) {
            System.out.println(z);
            z--;  // Decrement z by 1
        }
        With this correction, the loop will correctly decrement z from 10 to 1 and print each value during the process.
        */









    }




}
