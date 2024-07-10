package April.ex_18042024;

public class Lab044 {
    public static void main(String[] args) {

        // Increment (++) / Decrement (--) Operators
        //	Increment operator will be used to increase the value of the variable by 1
        // 	Decrement operator will be used to decrease the value of the variable by 1.

        // 2 Types - PRE and POST

        // PRE - Value is incremented first and then result is calculated
        int a = 10;
        int b = ++a; // ---> PRE ++a means a= a+1, 10+1-->11
        System.out.println(b);
        System.out.println(a);
        //b = 11
        //a = 11


        //a is initially assigned the value 10.
        //++a increments the value of a by 1 before its value is assigned to b.
        //After the increment operation, a becomes 11.
        //b is assigned the value of a, which is 11.
        //So, after this code executes:
        //The value of a becomes 11.
        //The value of b becomes 11.




    }
}
