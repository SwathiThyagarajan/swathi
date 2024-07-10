package April.ex_27042024;

public class Lab105 {
    public static void main(String[] args) {


        /* This is also a valid Infinite Loop
        for(;;){
            System.out.println("Stop");
        }*/

        final boolean b1 = true;
        for(float f =0;b1;){
            System.out.println("Hi");
        }
        // Above is an infinite loop.
        // for infinite loop you must close the program by clicking on Red stop button

        /*
        1.final boolean b1 = true;: This line declares a final boolean variable b1 and initializes it to true.
         The final keyword means that the variable cannot be reassigned a different value once it's been initialized.

        2. for(float f = 0; b1;) {: This line starts a for loop. Inside the parentheses/bracket:
          float f = 0;: Initializes a float variable f with the value 0.
          b1;: This is the loop condition. As long as b1 is true, the loop will continue to execute.

        3. Inside the loop: {}
          System.out.println("Hi");
          This line prints "Hi" to the console.
          However, there's no code that changes the value of b1,
          so the loop will continue indefinitely, printing "Hi" repeatedly.

         The loop will continue to execute endlessly until something explicitly changes the value of b1 to false
          or until the program is terminated externally
         (e.g., manually stopped or the program crashes).
         Since b1 is declared as final, it cannot be modified within the loop, which means the loop will run infinitely.
         */








    }
}
