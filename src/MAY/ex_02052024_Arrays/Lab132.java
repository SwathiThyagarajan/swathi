package ex_02052024;

import java.util.Scanner;

public class Lab132 {
    public static void main(String[] args) {

        // How do we take an input in array ???

        Scanner sc = new Scanner(System.in);
        float[] marks = new float[5];
        System.out.println("Enter the Sub 1 Marks");
        marks[0] = sc.nextFloat();
        System.out.println("Enter the Sub 2 Marks");
        marks[1] = sc.nextFloat();
        System.out.println("Enter the Sub 3 Marks");
        marks[2] = sc.nextFloat();
        System.out.println("Enter the Sub 4 Marks");
        marks[3] = sc.nextFloat();
        System.out.println("Enter the Sub 5 Marks");
        marks[4] = sc.nextFloat();

        for(int i = 0; i < marks.length; i++) {
            if (marks[i] < 30) {
                System.out.println("Failed in this subject"  + marks[i]);
            }
            System.out.println(marks[i]);
        } // above we have used for loop and  condition in this on Lab exercise

        int j = 0;  // while loop
        while (j< marks.length){
            System.out.println(marks[j]);
            j++;
        }

        sc.close();
    }
}
