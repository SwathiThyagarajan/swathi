package MAY.ex_07052024_Functions;

public class Lab157 {
    public static void main(String[] args) {

        // Can we call the actual main method/function?/ --> Yes

        // Initial method calls
        f1();

        // Initializing arrays
        String[] names = {"Swathi", "Thyagarajan"};
        String[] names2 = new String[2];
        names2[0] = "Nethra";// we can assign some values
        names2[1] = "Venkat";
        // Calling overloaded method f1 with an array parameter
        f1(names); // we can pass strings, arrays also

        // Parameter can be  -  any data type
        // Primitive - byte, short, long, float, int, boolean
        // Non-Primitive - String, Arrays
        /*
           The execution flow is as follows:
        1. First, f1() with no arguments is called.
        2. Inside f1(), f2() is called.
        3. f2() prints "f2".
        4. f1() then prints "f1".
        5. Back in main, f1(String[] a) is called with the names array.
        6. Each name in the array is printed.
         */

    }
    // Overloaded method f1 with an array parameter
    static void f1(String[] a){
        // to print the names in the array we can use for each loop
//       for (String name : a){
//        System.out.println(name);
//    }
        // instead of for each loop we can use for loop also
        for (int i = 0; i <a.length ; i++) {
            System.out.println(a[i]);

        }
       }
    // Method f1 with no parameters
    static void f1(){ // can this f1 call the main function
 //             main();--> Yes it can call
          f2();
        System.out.println("f1");
    }
//   can f2 call f1
    static void f2() {
        System.out.println("f2");
    }

} // This line / bracket is end of class
// this line onwards it is  out of class

// creating a function outside the class is not possible
//   static void f1(){}
