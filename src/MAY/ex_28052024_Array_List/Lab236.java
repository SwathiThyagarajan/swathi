package MAY.ex_28052024_Array_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Lab236 {
    public static void main(String[] args) {

        // Before Array List legacy classes was introduced

        List mylist = new ArrayList();
        mylist.add("Pramod");
        mylist.add("Swathi");
        mylist.add("Venkat");
        mylist.add("Nethra");
        System.out.println(mylist);

        // Before Array List we had class known as vector.
        // vector is a class which extends the abstract List
        // vector is also a growable array of objects
        // Vector is Thread safe.
        // The execution will take step by step which takes long time

        Vector v = new Vector();
        v.add("Pramod"); // t1
        v.add("Swathi"); // t1
        v.add("Venkat"); // t1
        v.remove("Nethra"); // t1

        // can you guess the o/p?

        System.out.println(v);

    }
}
