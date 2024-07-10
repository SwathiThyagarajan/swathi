package ex_02052024;

public class Lab133 {
    public static void main(String[] args) {

        // INTERVIEW CUM REALTIME SCENARIO - which will be used atleat once

        // FizzBuzz Problem:
        // Write a program that prints numbers from 1 to 100.
        // For multiples of 3, print "Fizz" instead of the number,
        // and for the multiples of 5, print "Buzz".
        // For numbers which are multiples of both 3 and 5,
        // print "FizzBuzz".

        for (int i = 1; i <= 100; i++) {
            if (i% 3 == 0 && i% 5 == 0) {
                System.out.println("FizzBuzz");
            }else if( i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            }else {
                System.out.println(i);
            }


        }


    }
}