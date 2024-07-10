package April.ex_27042024;

public class Lab117 {
    public static void main(String[] args) {

        for (int i = 1; i <= 10 ; i=i*2) {
            System.out.println(i);
        }
       /* Initialization:
        int i = 1; initializes an integer variable i to 1 before the loop starts.
        Condition:
        i <= 10; specifies the condition for continuing the loop. The loop continues as long as i is less than or equal to 10.
        Loop Body:
        System.out.println(i); prints the current value of i to the console during each iteration.
        Increment/Update:
        i = i * 2 multiplies the current value of i by 2 in each iteration. This is the update step of the loop.
        Now, let's examine each iteration:

        1st iteration:
        i is 1 (initial value).
        i is printed: 1
        i is updated to 1 * 2 = 2.

        2nd iteration:
        i is 2 (updated value from the previous iteration).
        i is printed: 2
        i is updated to 2 * 2 = 4.

        3rd iteration:
        i is 4 (updated value from the previous iteration).
        i is printed: 4
        i is updated to 4 * 2 = 8.

        4th iteration:
        i is 8 (updated value from the previous iteration).
        i is printed: 8
        i is updated to 8 * 2 = 16.

        Since i becomes 16 after the 4th iteration, which exceeds 10, the loop terminates,
        as the condition i <= 10 is no longer true.*/

        for (int j = 1; j <= 10 ; j=j+2) {
            System.out.println(j);
        }

        /*1st iteration:
        j is 1 (initial value).
        j is printed: 1
        j is updated to 1 + 2 = 3.

        2nd iteration:
        j is 3 (updated value from the previous iteration).
        j is printed: 3
        j is updated to 3 + 2 = 5.

        3rd iteration:
        j is 5 (updated value from the previous iteration).
        j is printed: 5
        j is updated to 5 + 2 = 7.

        4th iteration:
        j is 7 (updated value from the previous iteration).
        j is printed: 7
        j is updated to 7 + 2 = 9.

        5th iteration:
        j is 9 (updated value from the previous iteration).
        j is printed: 9
        j is updated to 9 + 2 = 11.

        Since j becomes 11 after the 5th iteration, which exceeds 10,
            the loop terminates, as the condition j <= 10 is no longer true.*/





    }
}
