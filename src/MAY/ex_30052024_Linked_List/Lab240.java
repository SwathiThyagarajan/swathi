package MAY.ex_30052024_Linked_List;

import java.util.*;

public class Lab240 {
    public static void main(String[] args) {

        List ttacourseList = new LinkedList();
        ttacourseList.add("ATB");
        ttacourseList.add("MTB");
        ttacourseList.add("LAPIT");
        ttacourseList.add("SDET Blueprint");
        ttacourseList.add("Java for Testers");
        ttacourseList.add(123);
        ttacourseList.add(true);
        ttacourseList.add(3.14f);
        System.out.println(ttacourseList);

//   INTERVIEW QUESTION
//   Do you know about Vector and how Enumeration is used

        Vector<String> v2 = new Vector<>();
        v2.add("ATB");
        v2.add("MTB");
        v2.add("LAPIT");
        v2.add("SDET Blueprint");

//        Enumeration is a cursor, this is a legacy class, it is an older class available only in vector
        Enumeration e = v2.elements();
        while (e.hasMoreElements()){
            System.out.println(e.nextElement());
        }

        // Enumeration can be replaced with Iterator which can be used in whole collections




    }
}
