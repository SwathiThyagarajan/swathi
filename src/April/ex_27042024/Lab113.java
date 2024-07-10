package April.ex_27042024;

public class Lab113 {
    public static void main(String[] args) {

        // Keyword - continue --> if this is true continue

        for (int i = 0; i <10; i++) {  //  i is executed 10 times, i value goes from 0 to 9
            System.out.println(i);
            if (i==5){
                continue;
            }
            System.out.println("After");

        }
        /*
        This code snippet demonstrates the usage of the continue statement within a for loop. Here's how it works:

     Initialization: int i = 0; initializes an integer variable i to 0 before the loop starts.
     Loop Execution: The for loop executes the following steps repeatedly
      until the loop condition (i < 10) becomes false:
     Condition: i < 10; specifies the condition for continuing the loop.
     The loop continues as long as i is less than 10.
     Increment: i++ increments the loop variable i by 1 after each iteration of the loop.
     Printing: Inside the loop:
    System.out.println(i); prints the value of i to the console.
    if (i == 5) { continue; } checks if the value of i is equal to 5.
    If it is, the continue statement is executed,
    causing the loop to skip the remaining code inside the loop and proceed to the next iteration.
    Output:
    For i from 0 to 9, the code prints the value of i to the console.
    When i is 5, the if condition i == 5 is true, so the continue statement is executed.
    This causes the code inside the loop after the continue statement
    (i.e., System.out.println("After");) to be skipped for that iteration.
         */






    }
}
