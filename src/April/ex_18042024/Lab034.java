package April.ex_18042024;

public class Lab034 {
    public static void main(String[] args) {

        // Logical operators
        // Not Gate, OR Gate, And Gate

        // In Java, the expression 10 > 20 evaluates to false because 10 is not greater than 20.
        // However, the ! operator before it negates the result.
        // So, (!(10 > 20)) evaluates to true.
        // This means that the statement 10 is not greater than 20 is indeed true.
        // !-> is a negation operator - if a sentence is true it changes it into false and vice versa

        boolean a = true;
        System.out.println(!a); // !a --> means not of a.
        System.out.println(!(10>20));
        System.out.println(!!(30>90));
        System.out.println(!!!(30>90));
        System.out.println(!!!!(30>90));
        System.out.println(!!!!!(30>90));




    }
}
