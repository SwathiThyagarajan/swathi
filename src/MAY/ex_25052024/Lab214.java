package MAY.ex_25052024;

public class Lab214 {
    public static void main(String[] args) {



        int x = 400, y = 400;
        if (x == y)
            System.out.println("Same");
        else
            System.out.println("Not Same");
//        int variables x and y are compared directly.
//        In Java, primitive types are compared by value,
//        So, x == y evaluates to true because both x and y have the same value.
//        primitive  variables are not stored in heap area


        // == this checks for ->Ref
        //.equals -> this checks value in case of  String only
        // .equals ->if it used with int or ohter - then it checks - Ref



        Integer x1 = 400, y1 = 400;
        if (x1 == y1)
            System.out.println("Same");
        else
            System.out.println("Not Same");
        // Integer x & y are not same because they both are different object references
        // whenever we have a wrapper class an object will be created and both have different locations



        Integer x3 = new Integer(40), y3 = new Integer(40);
        if (x3 == y3)
            System.out.println("Same");
        else
            System.out.println("Not Same");
//        Integer objects x3 and y3 are explicitly created using the new keyword.
//  This creates two separate Integer objects with distinct references, so x3 == y3 evaluates to false.


        Integer X4 = new Integer(10);
        Integer Y4 = 10;

        // Due to auto-boxing, a new Wrapper object
        // is created which is pointed by Y
        System.out.println(X4 == Y4);

/*
      In this code, we are comparing two Integer objects, X4 and Y4, using the == operator.
      Here's what's happening:

      X4 is explicitly created as a new Integer object with the value 10.
    Y4 is initialized with the value 10.

    In this case, since the value 10 falls within the cached range of -128 to 127,
    Java caches and reuses the Integer object with the value 10.

        Despite having the same value, X4 and Y4 are two distinct Integer objects in memory
        because X4 is explicitly created using new, while Y4 is obtained from the cache.
    Therefore, X4 == Y4 evaluates to false because the == operator compares object references,
     and the two objects have different references.



 */







    }
}
