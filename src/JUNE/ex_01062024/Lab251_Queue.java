package JUNE.ex_01062024;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Lab251_Queue {
    public static void main(String[] args) {


        // Queue  --> rarely used concept
        /*
           Added interface in Java 5.
PriorityQueue is one of the commonly used subclasses of Queue interface.
It is a complete class
PriorityQueue doesn’t allow null values.
You can add only comparable objects to PriorityQueue

ex: airlines queue system followed is FIFO-> First In First Out

         */

        Queue pql = new PriorityQueue(); // it sorts first
        //FIFO
        pql.add("B");
        pql.add("A");
        pql.add("C");
        pql.add("C");// duplicates allowed
        pql.offer("D"); // offer is  similar to add
     //   pql.offer(null); // null is not supported
    //    System.out.println(pql);
        System.out.println(pql.poll()); // poll will remove 1st element
        System.out.println(pql);
        System.out.println(pql.peek());// it will not remove just watch the 1st element
        System.out.println(pql);
        pql.offer("F");

        Iterator iterator = pql.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        System.out.println(pql);


    }
}
