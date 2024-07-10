package JUNE.ex_01062024;

import java.util.HashSet;
import java.util.Set;

public class Lab250 {
    public static void main(String[] args) {

        // INTERVIEW QUESTION

        // Given an array of integers, return an array of the unique elements.
        // Input: [1, 2, 2, 3, 4, 4, 5]
        // Output: [1, 2, 3, 4, 5]


        int[] input = {1, 2, 2, 3, 4, 4, 5};

        // Create a HashSet to store unique elements
        Set<Integer> uniqueSet = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>(); // HashSet to store duplicate elements

        // Iterate through the input array
       for (int num: input){
           if (!uniqueSet.add(num)) { // Add each element to uniqueSet
               duplicates.add(num); // If num is already in uniqueSet, it's a duplicate
           }

       }
        // Print the unique elements (HashSet automatically removes duplicates)
        System.out.println("Unique elements: " + uniqueSet);

        System.out.println("Duplicate elements: " + duplicates);


        // how to print only duplicate element ??

//        We create two HashSets:
//
//        uniqueSet to keep track of all unique elements we've seen.
//        duplicates to store the duplicate elements.
//
//
//        We iterate through the input array once:
//
//        For each number, we try to add it to uniqueSet.
//                If uniqueSet.add(num) returns false, it means the number is already in the set, so it's a duplicate.
//        We then add this duplicate number to the duplicates set.
//
//
//        Finally, we print the duplicates set, which contains only the duplicate elements.

    }
}
