package JUNE.ex_01062024;

public class SET_Intro {


    // Sets are not Thread safe

    // List vs Set--> Interview question



/*  Set

Set is an Interface, java.util.Set
Set can store  Unique elements Only
Set use case: when you want to remove duplicates in your collection of list/items
If the element o1.equals(o2) Only one will be in the List

Set interface has the following concrete subclasses:
o HashSet
o LinkedHashSet
o TreeSet .

All subclasses have the same functions, like-> add, remove, contains, Index of...
Only difference is underlined architecture how they store the values of the list items
1.  HashSet -> in HashSet Hash Table is used
2.  Linked HashSet --> Link List is used
3. TreeSet --> Tree mechanism is used

As an automation Tester it is important to know how to use them and not how they are stored

1. HashSet is a implementation concrete class
   it extends from the AbstractSet and implements Set
     HashSet is a class that implements the Set interface,
   and it represents a collection that does not allow duplicate elements.
HashSet
It is fast for searching and retrieving elements.
It does not maintain any order for stored elements.>  A, B, C -> B,C, A, ABC, BAC

2. LinkedHashSet.
LinkedHashSet is a subclass of HashSet.
It stores the data in the order as added by the user. A,B,C -> ABC

3.  TreeSet
It stores the elements in a sorted order. - 23,45,1 ->  A,Z,B ->  ABz,  s1, s2, s3 -> It won’t able -> Collections.sort
compareTo() method is used to identify the object uniquely and to manage the order of elements in TreeSet.
The object you are adding in the TreeSet must be the subtype of Comparable interface.
If object is not the subtype of Comparable, then it will throw an exception at runtime
    java.lang.ClassCastException
TreeSet allows storing elements of similar type only.
Null value cannot be stored in TreeSet.


 */






}
