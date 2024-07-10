package JUNE.ex_01062024;

import com.sun.source.tree.Tree;

import java.util.TreeSet;

public class Lab248 {
    public static void main(String[] args) {

        // TreeSet stores the elements in sorted order
        // it uses compareTo() method to identify the object uniquely and to manage the order of elements

        TreeSet numSet = new TreeSet();
        numSet.add(50);
        numSet.add(10);
        numSet.add(20);
        numSet.add("Pramod"); // java.lang.ClassCastException
        System.out.println(numSet);



    }
}
