package MAY.ex_07052024_Functions;

public class Lab148 {
    public static void main(String[] args) {

        // main method is also a function
        // you can call the function multiple times

        System.out.println("Starting");// This is starting of the program
        f1(); // we are calling f1
        f1(); // we are calling f1 again
        f1(); // we are calling f1 again
        f2(); // we are calling f2
        f2(); // we are calling f2 again
        f2(); // we are calling f2 again
        f1(); // we are calling f1 again
        // so, we have written the code only once. But you can call the function multiple times
    }

    static void f1() { // This is function 1
        System.out.println("F1");
    }
    static void f2() { // This is function 2
        System.out.println("F2");
    }
}
