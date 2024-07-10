package MAY.ex_28052024_Array_List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab234 {
    public static void main(String[] args) {

        List<String> mylist = new ArrayList();
        mylist.add("Pramod");
        mylist.add("Pramod");
        mylist.add("Amit");
        mylist.add("Dutta");
        System.out.println(" - To Print Arraylist - 1  ");

        // How to print all the above elements ??--> use for loop

//        syntax for each loop
//        for (Type element : collection) {
//            // Code to be executed for each element

 //   Type  : The type of elements in the collection (e.g., int, String, Object).
 //    element : A variable that holds the current element in the iteration
 //  collection: The collection or array over which to iterate.

        for(String str : mylist){
            System.out.println(str);
        }
        System.out.println(" - To Print Arraylist - 2 ");

        for (int i = 0; i < mylist.size(); i++) {
            System.out.println(mylist.get(i));
        }

/*
     for (int i = 0; i < mylist.size(); i++) {}: Initializes a loop counter
      i starting at 0, and iterates until i is less than the size of the list.
       In each iteration, i is incremented by 1.

     mylist.get(i): Retrieves the element at index i in the list.
 */

        System.out.println(" - To Print Arraylist - 3 ");

        // To Print Arraylist using Iterator
        Iterator<String> itr = mylist.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
/*
         Imagine mylist contains the following elements: ["Apple", "Banana", "Cherry"].

First Iteration:

itr.hasNext() returns true (there are more elements).
itr.next() returns "Apple" and moves the iterator to the next element.
"Apple" is printed.

Second Iteration:
itr.hasNext() returns true (there are more elements).
itr.next() returns "Banana" and moves the iterator to the next element.
"Banana" is printed.

Third Iteration:
itr.hasNext() returns true (there are more elements).
itr.next() returns "Cherry" and moves the iterator to the next element.
"Cherry" is printed.

End of List:
itr.hasNext() returns false (no more elements).
The while loop exits.

In simple terms, the code uses an iterator to go through
 each element in the list one by one and prints each element
 until there are no more elements left to process.
 */

    }
}
