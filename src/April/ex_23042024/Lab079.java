package April.ex_23042024;

import java.util.Scanner;

public class Lab079 {
    public static void main(String[] args) {

        // Triangle Classifier
        /**
         * Triangle Classifier says that
         * write a program that classifies a triangle based on its side lengths
         * Given three input values representing the lengths of the sides, determine
         *
         * If the Triangle is Equilateral (all the sides are equal),
         * Isosceles (exactly two sides are equal),
         * Scalene (no sides are equal),
         * Use an if-else statement to classify the triangle.
         **/

        // = assign the value
        // == compare the values

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side1, side2, side3, I will tell about the triangle");
        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        int side3 = sc.nextInt();

        if ((side1 == side2) && (side1 == side3) && (side2 == side3)) {
            System.out.println("EQ");
        } else if ((side1 == side2) || (side1 == side3) || (side2 == side3)) {
            System.out.println("150");
        } else {
            System.out.println("Scalene");
        }
    }
}









