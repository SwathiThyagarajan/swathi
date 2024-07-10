package April.ex_23042024;

public class Lab072 {
    public static void main(String[] args) {

        // double shift shortcut key to search for any files
        // ex; pre increment type pre and enter lab 46 will open


        boolean a = true; //`boolean a = true;` initializes a boolean variable `a` with the value `true`.
        a = !a;  //`a = !a;` negates the value of `a`, changing it to `false`.
        if (2 + 2 >= 4) { // OR Gate
            System.out.println("Inside the loop code will execute when the condition is true");
        }
        System.out.println("This is outside the loop, it will be executed always" +a); // this tell current position of a true or false

       /* -if (2 + 2 >= 4)-->  This `if` statement checks whether the expression `2 + 2 >= 4` is `true`.
        - Since `2 + 2` equals `4`, and `4 >= 4` is `true`, the code block inside the `if` statement will execute.
                - It prints "Inside the loop code will execute when the condition is true".*/

       /* System.out.println("This is outside the loop, it will be executed always" + a);
        - This statement prints "This is outside the loop, it will be executed always" concatenated with the value of `a`.
        - Since `a` was negated earlier and is now `false`, it will be added to the end of the string.
        - So, it will print "This is outside the loop, it will be executed alwaysfalse".*/

  //      Inside the loop code will execute when the condition is true
  //      This is outside the loop, it will be executed alwaysfalse


    }
}
