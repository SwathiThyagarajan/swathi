package April.ex_23042024;

import java.util.Scanner;

public class Lab075 {
    public static void main(String[] args) {

        // Find Max. no. in two

        System.out.println("Enter num 1");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();

        System.out.println("Enter num 2");
        int num2 = sc.nextInt();
        int Max = Math.max(num1,num2);
        System.out.println("Max by Math.max func()" + Max);

        if(num1 > num2){
            // above num1 > num2--> condition1
            // condition2--> num2 > num1
            // condition3--> num1 == num2
            // Similarly in any program we can have multiple conditions

            System.out.println("Max is --> num1");
        }else {
            System.out.println("Max is --> num2");
        }

        sc.close();



    }
}
