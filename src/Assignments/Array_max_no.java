package Assignments;

public class Array_max_no {
    public static void main(String[] args) {

        // HOMEWORK
        // Write a java program to find the max. array in 2d array


        // 2d Array
        //How to find max> in this array
        int [][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

       /* int max_array = Integer.MIN_VALUE;
        for (int i = 0; i < 5; i++) {
         if(arr[i]>max_array)
             max_array = arr[i];
         The above code will not work now since every row has a max. now
        }*/

        // Initialize max to the smallest possible integer value
        int max = Integer.MIN_VALUE;

// Iterate through each row
        for (int i = 0; i < arr.length; i++) {
            // Iterate through each column in the current row
            for (int j = 0; j < arr[i].length; j++) {
                // Check if the current element is greater than the current max
                if (arr[i][j] > max) {
                    // If it is, update the max
                    max = arr[i][j];
                }
            }
        }

        System.out.println("Maximum value in the array: " + max);
    }
}
