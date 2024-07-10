package ex_02052024;

public class Lab126 {
    public static void main(String[] args) {

        // INTERVIEW QUESTION

        final int [] ages = new int[4];
        // Default value of ages is = [0, 0,0,0]

        ages[3] = 78;
        ages[3] = 79;
        System.out.println(ages[3]);

        /* here even though we have used final keyword the values are getting changed
           because Arrays are Non-Primitive data type this is reference type
           -so, here final means final to the length size of the array is final not the content
           this is the difference between primitive and non-primitive.
             Non-primitive = String, Arrays
         */

        // final in primitive data type - byte, short, int, float, long, double, char, boolean

        final int a = 10; // here value of 'a' is final














    }
}
