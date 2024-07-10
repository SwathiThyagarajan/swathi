package April.ex_18042024;

public class Lab040 {
    public static void main(String[] args) {

        /**
         * byte + byte --> int
         * char + char --> int
         * short + byte --> int
         * int + int -->  int
         * int + long --> long
         * byte + double --> double
         * float + int --> float
         * float + long --> float
         * char + double --> double
         * int + double --> double
         * char + int  --> int
         * short + char --> int
         * short + float --> float
         **/
        // JVM says if your using 2 smaller containers the moment you add them JVM is not sure if you can store it in smaller container.
        // Therefore  a bigger container is used. Always JVM uses bigger container. This is Implicit Casting
        byte a = 10;
        byte b = 20;
        //byte c = a+b; --> not allowed
        System.out.println(a+b);





    }
}
