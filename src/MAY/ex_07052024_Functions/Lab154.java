package MAY.ex_07052024_Functions;

import java.util.Scanner;

public class Lab154 {
    public static void main(String[] args) {

        // what is the Purpose of a Function

        /**
         * suppose we have to divide the task into the smaller chunks
         * ex: we are creating a calculator
         * - sum Task -> sum function ( sum task should be given to sum function)
         * - subtraction Task -> subtraction function
         * - multiply Task-> multiplication function
         */
        // Now suppose you are asking the user to enter 2 numbers
        // Always to take user input we use scanner class

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1");
        int num1 = sc.nextInt();
        System.out.println("Enter num2");
        int num2 = sc.nextInt();

 //       while creating a calculator the 1st basic function it should perform is sum function
        int r_sum = sum(num1,num2);
        int r_sum2 = sum(34,45);// we can call a function any no. of times
        int r_sub = sub(num1,num2);
        int r_mul = mul(num1,num2);
        int r_div = div(num1,num2);

        System.out.println("Sum is -> " + r_sum);
        System.out.println("Sum is -> " + r_sum2);
        System.out.println("Sub is -> " + r_sub);
        System.out.println("Mul is -> " + r_mul);
        System.out.println("Div is -> " + r_div);




    }

    static int div(int a, int b) {
        return a/b;
    }

    static int sum(int a,int b){
        return a+b;
    }
    static int sub(int a,int b){
        return a-b;
    }
    static int mul(int a,int b){
        return a*b;

    }
}
/*
  In the JVM all the Methods are stored in stack one above other
  it will be executed one by one
 */
