package April.ex_27042024;

import java.util.Scanner;

public class Lab096 {
    public static void main(String[] args) {

       /* Program to Check if a Character is a Vowel or a Consonant.


                ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                ->. vowel
                else -> Consonant
        */


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character");
        char ch =sc.next().charAt(0);

         if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
         {
             System.out.println("Vowel");
         }else{
             System.out.println("Consanant");
         }
         sc.close();




    }
}
