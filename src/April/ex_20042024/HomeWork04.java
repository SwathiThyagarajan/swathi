package April.ex_20042024;

import java.util.Scanner;
public class HomeWork04 {
    public static void main(String[] args) {


        //
        //refer Lab 090

        //Value of x,y, z - double - result. Using below formula
        // Formula The cube root of (x square + y square - |z|)
        // ("Cube root of (x^2 + y^2 - |z|)

        // x= 3, y= 5, z = 9.

        int x = 10 ;
        Float y = 12.4f ;
        Float z = 56.76f ;
        Double Result = Math.cbrt((Math.pow(x,2)) + (Math.pow(y,2)) - (Math.abs(z))) ;
        System.out.println("Final Result of Equation is :-" + Result);



        /** double cube_root_x = Math.cbrt(3);
         double cube_root_y = Math.cbrt(5);
         double cube_root_z = Math.cbrt(9);
         System.out.println((cube_root_x+cube_root_y-cube_root_z));**/
        }




    }

