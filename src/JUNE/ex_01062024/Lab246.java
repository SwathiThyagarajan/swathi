package JUNE.ex_01062024;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Lab246 {
    public static void main(String[] args) {

        // How do we loop through these elements  ?? -->

        Set courseSets = new HashSet<>();
        courseSets.add("ATB");
        courseSets.add("MTB");
        courseSets.add("LAPIT");
        courseSets.add("SDET Blueprint");
        courseSets.add("Java for Testers");

        System.out.println(courseSets);

  //  for loop
        for (Object o : courseSets) {
            System.out.println(o);
        }

        System.out.println("-----------");

// Iterator
        System.out.println("Using Iterator");
        Iterator It = courseSets.iterator();
        while (It.hasNext()){
            System.out.println(It.next());
        }
        // how to remember iterator syntax
        // courseSets -> this is code or set, list which will give u iterator function -> .iterator()
       // then u will check has next and next in while loop

    }
}
