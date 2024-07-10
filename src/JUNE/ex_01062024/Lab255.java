package JUNE.ex_01062024;

import java.util.Enumeration;
import java.util.Hashtable;

public class Lab255 {
    public static void main(String[] args) {

        // Hash Table --> it is also same as Map
        // To print this we need to use enumeration because this is legacy


        Hashtable<Integer, String> ht1 = new Hashtable<>();
        ht1.put(1,"One");
        ht1.put(2,"Two");
        ht1.put(3,"Three");

        Enumeration<Integer> e = ht1.keys();
        while (e.hasMoreElements()){
            Integer key = e.nextElement();
            System.out.println(key + " : " + ht1.get(key));

       // HashMap is Unsorted Unordered
       // Link HasMap insertion order is maintained, slower insertion and deletion, faster iteration
       // TreeMap sorted order is maintained

        }
    }
}
