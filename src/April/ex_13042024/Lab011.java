package April.ex_13042024;

public class Lab011 {
    public static void main(String[] args) {

        /*
        how to define a Datatype
        Datatype-->Identifier/variable name = variable value(literal)
         */
        /** In Java, we have 2 types of datatypes
         * 1.primitive datatype-->primitive datatype cannot be further broken
         *   ex: byte, short, int, float, double,boolean, long, char.
         *
         * 2.Non-primitive datatype-->can be further broken
         * In Non-primitive datatype we have
         *     string, arrays and class
         **/

        /** There are 3 types of variables:
         * Local, Instance and class
         * 1.Local Variable: Variables that are declared inside the method are called Local variables
         */

        // Local variable
        int age = 45;
        // here int age = 45; is there within the main method Therefore it is local variable

        // Datatypes are differentiated based on Size and Range.(Refer Java notes pdf)

        //byte Range--->(-128 to +127)
        byte b = -128;
        //byte b2 = -200;
        byte b3 = -1;
        byte b4 = 127;
        //byte b4+1; --> 127+1=128 this is over flow, out of range, so not allowed

        //short range--> (-32768 to + 32768)
        short s = -31547;
        short s2 = -1;
        //short s3 = 33678;---> not allowed





    }
}
