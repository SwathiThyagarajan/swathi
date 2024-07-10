package April.ex_20042024;

public class Lab065 {
    public static void main(String[] args) {

        //TERNARY OPERATOR (?)--> QUESTION MARK
        // if thos do this 1, if not do this 2

        boolean result = 10>40 ? 10>40 : 40>10;
        System.out.println(result);

        int a = true? 10:20;
        // if condition is true a value will be 10
        // if condition is false a value will be 20
/**
 * true is the condition. In programming languages like Java, the boolean value true represents a condition that is always true.
 * Since the condition is true, the expression after the ? is evaluated. In this case, it's 10.
 * Therefore, the variable a will be assigned the value 10, because the condition is true.
 * This is how the ternary operator works:
 * it selects one of two values based on the result of a condition.
 * If the condition is true, it selects the first value (in this case, 10);
 * if the condition is false, it selects the second value (in this case, 20).
 **/
        int a1 = (30>40)? 10:20;
        System.out.println(a1);

        String str = 10 > 20 ? "10" : "Twenty";
        System.out.println(str);
    }
}
