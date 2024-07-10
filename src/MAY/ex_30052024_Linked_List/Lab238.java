package MAY.ex_30052024_Linked_List;

import java.util.ArrayList;
import java.util.List;

public class Lab238 {
    public static void main(String[] args) {

// Topics
        // List - ArrayList, LinkedList, Vector,Stack
        // Set - HashSet, LinkedHashSet, TreeSet
        // Map - HashMap, LinkedHashMap, TreeMap
        // Queue - PriorityQueue, LinkedList
        // Hashtable, Properties

        // we can create Array list using Dynamic Dispatch also

        // Creating a list to hold course names
        List <String> courselist = new ArrayList();
        courselist.add("ATB");
        courselist.add("MTB");
        courselist.add("Python ATB");
        courselist.add("LAPIB");
        courselist.add("SDET Blueprint");


        // Creating a list to hold numbers
        // In this list we have not mentioned specifically the data type.
        // so, we can use any data type using add all

        List numberlist = new ArrayList();// here we are not adding anything b/w List & numberlist.
//      List <object> numberlist = new ArrayList();  by default it will take object
        numberlist.add(150);
        numberlist.add(100);
        numberlist.add(100);
        numberlist.add(399);

        courselist.addAll(numberlist); // add All function 
        System.out.println(courselist);

//   Add all is a function which allows to add another type of list into existing list



    }
}
