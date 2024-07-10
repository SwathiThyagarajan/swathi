package MAY.ex_28052024_Array_List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.SequencedCollection;

public class Lab235 {
    public static void main(String[] args) {

//        // what is a Framework?
//        A framework is a set of classes and interfaces which provide a ready-made architecture.
//
//                Advantages of the Collection Framework
//
//        Reduces programming effort
//        Increases program speed and quality
//        Consistent API - add(), remove(), contains()

        ArrayList mylist1 = new ArrayList(); // child Reference calls child object
        List mylist = new ArrayList(); // Dynamic Dispatch, Father calling Reference calls child object
        SequencedCollection mylist2 = new ArrayList();// GrandFather reference to call child object
        Collection mylist3 = new ArrayList(); // GreatGrandFather reference to call child object

        // Array list :--
        // ArrayList - Behind the scen it users, Dynamic Array
        // Size filled around 90%, it doubles the size automatically

        // Size is Dynamic
        // Duplicate is allowed
        // Insertion Order is preserved
        // Heterogeneous Objects are allowed
        // Null insertion is possible

        mylist.add("Pramod");
        mylist.add("Anusha");
        mylist.add("Kiran");
        System.out.println(mylist);// insertion order will be maintained

        mylist.add("Pramod");
        mylist.add("Pramod");
        mylist.add("Pramod");
        mylist.add(null);// null insertion is possible
        mylist.add(null);
        System.out.println(mylist);

        System.out.println(mylist.size());
        mylist.remove("Pramod");
        System.out.println(mylist);

        // since List is Interface Arraylist is class. Arraylist has to implement all the functions of List
    }
}
