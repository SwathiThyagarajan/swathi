package ex_02052024;

public class Lab123 {
    public static void main(String[] args) {


        /**
         * Arrays -> till now we stored only one type of variable
         * ex;  int a = 10;what exactly happens here is in JVM there is a memory associated with it int a = 10;
         * the no. 10 is converted into binary and stored in memory
         * int a = 10 a reference for this is created in JVM memory
         * till now we had only one variable a
         *  BUT
         *  what if we have list of variables ex: list of students these are - no. of students
         *  here we have collection / list of data - to store this we use ARRAYS
         *  we store the collection of data type in Array
         *  only if all of them are of same data type
         *  ex; age of all ATB6x students they all must be in int
         *  in between these int you cannot store PRAMOD because it is STRING
         *  whereas all othres are of integer data type
         */

        //Arrays is a collection of the  similar data type
        //ex: age of all ATB6x students ie; int = 25, 26, 28, 30, 32
        // Pramod cannot be stored because it is a string


        // SYNTAX to create Array
        // int[] ages = new int[5];--> we can store 5 elements in ages
        // ex:  ages = |27|31|32|33|34| -> this will be converted into their respective binary code
        // 5 is the size of arrays here
        // size of Array always starts from 1
        //int[] ages = new int[5]; the new here is the new area-> Heap/object area created in JVM

        // int []
        // index always starts from 0-4
        // size = 5 becoz 0,1,2,3,4 no. of int = 5
        // so size = 5
        // index is how arrays are stored in JVM

       /*In the context of arrays, an index refers to the position of an element within the array.
         It's a numerical value that represents the location of the element relative to the beginning of the array.
         Indexes are stored in continuous memory0

         In most programming languages, including Java, array indices start at 0
         This means that the first element of the array has an index of 0,
         the second element has an index of 1, and so on.
         The index of the last element in the array is one less than the length of the array.

         We use indexes in arrays for several reasons:

1. Accessing Elements:
Indexing allows us to retrieve or access specific elements within the array by specifying their position.
For example, array[0] refers to the first element, array[1] refers to the second element, and so on.

2. Modifying Elements:
Indexing enables us to modify or update the value of elements in the array.
By using the index, we can assign new values to specific elements.

3. Iterating Through Arrays:
Indexing facilitates iterating through all the elements of an array sequentially.
By using a loop and incrementing the index, we can visit each element in the array in order.

4. Searching:
Indexing aids in searching for specific elements within the array.
By comparing elements at different indexes with a target value,
we can determine if the element exists in the array and at what position.

5. Sorting and Algorithms:
Many sorting algorithms and other algorithms rely on indexing
to manipulate and rearrange elements within arrays efficiently.

In summary, indexes in arrays are fundamental for accessing, modifying, and operating
on the elements of the array in various ways.
They provide a way to organize and manipulate data stored in arrays effectively.

*/
        // SYNTAX to create Array
        // There are 2ways
        // 1st way of creating Array- Initialising the variable directly

        int[] ages = {27, 31, 32, 33, 34};
        System.out.println(ages);// it will print reference address [I@6acbcfc0 where it is stored
        // to print the elements in ages array follow below steps
        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);
        System.out.println(ages[3]);
        System.out.println(ages[4]);
        System.out.println(ages.length);// length always starts from 1
        System.out.println(ages[5]); // java.lang.ArrayIndexOutOfBoundsException
        System.out.println(ages[-1]); // java.lang.ArrayIndexOutOfBoundsException (Index cannot be negative)

        /*Attempting to access an element with an index  that is outside the valid range of indices
        for the array will result in an error called an "index out of bounds" exception.

Understanding and correctly using array indices is fundamental to working with arrays effectively in programming.
*/
        // 2nd way

        int[] ages2 = new int[5];
        ages2[0] =27;
        ages2[1] =31;
        ages2[2] =32;
        ages2[3] =33;
        ages2[4] =34;

      /*  In Java, arrays are used to store multiple values of the same type under a single variable name.
     They provide a way to store and access elements of the same data type sequentially.
      Here's a basic overview of how arrays work in Java:

### Declaration and Initialization:

        You can declare an array in Java using square brackets `[]` after the data type, like this:
    dataType[] arrayName;
        To initialize an array, you can specify the size of the array and allocate memory for it, like this:
    dataType[] arrayName = new dataType[arraySize];
        You can also initialize the array with values at the time of declaration, like this:
    dataType[] arrayName = {value1, value2, ..., valueN};

### Accessing Elements:

     Array elements are accessed using their index, which starts from 0 and goes up to `array.length - 1`.
    dataType element = arrayName[index];
### Example:*/
    int[] numbers = new int[5]; // Declare and initialize an array of integers with size 5
    numbers[0] = 10; // Assign value 10 to the first element
     numbers[1] = 20; // Assign value 20 to the second element

// Continue assigning values...


// Alternatively, you can initialize the array with values directly
        int[] moreNumbers = {10, 20, 30, 40, 50};

// Accessing elements
        int firstElement = moreNumbers[0]; // Retrieves the first element (value: 10)
        int thirdElement = moreNumbers[2]; // Retrieves the third element (value: 30)



    }
        }









