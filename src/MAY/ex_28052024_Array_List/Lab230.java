package MAY.ex_28052024_Array_List;

public class Lab230 {
    public static void main(String[] args) {


        // How to create an Array
        int[] array = new int[5];
        // length--> returns length of the array
        // length--> 5
        // Index --> 0 to 4
        System.out.println(array.length);

        // Problem while working with Array are
        // 1. Fixed Size Problem in array
        //     Can I increase the size of the array?
        //        No ,
//       array = new int[10]; here we are not increasing the size but instead creating a new array
//            so no, we cannot increase the size of the array
        // 2. if u want to sort an array we do not have any inbuilt functions available
        //    arr.sort();

        // currently if we use array ->Since we have to give size, memory is wasted.
        // ex: if I created an array of lenght 1000 and use only 2 elements then 998 memory will be wasted
        // a --> 1000, 2 elements, 998 empty elements

        //Insertion and deletion are heavy.
        // ex: I have an array of 1,2,3,4,5,6 , I want to insert an element b/w 4 and 5
        // then I need to go upto 4 insert the element and shift the 6 1,2,3,4,90,6

        //No built-in support for sorting, searching.


        array[0]= 1;
        array[0]= 2;
        // Array can store only same type of elements homogeneous in nature


        // To overcome these problems
//        We prefer below classes and Interfaces in place of Arrays.
//
//        Legacy APIs are provided
//
//        Legacy Classes:-
//        Vector
//        Stack
//        Properties
//        Hash table
//        Dictionary
//
//        Legacy Interface
//        Enumeration (cursor)




    }



}
