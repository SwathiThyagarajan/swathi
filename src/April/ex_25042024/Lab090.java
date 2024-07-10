package April.ex_25042024;

import java.util.Scanner;

public class Lab090 {
    public static void main(String[] args) {

// ("Cube root of (x^2 + y^2 - |z|)

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x");
        double x = sc.nextDouble();
        System.out.println("Enter the value of y");
        double y = sc.nextDouble();
        System.out.println("Enter the value of z");
        double z = sc.nextDouble();

        double result;
        //("Cube root of (x^2 + y^2 - |z|)
        // above fornula is similar to A+B-C,
        // A->x^2, B->y^2, C -> |Z| absolute of z
        // absolute means if u have -1 absolute value is 1
        // the value will be always +

        result = Math.cbrt((Math.pow(x,2)+Math.pow(y,2)-Math.abs(z)));
        System.out.println(result);

        sc.close();



    }
}
