package April.ex_20042024;

public class Lab067 {
    public static void main(String[] args) {

        double sq = Math.sqrt(2);
        System.out.println(sq);

        double cube_root = Math.cbrt(27);
        System.out.println(cube_root);

        //The `Math.abs()` method in Java returns the absolute value of a number. The absolute value of a number is its distance from zero on the number line, irrespective of its sign. In simpler terms, it gives you the positive value of a number, regardless of whether the original number was positive or negative.

        //        Here's how you can use it:

        double number = -5.5;
        double absoluteValue = Math.abs(number);
        System.out.println("Absolute value of " + number + " is: " + absoluteValue);

        /*In this example, `-5.5` is the input number. `Math.abs()` returns `5.5`,
        which is the distance of `-5.5` from zero on the number line. So, the absolute value of `-5.5` is `5.5`.
        You can use `Math.abs()` with integers, longs, floats, and doubles.*/

        // in same way you can use other math.functions

       /* The `Math.signum()` method in Java returns the signum function of a double value.
        The signum function indicates the sign of a number. It returns:

        - 0.0 if the argument is zero.
        - 1.0 if the argument is greater than zero.
        - -1.0 if the argument is less than zero.

        Here's how you can use it:*/

        double number1 = -7.5;
        double signum = Math.signum(number1);
        System.out.println("Signum of " + number1 + " is: " + signum);

       /* In this example, `-7.5` is the input number. Since it's negative, `Math.signum()` returns `-1.0`,
       indicating that the sign of `-7.5` is negative.

        You can use `Math.signum()` with integers, longs, floats, and doubles.
        It's particularly useful when you need to check the sign of a number or perform specific operations based on its sign.
*/
    }
}
