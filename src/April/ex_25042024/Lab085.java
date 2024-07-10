package April.ex_25042024;

public class Lab085 {
    public static void main(String[] args) {

    byte b = 20;
    switch (b){
        case 10:
            System.out.println("Ten");
            break;
        case 127:
            System.out.println("One Twenty Eight");
            break;
        default:
            System.out.println("Default");

            /**
             * 1.Declaration and Initialization: You declare a byte variable b and initialize it with the value 20.
             * 2.Switch Statement: You use a switch statement to evaluate the value of b.
             * 3.Case Blocks: Inside the switch statement, you define different case blocks to handle specific values of b.
             * case 10: If b equals 10, it prints "Ten" and then break out of the switch statement, meaning it won't execute any further case blocks.
             * case 127: If b equals 127, it prints "One Twenty Eight" and then breaks out of the switch statement.
             * 4.Default Case: If none of the case values match the value of b, the default block is executed.
             * default: In this case, it prints "Default". This block is executed when b does not match any of the specified case values.
             *
             *However, in the above code, there's an issue with the switch statement
             * because byte can only hold values from -128 to 127.
             * The value 20 is within this range, so it's fine,
             * but 127 is at the upper bound of the byte range.
             * If you want to use values beyond this range, you should use a larger data type like int.
             * So, the case case 127: might never be reached.
             * To fix this, you should either change the type of b to int, or adjust the case values accordingly.
             *
             */
    }
    }
}
