package MAY.ex_30052024_Linked_List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Lab239 {
    public static void main(String[] args) {



        List ttacourseList = new ArrayList();
        ttacourseList.add("ATB");
        ttacourseList.add("MTB");
        ttacourseList.add("LAPIT");
        ttacourseList.add("SDET Blueprint");
        ttacourseList.add("Java for Testers");
        ttacourseList.add(123);
        ttacourseList.add(true);
        ttacourseList.add(3.14f);


//         we can use Iterator to print all of the above courselist elements
        System.out.println("Using Iterator:");
        Iterator iterator = ttacourseList.iterator();
        while (iterator.hasNext()){
//            ttacourseList.add("Pramod");// adding a new element while navigating in the iterator -> not possible
//            in 1st step object creation itself the List gets freezed
            System.out.println(iterator.next());// this returns to next element in the list
        }

        System.out.println("------------");

        // for each loop
        System.out.println("Using for-each loop:");
        for (Object course :ttacourseList){
            // here we are using Object course because above in course list we have not mentioned the Data type
            // object can take any Data type
            System.out.println(course);
        }
        System.out.println("-----------");

        // for i loop
        System.out.println("Using for-i loop:");
        for (int i = 0; i < ttacourseList.size(); i++) {
            System.out.println(ttacourseList.get(i));
        }
        System.out.println("------");

        // List Iterator is available only in List.
        // List Iterator can iterate in both forward and backward directions and addition of elements during iteration.

        // Using ListIterator to iterate forward
        System.out.println("Using ListIterator (forward):");
        ListIterator listIterator = ttacourseList.listIterator();
        while (listIterator.hasNext()){
            listIterator.add("Gen AI");
            System.out.println(listIterator.next());                                                                                                                                                                                                                                                        
        }

        // ATB, MTB, PyATB, LAPIT, SDET Blueprint -- original
//   using .hasPrevious() we move from right to left. last element to 1st element
        // if we have to go reverse we need to know the size, so we are using ttacourseList.size()

        // Using ListIterator to iterate backward
        System.out.println("Using ListIterator (backward):");
        ListIterator lt2 = ttacourseList.listIterator(ttacourseList.size());
        while (lt2.hasPrevious()){
//            ttacourseList.add("Pramod");--> not allowed
//            lt2.add("Gen AI");--> not allowed
            System.out.println(lt2.previous());
        }

        System.out.println(ttacourseList);

/*
     Difference between [Iterator, for each loop,for i loop] and List Iterator

     Iterator, for each loop,for i loop in all these we go from Left to right
     Iterator moves to each element forward left->Right and checks if it has next element
     Even for each loop and for i loop goes from Left to right, 1st element to last element.

    ListIterator can iterate both ways:
         - Forward using hasNext() and next()
         - Backward using hasPrevious() and previous()



 */

    }
}
