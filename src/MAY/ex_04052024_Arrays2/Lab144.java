package MAY.ex_04052024_Arrays2;

import java.util.Scanner;

public class Lab144 {
    public static void main(String[] args) {


        // Palindrome - string
        // find is string is palindrome or not??
        // naman--> reverse --> naman
        // 1331 --> reverse --> 1331
        // malayalam--> reverse -->malayalam

        // Let's take a user input and check wheter it is a palindrome or not

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String, I will check if it is Palindrome or not");
        String user_input = sc.next();

     //   Normally String does not have any method to reverse so we can use StringBuilder/StringBuffer

        StringBuilder sb = new StringBuilder(user_input);
        String reverse_user_input = sb.reverse().toString(); // tostring is used when u are customise a string
        if(user_input.equalsIgnoreCase(reverse_user_input)){//equalsIgnoreCase will check and ignore lower and upper case
            System.out.println("Palindrome --> "+ user_input);
        }else{
            System.out.println("Nope!!");
        }

        // reverse funcvtion returns to string builder only to convert it we use tostring

        // we can reverse a string without using reverse function



    }
}
