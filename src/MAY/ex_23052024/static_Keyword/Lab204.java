package MAY.ex_23052024.static_Keyword;

import org.w3c.dom.ls.LSOutput;

public class Lab204 {
    public static void main(String[] args) {

        A a = new A();
        A b = new A();
        A c1 = null; // here no output will be printed because class is loaded but, it is pointing to null
        //        System.out.println(A.age);// non-static variable age cannot be referenced from a static context
        System.out.println(A.common);//accessing "ABC" using the class name
        System.out.println(a.common);// accessing "ABC" using the reference of A
        System.out.println(b.common);// accessing "ABC" using the reference of B

        // calling m1 function
        A.m1(); //accessing  m1 function using the class name
        a.m1(); // accessing  m1 function using the reference of A
        b.m1();// accessing  m1 function using the reference of B

//         A.m2(); //accessing  m2 function using the class name not allowed because m2 is non static function
        a.m2();// reference variable can access non-static function
        b.m2();

      A c = null;
        c.m1(); // calling m1 function using c null reference.
        // since m1 is static when class is loaded even if it is pointing to null still it can access it
        // because is class is already loaded and m1 is present is class loader

//        c.m2(); we cannot access because it is Instance variable, & only when  Instance is created u can access
          // how instance is created --->  A c = new A();


    }

}

 class A {
    int age = 10;
    static String common = "ABC"; // I can access this in main method using A.common

    static {
        System.out.println("SIB - A");
        // will be called only once irrespective of no. of objects created
    }

    {
        System.out.println("IIB");
        // IIB will be printed 2 times because object is created twice
    }

    static void m1() {
        System.out.println("m1");
    }

    void m2() {
        System.out.println("m2");
    }

}