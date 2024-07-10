package JUNE.ex_01062024;

import java.util.LinkedHashSet;
import java.util.Set;

public class Lab247 {
    public static void main(String[] args) {

//  LinkedHashSet is a subclass of HashSet.
// It stores the data in the order as added by the user. A,B,C -> ABC

        Set courseSets = new LinkedHashSet();
        courseSets.add("ATB");
        courseSets.add("MTB");
        courseSets.add("LAPIT");
        courseSets.add("SDET Blueprint");

        System.out.println(courseSets);

        // INTERVIEW QUESTION
/*
    1.    Default Initial Capacity and Load Factor
When you create a LinkedHashSet without specifying an initial capacity and load factor, it uses default values:
Default Initial Capacity: 16
Default Load Factor: 0.75
Threshold for Growing: When 75% full (12 items for a capacity of 16)
New Capacity after Growing: Typically double the current capacity (16 * 2 = 32)

These default values are chosen to provide a good balance between memory usage and performance for typical use cases.



 2.       When you create a LinkedHashSet, you can decide how big the initial container (capacity) is
     and how full it should get before expanding (load factor).

     Imagine you run a small library. You start with a bookshelf that can hold 16 books. This is your initial capacity.

Initial Capacity (bookshelf size): Let's say you start with a shelf that can hold 16 books.
Now, you also decide that once your shelf is 75% full, you will get a new, larger shelf to make room for more books.

Load Factor (when to get a new shelf): You decide to get a new shelf when the current one is 75% full.
 For a shelf that holds 16 books, that means getting a new shelf when you have 12 books.
 */


        // Create a LinkedHashSet with an initial capacity of 10 and load factor of 0.75
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>(10, 0.75f);

        // Add some items to the set
        linkedHashSet.add("Apple");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Orange");
        linkedHashSet.add("Grapes");
        linkedHashSet.add("Pomegranate");
        linkedHashSet.add("Lichi");
        linkedHashSet.add("Mango");
        linkedHashSet.add("Guava");
        linkedHashSet.add("Pineapple");
        linkedHashSet.add("Strawberry");
        linkedHashSet.add("Papaya");
        linkedHashSet.add("Blueberry");

        // Print out the set
        System.out.println("LinkedHashSet: " + linkedHashSet);

// Once capacity reaches 7 automatically the set will expand,  the new capacity is typically calculated as the current capacity multiplied by 2. (10*2)






    }
}
