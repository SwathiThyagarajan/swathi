package April.ex_25042024;

import java.util.Scanner;

public class Lab082 {
    public static void main(String[] args) {

        // Take a user input as a char and tell the user if it is a vowel
        // vowels--> a, e, i, e, o

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a char, I will tell you, If it is a vowel or not!");

        // sc.next we don't have an option for char
        // so, we need to use sc.next().charAt(0)
        // or -> sc.next().toCharArray(0)
        // which means what ever the user will enter ex; A according to scanner A is string
        // In this string A the first index that we have is A
        // so, we are using sc.next().toCharArray(0) to get the character/ char
        // A -> "A" -> index - A
        char user_input = sc.next().charAt(0);
        //char user_input = sc.next().toCharArray()[0];
        System.out.println(user_input);

        // char user_input = sc.next().charAt(0);
        //char user_input = sc.next().toCharArray()[0];
        //by using anyone of the above function
        //whatever word you enter the 1st letter of the word will be picked


        switch (user_input) {
            case 'a':
                System.out.println("Vowel");
                break;
            case 'e':
                System.out.println("Vowel");
                break;
            case 'i':
                System.out.println("Vowel");
                break;
            case 'o':
                System.out.println("Vowel");
                break;
            case 'u':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Not a vowel, It is a consonanat");
        }
            sc.close();


    }
}
