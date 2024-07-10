package April.ex_27042024;

public class Lab109 {
    public static void main(String[] args) {

        // if you want go out of loop then use break

        // 1. Printing before sout
        for (int a = 1; a <10 ; a++) {
            System.out.println(a);
            if (a==5) {
                break;
            }

        }

        // 2. Printing after sout
        for (int i = 0; i <=10 ; i++) {
            // 1 to 9, 10 times it will be executed
            // if you want go out of loop then use break
            if (i == 5) {
                break;
            }
            System.out.println(i);
            // i = 1 -> 1
            // i = 2 -> 2
            // i = 3 -> 3
            // i = 4 -> 4
            // i = 5 -> Out of loop




        }




    }
}
