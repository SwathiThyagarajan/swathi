package April.ex_23042024;

public class Lab073 {
    public static void main(String[] args) {

// Even and Odd Number
        // 7--> odd, 4 --> even
        // Core logic is if you divide/ do modulus of any number
        // if it returns to 0 then it is even number
        // else odd number
        // num%2 ==0 -> even, %--> modulus operator
        // modulus operator-> we check for the remainder
        // if remainder is 0--> even, if remainder is 1-->odd
        //      2| 11 | 5 -->Quotient
        //         10 |
        //          1 --> Remainder


        int num = 10;
        if(num%2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }

        int num1 = 11;
        if(num1%2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }

    }
}
