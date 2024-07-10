package Assignments;

public class string_Reverse {
    public static void main(String[] args) {
//    INTERVIEW QUESTION

        //     How to reverse a string without using reverse function
        //      - use for loop

        /* Reversing a string in Java using a `for` loop without using `StringBuilder` or `StringBuffer`
        involves iterating through the characters of the string from the end to the beginning
        and constructing a new string from these characters. Here is a step-by-step guide to achieve this:

        1. **Initialize an empty string to hold the reversed string.**
        2. **Use a `for` loop to iterate over the original string from the last character to the first.**
        3. **Concatenate each character to the reversed string.**

        Here is a simple Java program demonstrating this approach:*/

                // Original string
                String original = "Hello, World!";


                // Variable to hold the reversed string
                String reversed = "";


                // Length of the original string
                int length = original.length();

                // Loop from the end of the original string to the beginning
                for (int i = length - 1; i >= 0; i--) {
                    // Append the current character to the reversed string
                    reversed += original.charAt(i);
                }

                // Print the reversed string
                System.out.println("Original string: " + original);
                System.out.println("Reversed string: " + reversed);
            }
        }
/*### Explanation:

        1. **Original String**: We start with the string `original = "Hello, World!"`.
        2. **Reversed String Initialization**: We initialize `reversed` as an empty string `reversed = ""`.
        3. **Loop**: The `for` loop starts from `length - 1` (which is the index of the last character) and decrements down to `0` (the index of the first character).
        4. **Character Extraction and Concatenation**: Inside the loop, `original.charAt(i)` gets the character at the current index `i`, and we concatenate this character to the `reversed` string.
        5. **Output**: Finally, we print both the original and reversed strings.

### Key Points:

        - The `for` loop iterates from the end of the string (`length - 1`) to the start (`0`).
                - `charAt(i)` is used to get each character from the original string.
        - `+=` operator concatenates the characters to the `reversed` string.

                This method, although simple, may not be the most efficient for very large strings
due to the immutability of strings in Java and the repeated concatenation in the loop.
For better performance with large strings, consider using a `char` array to construct the reversed string.
However, the provided example effectively demonstrates the use of a `for` loop for reversing a string in Java.*/

