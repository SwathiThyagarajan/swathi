package April.ex_13042024;

public class Lab019 {
    public static void main(String[] args) {

        // final means the value cannot be changed
        final float pi = 3.145f;
        System.out.println(pi);
        //pi = 10.89; --> not allowed

        float pi1 = 3.145f;
        pi1 = 10.89f;
        System.out.println(pi1);

        final int pi_int = 19;
        // pi_int = 89; -->not allowed
        System.out.println(pi_int);

        /*
         Key Points

         The final keyword in Java is used to declare constants,
         meaning that once a value is assigned to a final variable, it cannot be changed.

Final Variables:

        final variables cannot be reassigned once they have been initialized.
        They are constants and their values remain unchanged throughout the program.
        Attempting to change the value of a final variable will result in a compilation error.
Non-Final Variables:

        Regular variables (non-final) can be reassigned to different values as needed.
         */



    }


}
