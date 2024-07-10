package ex_02052024;

public class Lab128 {
    public static void main(String[] args) {

        //  In Java, you can initialize an array in two ways
        // 1. DIRECT INITIALISATION -> Using Array Initializer i.e; {}
        // 2. Using the `new` Keyword

        // Printing the length of the array
        int a[] = {27, 31, 32, 34}; // you can put the square bracket before or after "a" it doesn't matter
        //int[]a2 = {27,31,32,34};
        System.out.println(a.length);// here length is 4 and index is 0-3
        System.out.println("Length of array a: " + a.length); // -> u can use this sout also


        // How to print all the elements
        // loop? --> to repeat a task use for loop
        //for

        // Printing all elements of the array using a for loop
        System.out.println("Printing elements of array a:");
        for (int i = 0; i < a.length; i++) {// this loop will go from 0,1,2,3
            System.out.println(a[i]);

          // i <= a.length; -> here if you use <= then i=0 should be i=1,
                // since index always starts from 0 therefore we must use (i<0)
                // whenever we are working with array we must always start with 0 and go upto < a.length
            // below are 2 examples why always i should be 0 -> i=0


            // for (int i = 1; i < a.length; i++) if i start from int i = 1 the 1 element will be skipped
            // the output will be 31 32 34

           /* for (int i = 1; i < a.length-1; i++)
           this loop will iterate through the elements of the array a,
            starting from the second element 31 (skipping the first one)
            and ending with the second-to-last element 32.
                It will exclude the first and last elements of the array.
                output -> 31,32  */


            }
        }


}