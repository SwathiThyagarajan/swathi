package JUNE.ex_01062024;

import java.util.ArrayList;
import java.util.List;

public class Lab256 {
    public static void main(String[] args) {

        // Generics.
        // Generics is a feature in Java that was introduced in Java 5.0.
        // It allows you to abstract over types.

        // Generic basically means if I hard code the datatype u cannot add the element
//        List<Integer> mylist = new ArrayList<>();
//        mylist.add("Pramod");

        List mylist = new ArrayList();
        mylist.add("Pramod");
        mylist.add(123);
        mylist.add(true);


    }
}
