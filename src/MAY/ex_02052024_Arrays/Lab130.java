package ex_02052024;

public class Lab130 {
    public static void main(String[] args) {

        // Different Types of Arrays
        int[] int_array = {34, 45, 43}; // An array of integers
        long[] l_array = {34L, 45L, 43L}; // An array of long integers
        float[] f_array = {34f, 45f, 43f}; // An array of floats
        double[] d_array = {34.3, 43.4, 12.32}; // An array of doubles
        boolean[] b_array = {true, false, true}; // An array of booleans
        char[] c_array = {'A', 'B', 'D'}; // An array of characters
        String[] names = {"Swathi", "Nethra", "Venkatesh"}; // An array of strings
               // INTERVIEW QUESTION
        // String[] args = {"Swathi", "Nethra", "Venkatesh"}; --> not allowed
        // you cannot use args as both the parameter of the main method
        // and as a separate array in the same scope
        // because they are different variables with different purposes.

        String s1 = "Venkat"; // this is string function available in strings.java class
        System.out.println(s1.length()); // this is string function Prints the length of the string s1, which is 6
        System.out.println(names.length); // used for length of any non primitive data type

        /*s1.length() returns the length of the string s1 (number of characters i.e; 6) ,
         and names.length returns the length of the array names (number of elements in the array i.e; 3).
         because "Swathi", "Nethra", "Venkatesh" are 3 names / elements in array
         */

        // line no. 13  String[] names  is same as public static void main(String[] args)
        // which means in  main method also takes main also takes a String array
        // main(String[] args)  here in main program/ method we can inject some input into this
        // like {"Swathi", "Nethra", "Venkatesh"} etc...
        // inject some input is known as command line arguments
        // so main function can take string arrays
        // (String[] args) --> this is string arrays
        // (String[] args) --> String args[] --> you can write it like this also both are valid



    }
}
