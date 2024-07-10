package ex_07052024;

public class Lab151 {
    public static void main(String[] args) {


        // functions can take parameters also ex:

        // I can call a+b with any number and store the results
        int r1 = sumofTwo(4,5);// Calling the static method
        System.out.println(r1);
        int r2 = sumofTwo(10,11);
        System.out.println(r2);

        String r3 = sumofTwo("Swathi", 15);
        System.out.println(r3);

    }

    // Syntax
    // Static method
   //  public static returnType methodName(parameters) {
    // public static int         add(int a, int b) {
    //    method body---->   return a + b;


    // functions can take parameters also ex:
    // Static method to add two numbers
    static int sumofTwo(int a, int b) { // these are parameters
        return a+b; // 'return' keyword used to return the sum
    }

    // You can create another function with same name but parameter is different
    static String sumofTwo(String a, int b){
        return a+b;
    }
}

