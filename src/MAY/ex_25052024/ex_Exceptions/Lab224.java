package MAY.ex_25052024.ex_Exceptions;

public class Lab224 {
    public static void main(String[] args) {

//        int a = 0;
//        int x = 10 / a;

        final double pi = 3.14;
        try {
            int a = 0;
            int x = 10 / a; // here we will get Arithmetic Exception
        } catch (Exception e) {// it will be catch by (Exception e)
            System.out.println("Exit");// this code will be executed
        } finally { // finally belongs to Exception it works only with try. we can use only try & finally also
            System.out.println("I am final");
        }

        // final and finally both are different
       // finally is used with try
    }
}
