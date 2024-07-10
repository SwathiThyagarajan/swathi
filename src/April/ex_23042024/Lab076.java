package April.ex_23042024;

import java.util.Scanner;

public class Lab076 {
    public static void main(String[] args) {

        // whenever we use scanner class we need to import the scanner class
        // import java.util.Scanner;
        // we also need to close the scanner class
        // sc.close();

        // ex; a number it can be =20, <20, >20
        // there can be 3 conditions here
        // in such cases we use else if

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number >20){
            System.out.println("num > 20");
        } else if (number > 10) {
            System.out.println("num is between 10 and 20");
        } else {
            System.out.println("num is < 20");

        }
        sc.close();


    }
}
