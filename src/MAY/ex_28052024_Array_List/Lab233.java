package MAY.ex_28052024_Array_List;

import java.util.ArrayList;
import java.util.List;

public class Lab233 {
    public static void main(String[] args) {

        List mylist = new ArrayList();
        mylist.add("Pramod");
        mylist.add("Swathi");
        mylist.add("123");
        mylist.add(true);
        System.out.println(mylist);
        // here if I do not want Non String data type to be printed I need to fix the element in List

        // How to fix the element in List / add restrictions use diamond <> operator
        List <String> mylist1 = new ArrayList<>();
//        mylist1.add(123); shows error
        mylist1.add("Venkat");

        List <Integer> mylist2 = new ArrayList<>();
        mylist2.add(123);
//        mylist2.add(true);


    }
}
