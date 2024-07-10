package MAY.ex_25052024;

public class Lab211 {
    public static void main(String[] args) {

        int x = 123; // primitive data type
        //String s1 = x; I cannot store a primitive value "x" 123 into a String variable s1
        //String s1 = (String)x; u cannot store even if u do type casting
        // To store a primitive value "x" 123 into a String variable s1 u should use a wrapper function
        String s1 = String.valueOf(x);// Converts int to String
        System.out.println(s1);// output 123, 123 here is String data type

        Character ch = 'a';
        char ch2 = ch; // Wrapper to Primitive - unboxing - Automatically
        Boolean b = true;
        Long l = 34l;
        Double d1 = 90.0;
        Float f1 = 90.89f;

        Character charValue = 'A';// Autoboxing - char to Character
        char primitiveChar = charValue; // Unboxing - Character to char
//        primitiveChar is just a variable name  used to represent the primitive char type after unboxing.

        Integer intValue = 10;// Autoboxing - int to Integer
        int primitiveValue = intValue; // Unboxing - Integer to int

         // Wrapper class definition
        // Wrapper class is used to convert primitive data types into objects.
        // why objects are required ??
        // objects are required to work in collections framework

        // I have an Integer object
        // Integer --> this is an Integer Wrapper class
        Integer intObject = Integer.valueOf(5);
        System.out.println(intObject);

        Integer a2 = 89;
        // AutoBoxing ( Primitve -> Wrapper ( Automatically)

        // Advantages of Wrapper class is below which are not present in primitive data type
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.max(4,5));
        System.out.println(Integer.min(1,34));

        // creating an object of Integer.
        //Integer a11 = new Integer(10); JDK 9 it is removed

        // creating an object of Integer.
        Integer a12 = Integer.valueOf(10);

    }
}
