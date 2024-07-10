package April.ex_18042024;

public class Lab048 {
    public static void main(String[] args) {

        int a = 10;
        System.out.println(a); // a = 10
        //System.out.println(++a); // 1+a--> 11
        System.out.println(++a + ++a); // 1+10->11 + 1+11->12, 11+12=23
        // Step 1 --> ++a, 1st Result then value --> ++a = 1+10 --> 11
        // Step 2 --> +
        // Step 3 --> ++a = 1+11 --> 12

        System.out.println(++a + ++a + ++a); // 1+12 + 1+13 + 1+14 --> 13 + 14 + 15 --> 42
        // Step 1 --> ++a, 1st Result then value --> ++a = 1+12 --> 13
        // Step 2 --> +
        // Step 3 --> ++a = 1+13 --> 14
        // Step 4 --> +
        // Step 5 --> ++a =1+14 --> 15








    }
}
