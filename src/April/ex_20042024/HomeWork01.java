package April.ex_20042024;

public class HomeWork01 {
    public static void main(String[] args) {



   //find the max number between three numbers using ternary operator

    int a = 10;
    int b = 20;
    int c = 30;
    int max = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
    //(10>20)?-->if true --> (( 10>30)? 10:30) : output 10>20 false
    // (10>20)?--> if false->  (20>30)? 20:30)   output 20>30 false so 30 is the output
        System.out.println(max);
        System.out.println("Max number is : " + max);
        System.out.println("the Max between the 3 numbers is \n"  +max);




    /**
     * (a > b) ? is true then it evaluates the expression ((a > c) ? a : c);
     * (a > b) ? is false then it evaluates the expression ((b > c) ? b : c);
     */



}




}

