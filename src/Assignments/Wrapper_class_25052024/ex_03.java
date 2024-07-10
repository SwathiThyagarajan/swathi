package Assignments.Wrapper_class_25052024;

public class ex_03 {
    public static void main(String[] args) {

        Integer X4 = new Integer(10);
        Integer Y4 = 10;

        // Due to auto-boxing, a new Wrapper object
        // is created which is pointed by Y
        System.out.println(X4 == Y4);

        // Due to auto-boxing, Y4 points to an Integer object with the value 10
        // Using .equals() to compare the values
        System.out.println(X4.equals(Y4));  // This will print: true

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
