package April.ex_27042024;

import java.util.Scanner;

public class Lab120 {
    public static void main(String[] args) {

        // INTERVIEW QUESTION - Factorial Program

        /* 1! -> 1
           2! -> 2*1 -> 2
           3! -> 3*2*1 -> 6
           4! -> 4*3*2*1 -> 24
           5! -> 5*4*3*2*1 -> 120
         */

        // How to do Factorial program using for loop and scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

        long factorial = 1;

        // ex i = 5; to create a 5 factorial i will start from i*1, i*2, i*3, i*4, i*5
        // here each time we are incrementing by 1
        // when to exit when i <= 5

        /* Therefore the conditions are :-
           Step 1 - Initialization i =1
           Step 2 -  i <= num
           Step 3 -  i++
        */
        for (int i = 1; i <= num; i++) {
            factorial = factorial *i;
        }
        System.out.println(factorial);




        //Scanner sc = new Scanner(System.in); // Step 1: Create a Scanner object to read input from the console
        // since already created in line 18 don't create again
        System.out.println("Enter the number"); // Step 2: Print a message to prompt the user to enter a number
        int num1 = sc.nextInt(); // Step 3: Read the entered number from the console and store it in the variable 'num1'

        long factorial1 = 1; // Step 4: Initialize a variable 'factorial1' to store the factorial of the entered number and set it to 1

        // Step 5: Loop to calculate the factorial of the entered number
        for (int p = 1; p <= num1; p++) { // Step 5a: Initialize a loop variable 'p' to 1, loop as long as 'p' is less than or equal to 'num1', and increment 'p' by 1 after each iteration
            factorial1 = factorial1 * p; // Step 5b: Update the 'factorial1' variable by multiplying it with 'p'
        }

        System.out.println(factorial1); // Step 6: Print the calculated factorial to the console
        sc.close(); // Step 7: Close the Scanner object to release system resources


        /*Explanation of each step:

                     1. Scanner Object Creation:
          Scanner sc = new Scanner(System.in); creates a Scanner object named sc to read input from the console.
                     2. User Prompt:
          System.out.println("Enter the number"); prints a message to the console, prompting the user to enter a number.
                     3. Read Input:
          int num1 = sc.nextInt(); reads the integer input entered by the user from the console and stores it in the variable num1.
                     4. Factorial Initialization:
          long factorial1 = 1; initializes a long variable named factorial1 to store the factorial of the entered number.
          It's initialized to 1 because the factorial of 0 is 1.
                     5. Factorial Calculation Loop:
          The for loop iterates from 1 to the entered number (num1).
                Inside the loop:
          factorial1 = factorial1 * p; updates the factorial1 variable by multiplying it with the loop variable p.
          This calculates the factorial iteratively.
                      6. Print Result:
          System.out.println(factorial1); prints the calculated factorial to the console.
                      7. Resource Closure:
          sc.close(); closes the Scanner object sc to release system resources. It's good practice to close the Scanner when it's no longer needed.
*/






    }
}
