package MAY.ex_28052024_Array_List;

import java.util.List;

public class Lab231 {
    public static void main(String[] args) {

        // collection --> collection means to store some value
/*        ex: shopping list
           Milk, Bread, Butter, Cheese.
           4 elements
         Collection Framework provides-> How you can store the elements
         1. List is  (Interface) implemented by  ->ArrayList, LinkedList, Vector, Stack
             List is present in java.util

 */ // To see all the functions in list in console in terminal local type the command javap java.util.List
        // it will give u the list of functions --> all are incomplete functions

        // static function in interface means it can be directly called by the class name
        List shopping_list = List.of("Milk","Bread", "Butter", "Cheese");
        System.out.println(shopping_list);
        // finding the length using size function
        System.out.println(shopping_list.size());

        List my_10th_marks = List.of(91, 92, 93, 95, 100);
        System.out.println(my_10th_marks);
        System.out.println(my_10th_marks.size());

        List fruites = List.of("orange", "apple", "banana", "apple", "watermelon");
        // List contains and stores duplicates
        System.out.println(fruites);
        System.out.println(fruites.size());


        System.out.println(fruites.get(0));// getting the Index wht it has
        System.out.println(fruites.indexOf("apple"));// gets the 1st index of apple
        // IsEmpty
        System.out.println(fruites.isEmpty());// this is false

        // Other functions available
        // add, remove, clear, contains, indexOf, isEmpty, size, get
        // addAll, removeAll, retainAll, containsAll


        fruites.add("grapes");
        System.out.println(fruites);
        // u will get exception, u cannot add anything because
        // list is an interface and of is a static method
        // the add function will  not work because
        // In JVM class loaders will call the List 1st and static fn (of) in beginning
        // in fruits we have created 5 elements totally
        //Now class loading is done,
        // if u try to add new element not possible because class loading is always done only once
        // for this purpose to add and element to need to use classes which implements the list


        // Disadvantage of array-> I can store only integer if i have declared the data type as int
     //   ex: int[] array = new int[5];
     // List is hetrogeneous in nature we can store different type of data

               List different_data_types = List.of("Pramod",true,123);
//        "Pramod" --> String
//        true  --> boolean
//        123  --> int





    }
}
