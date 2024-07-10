package JUNE.ex_01062024;

public class Lab257 {
    public static void main(String[] args) {


        // How to create everything into generic

        // I have a function
        printF(3,4);
        printF("Pramod ","Dutta");// u cannot do this because u have hard code this datatype as Integer
        printF(true, false);
        printF(3.12, 4.34);

    }

    // creating a method
//    private static void printF(int i, int i1){
//        System.out.println(i);
//        System.out.println(i1);
//    }
//
//    private static void printF(String i, String i1){
//        System.out.println(i);
//        System.out.println(i1);

        // Instead of creating 2 methods we can create 1 method and replace data type with T
        private static <T> void printF(T i, T i1){
            System.out.println(i);
            System.out.println(i1);

            // Above insted of T it can be anything ex Pramod
            // here when u pass interger pramod becomes integer
            // whatever data type u pass pramod will change into that data type
    }
}
