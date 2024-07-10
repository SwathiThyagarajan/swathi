package MAY.ex_30052024_Linked_List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab244 {
    public static void main(String[] args) {

//    Topic Comparable vs Comparator functions --> INTERVIEW QUESTION

//    1.  Comparable Interface
//   Purpose: It is used to define the natural ordering of objects.
//   Implementation: A class implements Comparable and overrides the compareTo method.
//   Syntax: public class ClassName implements Comparable<ClassName>
//   Method: compareTo(Object o)
//   Single Sort Sequence: Can only define one default sort order.

//    2.  Comparator Interface
//   Purpose: It is used to define multiple sort orders.
//   Implementation: A separate class (or lambda expression) implements Comparator and overrides the compare method.
//   Syntax: public class ClassNameComparator implements Comparator<ClassName>
//   Method: compare(Object o1, Object o2)
//   Multiple Sort Sequences: Can define multiple sort orders, often used when you need different ways to compare objects.



        // Here we are using only 1 type of Datatype
        List<Integer> myMarks = new ArrayList<>();
        myMarks.add(91);
        myMarks.add(95);
        myMarks.add(87);
        myMarks.add(90);
        Collections.sort(myMarks);
        System.out.println(myMarks);
        // here sorting is easy based on ascending order of marks
        // Natural order will work

        // Creating Student object
        Student student1 = new Student(1,"Pramod");
        Student student2 = new Student(4,"Dutta");
        Student student3 = new Student(3,"Amit");
        Student student4 = new Student(2,"Shah");

        // Adding them into a list
        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        System.out.println(students);
        Collections.sort(students);
        System.out.println("After sorting -> " + students);

        Collections.sort(students,new SortByIdAscending());// After creating class & implementing comparator
        System.out.println("Sort By ID Ascending -> " + students);
        Collections.sort(students,new SortByNameDescending());
        System.out.println("Sort By Name  Descending -> " + students);

     // Collections.sort(students); not allowed confused how to sort based on id or name unless
//   we  do implements comparable function in Student class to sort by name
//   If we use comparable we can sort only either based on id or name 1 at a time

//   IF WE WANT TO COMPARE BOTH OR HAVE A CHOICE
//   Then create a new class known as sort by id ascending
//   this will implement a comparator

    }
}
