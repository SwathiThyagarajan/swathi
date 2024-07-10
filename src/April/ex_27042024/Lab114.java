package April.ex_27042024;

public class Lab114 {
    public static void main(String[] args) {

        // Even and Odd number program using continue

        for (int i = 1; i <=10 ; i++) {
            if(i%2 == 0) {
                System.out.println("Even ->" + i);
                continue;
            }
            System.out.println("Odd ->" + i);

        }
        /*
        step 1 when i = 1, 1%2=0 is false so, this code will not be executed, it will go to else loop odd number
        step 2 when i = 2, 2%2=0 is true so, this code will be executed it will not go to else loop odd number
        if you are within  if loop we will not execute else loop
        if you are out of if loop we will  execute else loop
         */
        /*
       Here's what's happening:

1. **Loop Initialization and Condition**:
   - `int i = 1;`: Initializes a loop variable `i` with the value 1 before the loop starts.
   - `i <= 10;`: Specifies the condition for continuing the loop.
       The loop continues as long as `i` is less than or equal to 10.
   - `i++`: Increments the loop variable `i` by 1 after each iteration of the loop.

2. **Checking Even and Odd Numbers**:
   - `if (i % 2 == 0) { ... }`: Checks if the current value of `i` is even.
       If `i` is divisible by 2 without a remainder (`i % 2 == 0`), then it's even.
     - If `i` is even, `"Even -> " + i` is printed to the console.
     - The `continue` statement skips the rest of the code inside the loop for the current iteration and moves to the next iteration.

   - If the condition `i % 2 == 0` is not met (i.e., `i` is odd),
    the code inside the `if` block is skipped, and the `else` block is executed.
     - `"Odd -> " + i` is printed to the console for odd values of `i`.

3. **Output**:
   - For each iteration of the loop, if the current number `i` is even, it prints "Even -> i" to the console,
    where `i` represents the current value of `i`.
   - If `i` is odd, it prints "Odd -> i" to the console.
   - The loop continues until `i` reaches 10.


         */

        // Alternately we can use if else instead of continue

        for (int i = 11; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is Even");
            } else {
                System.out.println(i + " is Odd");
            }
        }




    }
}
