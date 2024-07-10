package ex_07052024;

import java.util.Scanner;

public class Lab153 {
    public static void main(String[] args) {


        // TYPES OF FUNCTIONS
        // 1. Non return function with no parameter
          saySomethingPlease();

        // 2. Non return function with parameter
        sayHelloToYou("Venkat");

        //3. Return function with no parameter
        sumOfTwoBadExample(3,4);

        //4. Return function with parameter
        int result = sumOfTwoGoodExample(3,4);
        System.out.println(result);

    }

    static int sumOfTwoGoodExample(int a, int b) {
        return a+b;
    }


    static void sumOfTwoBadExample(int a , int b) { // here cit will not return anything u can change i & i1 to a & b
        System.out.println(a+b);// here we are not returning anything only printing
    }

    static void sayHelloToYou(String name) {
        System.out.println("Hello," +name);
    }


    static void saySomethingPlease() {
        System.out.println("Non return function with no parameter");
    }
}

// The most used is Return function with parameter

// why return is needed
//Returning Methods:
//
//Used when a result needs to be passed back to the caller.
//Can be used to compute and return values, such as mathematical calculations, string manipulations, object creations, etc.
//Example usage: int result = calculator.add(5, 10);