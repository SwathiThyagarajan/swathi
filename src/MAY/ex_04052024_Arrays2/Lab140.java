package MAY.ex_04052024_Arrays2;

public class Lab140 {
    public static void main(String[] args) {

        int n = 3;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*"); // if u use println output will be one below one
            } // to get the output next to each other use only print
            System.out.println("");

            /*
              whenever we use 2 for loops it is a matrix
              when I have used n = 3 then it is a 3 by 3 matrix
              when you say i=1 and j=1, j<=i then * will be printed
               In the above case the value of both i and j is 1
               so output may be as |* x x | here x means nothing will be printed

               when i =2 j will go from 1 time, 2 time
               | * x x |
               | * * x |

               when i = 3 then
                | * x x |
               | * * x |
               | * * * |
             */


        }
    }
}
// j i