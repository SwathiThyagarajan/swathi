package MAY.ex_30052024_Linked_List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab239_Iterator_Intro {
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

//   Iterator are pre-build interfaces, they have inbuilt method
//   which we can use to  Iterate over the collections framework, Array List and Link list
//   Iterator is nothing but a cursor which moves to each element
//   and checks if it has next element, next element

//         Iterator here will go to all the ttacourse list elements,
//         until iterator.hasNext is true it will keep on repeating this process of iterator.next()
//         until  iterator.hasNext is false
//
//         we can use Iterator to print all of the above courselist details

        Iterator iterator = ttacourseList.iterator();
        while (iterator.hasNext()){
            Object obj = iterator.next();// this returns to next element in the list
            if (obj instanceof String) {
                System.out.println(obj);
            }else {
                System.out.println("Not a String");
            }
        }


/*
 Let's break down the `while` loop with the iterator step by step:

### Context

This loop is used to iterate over a list (`ttacourseList`) containing elements of various types,
 and it prints the elements based on whether they are strings or not.

### Loop Breakdown

1. **Initialization and Condition:**

   while (iterator.hasNext())

   - `iterator.hasNext()`: This method checks if there are more elements to iterate over in the list. It returns `true` if there are more elements, otherwise `false`.
   - The `while` loop continues to execute as long as `iterator.hasNext()` returns `true`.

2. **Retrieving the Next Element:**

   Object obj = iterator.next();

   - `iterator.next()`: This method returns the next element in the iteration and advances the iterator. It retrieves the element from the list.
   - `Object obj`: The retrieved element is stored in the variable `obj` of type `Object`. Using `Object` allows the variable to hold any type of element since all types in Java are derived from `Object`.

3. **Type Checking:**

   if (obj instanceof String)

   - `obj instanceof String`: This is a type check that verifies if `obj` is an instance of the `String` class. The `instanceof` operator returns `true` if `obj` is a `String`, otherwise it returns `false`.

4. **Conditional Printing:**

   if (obj instanceof String) {
       System.out.println(obj);
   } else {
       System.out.println("Not a String");
   }

   - **If Block**: If `obj` is a `String`, the `if` condition is true, and `System.out.println(obj);` executes. This prints the string.
   - **Else Block**: If `obj` is not a `String`, the `else` block executes, and `System.out.println("Not a String");` runs. This prints "Not a String".

The iteration steps would be:

1. **First Element ("ATB"):**
   - `iterator.next()` returns "ATB".
   - `obj instanceof String` is `true`.
   - Prints: `ATB`.

2. **Second Element ("MTB"):**
   - `iterator.next()` returns "MTB".
   - `obj instanceof String` is `true`.
   - Prints: `MTB`.

3. **Third Element ("LAPIT"):**
   - `iterator.next()` returns "LAPIT".
   - `obj instanceof String` is `true`.
   - Prints: `LAPIT`.

4. **Fourth Element ("SDET Blueprint"):**
   - `iterator.next()` returns "SDET Blueprint".
   - `obj instanceof String` is `true`.
   - Prints: `SDET Blueprint`.

5. **Fifth Element ("Java for Testers"):**
   - `iterator.next()` returns "Java for Testers".
   - `obj instanceof String` is `true`.
   - Prints: `Java for Testers`.

6. **Sixth Element (123):**
   - `iterator.next()` returns 123.
   - `obj instanceof String` is `false`.
   - Prints: `Not a String`.

7. **Seventh Element (true):**
   - `iterator.next()` returns true.
   - `obj instanceof String` is `false`.
   - Prints: `Not a String`.

8. **Eighth Element (3.14f):**
   - `iterator.next()` returns 3.14f.
   - `obj instanceof String` is `false`.
   - Prints: `Not a String`.

The loop terminates after the eighth element as `iterator.hasNext()` returns `false`.

### Summary

- The `while` loop iterates over each element in `ttacourseList` using an iterator.
- For each element, it checks if the element is a `String`.
- If it is a `String`, it prints the element.
- If it is not a `String`, it prints "Not a String".
- This approach allows handling and differentiating elements of various types within the list.
 */


    }
}
