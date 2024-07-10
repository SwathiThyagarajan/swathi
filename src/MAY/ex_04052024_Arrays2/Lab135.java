package MAY.ex_04052024_Arrays2;

public class Lab135 {
    public static void main(String[] args) {

     /*
        Topics covered till now
        1. Arrays - are collection of similar datatype   */

        // Find the max. in the Arrays -- Important Interview question
        // ex: I have some salaries in the belo wprogram the max. is 999
        // so here the question is How to find the max.salary in the Array ??


        // int [] salaries = {30,50,60,90,10,100,999, -1, -2};

      //  How to find the max.salary in the Array ??
      // There is a function called Math.max it can take 2 arguments
        // we cannot use this because we have multiple arguments

        // We can use Loop here
        // logic --> I have max. no = 0, I will compare, I will go from for i = 0 upto the length
        // and I will say if salaries[i] > max. -> max
        // it means if salaries of i is greater than max.then I will set it as max.
        // once I have gone through all the salaries from 0 to l  then I have found the max. no.
        // ex: suppose I have taken max. integer as 0 and I will start comparing 0 with salary
        // if I compare 0 with 30(salary 1) here 30 is max.
        // next if I compare 30 with 50(salary 2) 50 is max. in same way the process will continue
        // and in the end the max. will be 999

       /* int max_salary = Integer.MIN_VALUE; // Min value of integer has is  -2147483648
        System.out.println(max_salary); // output -2147483648
        System.out.println(Integer.MIN_VALUE); // output 2147483647 here we are discussing the range
*/
        // Reason for assigning Integer.MIN_VALUE instead of 0 is there can be -1, -2 also in salaries
        // If we use 0. -1,-2 logic will fail

        /*you're trying to find the biggest number in a list, but you need to start somewhere.
          You can't start with 0 because there could be negative numbers in the list,
           and then 0 wouldn't be the right starting point.
           So instead, you start with the smallest possible number you can use.
           In Java, that's Integer.MIN_VALUE, which is basically the smallest number you can represent with an integer.

        So, when you set int max_salary = Integer.MIN_VALUE;,
        you're saying, "I'm starting with the smallest possible salary anyone can have,
        and then I'll compare it with the real salaries in the list to find the actual maximum."
        This way, you ensure that you're starting from a point where any real salary in the list will be bigger
        than this starting value, even if those salaries are negative.
         */

         // Define an array of salaries
        int[] salaries = {30,50,60,90,10,100,999, -1, -2};

        // Initialize max_salary to the first element of the array
        int max_salary = Integer.MIN_VALUE; // Min value of integer has is  -2147483648-> explanation above

        // Iterate through the array starting from the second element
        for (int i = 0; i < salaries.length; i++) {
            // If the current salary is greater than max_salary, update max_salary
            if (salaries[i] > max_salary){
                max_salary = salaries[i];
            }

            /* we can use while loop also
            int j = 0;
            while (j < salaries.length){
                if(salaries[j] > max_salary){
                    max_salary = salaries[j];
                }
                j++;
            } */
            // Print the maximum salary
            System.out.println("Max salary -> " + max_salary);
        }
    }
}
