package MAY.ex_30052024_Linked_List;

import java.util.Stack;

public class Lab243 {
    public static void main(String[] args) {

//A stack is a linear data structure that follows the Last In First Out (LIFO) principle, where the last element added is the first one to be removed. Java provides a built-in class called Stack which is part of the java.util package.

        Stack<String> stack = new Stack<>();
        stack.push("A");// Pushes an item onto the top of the stack.
        stack.push("B");
        stack.push("C");
        stack.add("D");
        System.out.println(stack);
        System.out.println("pop removes -> " +  stack.pop()); // removes an element  at the top of the stack - D
        System.out.println("Stack after pop: " + stack);
        System.out.println("peek just looks at the Top element -> " +  stack.peek()); //  Looks at the object/element  at the top of the stack without removing it.
        System.out.println("Stack after peek: " + stack);


        // Difference between add and push --> No difference
        // Intent: push() is specifically for stack operations and makes the code more readable by clearly indicating the stack behavior. add() is for general-purpose use and does not imply stack semantics.
        //Behavior Consistency: When using a stack, push() is preferred because it aligns with the LIFO principle, whereas add() could be confusing since it operates on the underlying vector.
        //Readability: Using push() makes the intention of your code clearer to someone reading it. They will immediately understand that an element is being added to the top of the stack.

       }
}
