package ex_02052024;

public class Lab127 {
    public static void main(String[] args) {

        // IMPORTANT INTERVIEW QUESTION

        //  Generally
        // == --> This checks for reference
        // .equals() --> checks for values/content

        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5};
        System.out.println(array1==array2);// the output will be false
        // because 2 different reference types are created for each of them in JVM
        System.out.println(array1); //[I@6acbcfc0
        System.out.println(array2); // [I@5f184fc6 - both of them have different locations

        int[] array3 = array1; // here your storing the reference array3 into array1
        System.out.println(array1==array3); // now the output is true

        System.out.println(array1.equals(array2));  // output is false
        /*
           output is false even though the content/value is same
           when select/ over over equals it is going to an object class
           but if I use String it goes to?
           // Arrays is coming from object.java file checks for reference
         */

        String s1 = "Swathi";
        String s2 = "Swathi";
        System.out.println(s1.equals(s2)); // output true

        // if u over over string it is going to string class, string equals method
        // string equals method checks for content
        // string is coming from --> string.java file - checks for content

        // Object equals to method checks for reference not for content
        //  .equals() inArrays checks for --> Reference
        // In Arrays == and .equals() are same
        // (array1==array2) and (array1.equals(array2)) both are same

        // For only string .equals() checks for content for rest all it checks for reference




        // what is object class?
        // object class is a parent/father of every class
        // whatever lab exercises we are creating object class will always be parent
        //ex; your grandfather has some property it will be automatically inherited by your father
        // All the methods which are present in the object class will automatically be available for all other class
        // because every class in Java is a subclass of Object, either directly or indirectly.




    }
}
