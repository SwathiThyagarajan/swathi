package MAY.ex_23052024.static_Keyword;

public class Lab208_Anonymous_Class {
    public static void main(String[] args) {

//        An anonymous class is a local class without a name.
//        It is used to instantiate objects with certain "extras" such as method overrides.

//  we cannot create an instance of ABC i.e; ABC abc = new ABC();
//     But we can create an anonymous class which can implement override method so, we can access ABC

        // Creating an instance of an anonymous inner class that extends ABC
        ABC abc = new ABC() {
            @Override
            void m1() {
                System.out.println("M1");
            }
        };
        abc.m1(); // Calls the overridden m1() method, prints "M1"

        // Creating an instance of an anonymous inner class that implements I1
        I1 i = new I1() {
            @Override
            public void m2() {
                System.out.println("M2");
            }
        };
        i.m2(); // Calls the overridden m2() method, prints "M2"
    }
}
/*
//create an anonymous class  so, we can access ABC
// a class is created with name Anonymous which extends ABC
class anonymous extends ABC{ // this part is hidden above
    // while Creating an instance of an anonymous inner class -->ABC abc = new ABC() {

    @Override
    void m1() {  // if it extends ABC it has to implement m1 because m1 is abstract method
        // this override method is present as it is
    }
}*/

// Abstract class ABC with an abstract method m1
abstract class ABC {
    abstract void m1();
}

// Interface with a method m2
interface I1 {
    void m2();
}



