package April.ex_23042024;

import java.util.Scanner;

public class Lab077 {
    public static void main(String[] args) {

//Grade Calculator ---> INTERVIEW QUESTION

        /**
         * write a program that calculates and displays the letter grade for a given
         * numerical score (e.g; A, B, C, D, or F) based on the following
         * grading scale
         *
         * A: 90-100
         * B: 80-89
         * C: 70-79
         * D: 60-69
         * F: 0-59
         **/
        // we need to use if loop to run this program

        /**
         *  To solve these king of questions we can use 3 step stratergy
         * Step 1. Find the user Inputs ( wht user will enter)
         *  Score--> data type?-->int
         *  return type in the end--> grade--> data type --> char
         *  Ask question to the interviewer about grades which data type they are
         *  ex; int, char, etc
         **/
         // Step 2. Basic Logic
         // if (score >= 90 && score < 100)-->return or print grade- A
         // else if score <= 89 && score >= 80-> return or print grade- B
         // else --> grade --> F

         // Step 3. Write the code


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Student Score !!");
        int score = sc.nextInt();

        char grade = 'F';

        if(score >= 90 && score <= 100){
            grade = 'A';
        } else if (score >= 80 && score <= 89) {
            grade = 'B';
        } else if (score >= 70 && score <= 79) {
            grade = 'C';
        }  else if (score >= 60 && score <= 69) {
            grade = 'D';
        } else if (score<=0 && score > 100) {
            System.out.println("LoL!!");
    } else {
            grade = 'F';
    }
        System.out.println("Your Grade is -->"+ grade);

        sc.close();

    }



}

