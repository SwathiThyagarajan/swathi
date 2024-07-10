package MAY.ex_28052024_Array_List;

import java.util.ArrayList;
import java.util.List;

public class Lab232 {
    public static void main(String[] args) {

        // Syntax
     // class name reference name = new classname
        ArrayList arrayList2 = new ArrayList();
        List arrayList = new ArrayList();// this is Dynamic dispatch, Father reference can have a child object
        // ArrayList implements the list
        //  add, remove, clear, contains, indexOf, isEmpty, size, get
        // addAll, removeAll, retainAll, containsAll--> all these fn can be used

        // can you create object of List interface? --> No
        // List mylist1 = new List();
        // I cannot do it because List is an interface

      //  can you create object of ArrayList ?? --> Yes
        ArrayList arrayList3 = new ArrayList();

        List mylist = new ArrayList();
        mylist.add("Pramod");
        mylist.add("Anusha");
        mylist.add("Kiran");
        mylist.add("Pramod"); // Duplicate allowed in List
        mylist.add("Pramod");
        System.out.println(mylist);
        System.out.println(mylist.size());

        mylist.remove("Pramod");// we have 2 pramod
        // Removes the first occurrence of the specified element from this list,
        System.out.println(mylist);

        mylist.clear(); // removes all the elements from list
        System.out.println(mylist);
        System.out.println(mylist.isEmpty());// true

        mylist.add("Pramod");
        mylist.add("Anusha");
        mylist.add("Kiran");
        mylist.add("Pramod"); // Duplicate
        mylist.add("Pramod");
        System.out.println(mylist);
        mylist.add("Dutta"); // it will always be added in the end
        System.out.println(mylist);
        mylist.set(1, "AnushaDutta");// setting the element at index 1
        System.out.println(mylist);

        mylist.add(123);
        mylist.add(true);
        System.out.println(mylist);

        System.out.println(" ------ ");

        // How to print all the elements ?
        for (int i = 0; i < mylist.size(); i++) {
            System.out.println(mylist.get(i));

        }

        // for each
        for (Object obj : mylist) {// here we using object(Father) because we have int, boolean & string data type
            System.out.println(obj);
        }

        // Array list uses Dynamic array
        // initially array list creates 100 element the moment u enter 99th element it will automatically double its size
    }
}
