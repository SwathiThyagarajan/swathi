package JUNE.ex_01062024;
import java.util.HashSet;
import java.util.Set;


public class Lab245 {
    public static void main(String[] args) {

        // Interview question --> How HashSet works ??


        // 1. Duplicates will not be stored in case of set
        // 2. Set is case-sensitive
        // 3. Order is random order will not be maintained
        Set<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Grapes");
        fruits.add("Orange");
        fruits.add("Apple");// Duplicates will be automatically removed
        fruits.add("apple");// Set is case-sensitive
        fruits.add("Watermelon");
 //       fruits.add(123); not allowed because we have mentioned String while declaring HashSet
        System.out.println(fruits);
        System.out.println(fruits.size());
        System.out.println(fruits.isEmpty());
        System.out.println(fruits.contains("Apple"));
        System.out.println(fruits.remove("Apple"));
        System.out.println(fruits);
        fruits.clear();
        System.out.println("After clear fruits are --> empty " + fruits);
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Grapes");
        fruits.add("Orange");
        System.out.println(fruits);




        }

    }

