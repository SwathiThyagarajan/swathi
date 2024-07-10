package April.ex_27042024;

import java.util.Scanner;

public class Lab097 {
    public static void main(String[] args) {

        //Program to Check if a Year is a Leap Year or Not:
         /*Leap year is a calendar year that contains an additional day  compared to a common year.

               Determining Leap Years
       To determine if a year is a leap year, we apply a simple rule:
       if the year is divisible by 4, it's a leap year,
       except for end-of-century years, which must also be divisible by 400.
       For instance, the year 2000 was a leap year, while 1900 was not.

        If the year is divisible by 4, it is a leap year.
        However, if the year is divisible by 100, it is not a leap year,
        unless: The year is also divisible by 400, in which case it is a leap year.

                For example:
        2000 is a leap year because it's divisible by 400.
        1900 is not a leap year because it's divisible by 100 but not by 400.
        2024 is a leap year because it's divisible by 4.
        2100 is not a leap year because it's divisible by 100 but not by 400.*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a the year");
        int year = sc.nextInt();

     // condition of leap year = year should be divisible by 4 and 400, should not be divisible 100
        // % 4 == 0 means completely divisible by 4
        if ((year % 4 == 0 && year % 100 != 0) || ( year % 400 == 0)) {
            System.out.println("Leap Year");
        }else{
            System.out.println("Not a Leap Year");
        }

        


    }
}
