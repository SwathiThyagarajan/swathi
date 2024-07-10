package April.ex_27042024;

public class Lab112 {
    public static void main(String[] args) {

        int num = 5;
        for (int i = 1; i <=10 ; i++) {
            System.out.println(num + "x" + i + "=" + (num*i));
        }
        // 5 + x + 1 + = + 5 ---> 5x1=5
        // 5 + x +  + = + 10 ---> 5x2=10
        // x here is multiplication symbol

        /*
        In the expression num + "x", num is an integer variable, and "x" is a string literal.
        When you use the + operator between an integer and a string,
        Java implicitly converts the integer to a string and concatenates it with the string.
        So, if num has a value of 5, then num + "x" evaluates to the concatenated string "5x"
         */
        /* This is useful when you want to combine numeric values with strings to create more complex output,
        such as in this case where you're generating a multiplication table
        and want to display the multiplication symbol ("x") between the number and its multiplier.
         */















    }
}
