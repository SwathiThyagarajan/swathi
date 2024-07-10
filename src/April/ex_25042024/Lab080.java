package April.ex_25042024;

import java.util.Scanner;

public class Lab080 {
    public static void main(String[] args) {



    //TOPIC---> Switch

     // if else is used when u have 3-4 conditions
     // switch is used when u have more than 3-4 conditions
    // if else -> condition ( If, else if, else) - multiple condition
    // switch statement for -> multiple condition instead of if else

    // Structure of switch

    // Which day it is?
    // 1 --> mon, sunday, ---> 7, 4 --> Thursday
    // 1, 2, 3, 4,5,6,7-->SMTWTFS --> each day is assigned one particular number


    // Create a simple program where user will enter a number,
    // and we will tell user which day it is.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number 1-7, I will tell you which day it is!");
        int day = scanner.nextInt();

        switch (day) {
            case 1:
                System.out.println("Sunday!");
                break;
            case 2:
                System.out.println("Monday!");
                break;
            case 3:
                System.out.println("Tuesday!");
                break;
            case 4:
                System.out.println("Wednesday!");
                break;
            case 5:
                System.out.println("Thursday!");
                break;
            case 6:
                System.out.println("Friday!");
                break;
            case 7:
                System.out.println("Saturday!");
                break;
            default:
                System.out.println("Only 1-7 are allowed");


                // whenever you enter a number in the console
                // ex; 2 the case 2 will be matched
                // int day = scanner.nextInt();->2 wiil be matched with
                //case 2: System.out.println("Monday!"); and this code / output will be executed

                // in the console when you type day = 2 then only monday has to be printed
                // but it shows monday to saturday all days
                // this is because after matching case 2 and code execution ypu must go out from the loop
                // if you don't  go out from the loop all the cases below if will also be executed
                // To fix this problem we can use a keyword known as break
                // break cannot be used with if-else loop it can only be used with switch
                // once break is used after case 2 is executed it will stop the loop and come to end/out of the program
                // In between if any break is missed then the next case until where break is found will be executed
                // if you enter no. 8 in console nothing will be printed because only 1-7 will be handled
                // for this purpose u can use a keyword default 4 loops

        }
        System.out.println("End of the program, I will be executed anyhow!!");

        scanner.close();


}

}




