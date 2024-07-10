package ex_02052024;

public class Lab124 {
    public static void main(String[] args) {

      /*  In Java, you can initialize an array in several ways depending on your requirements.
                Here are a few common methods:

        1. **Using Array Initializer**:
         This method directly assigns values to the array elements during declaration.

         int[] numbers = {1, 2, 3, 4, 5};

        2. **Using the `new` Keyword**:
         This method initializes the array with a specific size and then assigns values to each element individually.

        int[] numbers1 = new int[5]; // Creates an array of size 5
        numbers1[0] = 1;
        numbers1[1] = 2;
        numbers1[2] = 3;  */

        // Way1
        int[] ages = {27, 31, 32, 33, 34};// fixed elements

        // Way 2
        int[] ages2 = new int[5];
        // here by default value of all the elements will be 0
        // Because ages2 here is Arrays and Arrays are Non-Primitive data type
        // Non-Primitive data type have their own default value
        System.out.println(ages2[0]);
        System.out.println(ages2[4]);

        // Only when you assign the value to arrays the value will change and get printed
        ages2[0] = 11;
        System.out.println(ages2[0]);

        // int[] ages2 = new int[5]; The advantage of using this type of initialisation is you can reassign values
        // Whenever we use Arrays in API and web Automation program
        // we will always use the 2nd way of initialising Array

        String[] breakfast_items = {"milk", "idli", "fruits", "coffee", "tea", "poha"};
        System.out.println(breakfast_items.length);
        // whenever discussing length don't start with 0
        // here the length is 6 because 6 no. of items are there









    }
}
