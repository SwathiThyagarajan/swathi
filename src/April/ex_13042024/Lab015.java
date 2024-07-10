package April.ex_13042024;

public class Lab015 {
    public static void main(String[] args) {
        System.out.print("Hi");// it will only print"Hi", will not add next line
        System.out.println("Hi"); //this will add next line after Hi is printed


        int age = 98;

        /** %d --> can be used with any integer - byte, short, int or long
         * %s --> string
         * %c --> char
         * %f --> float
         **/

        // printf is formatting
        System.out.printf("Ritesh age is %d",age);
        // here while you run the program %d will be replaced with age value ie; 98

//  Examples of printf

                int num = 42;
                double decimal = 3.14159;
                char letter = 'A';
                String text = "Hello";

                // Printing an integer
                System.out.printf("Integer: %d\n", num); // Output: Integer: 42

                // Printing a floating-point number
                System.out.printf("Float: %.2f\n", decimal); // Output: Float: 3.14 (formatted to 2 decimal places)

                // Printing a character
                System.out.printf("Character: %c\n", letter); // Output: Character: A

                // Printing a string
                System.out.printf("String: %s\n", text); // Output: String: Hello



       /* Detailed Explanation
       *** The printf Syntax***
        System.out.printf(String format, Object... args);
        format: A format string that contains text and format specifiers.
                args: Arguments corresponding to the format specifiers.
        System.out.printf("Ritesh age is %d", age);
        "Ritesh age is %d": This is the format string. It contains:

        Literal Text: "Ritesh age is "
        Format Specifier: %d
        age: This is the argument that corresponds to the %d format specifier. Since age is an integer, it will replace %d in the output.

        Format Specifier %d
                %: Introduces a format specifier.
        d: Stands for "decimal integer".
                When the printf method is called, it processes the format string and replaces the format specifier %d with the string representation of the corresponding argument, which is 98 in this case.

        How It Works
        Parsing the Format String: printf parses the format string from left to right.
                Finding the Format Specifier: It encounters %d and recognizes it as a placeholder for a decimal integer.
                Replacing the Specifier: It replaces %d with the string representation of the integer value of age, which is 98.
        Constructing the Output: The final output string becomes "Ritesh age is 98".
                Printing the Output: The constructed output string is printed to the console.
*/


    }
}
