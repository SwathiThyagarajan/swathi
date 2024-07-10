package MAY.ex_30052024_Linked_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Lab241 {
    public static void main(String[] args) {

        //   INTERVIEW QUESTION

        // Is this allowed ?
//        List stringList = null;
//        stringList.add("ATB");

//        Null Pointer Exception: The stringList variable is initialized to null.
//        When you attempt to call add("ATB") on it, you will encounter a NullPointerException
//        because you cannot call methods on a null reference.
//
//        Type Safety: The List declaration is not type-safe.
//        In modern Java, it's recommended to use generics to specify the type of elements the list will hold.
//        For example, List<String> to indicate a list of strings.

        List<Integer> myMarks = new ArrayList<>();
        myMarks.add(91);
        myMarks.add(95);
        myMarks.add(87);
        myMarks.add(90);
//   To sort them we need to use collections class this class has method collections.sort
        Collections.sort(myMarks);
        System.out.println(myMarks);


    }
}
