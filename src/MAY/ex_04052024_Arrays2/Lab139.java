package MAY.ex_04052024_Arrays2;

public class Lab139 {
    public static void main(String[] args) {


        // 3 rows and 2 columns

        int[][] array_2d = {
                {34, 1},
                {34, 2},
                {34, 3},
        };

        for (int i = 0; i < array_2d.length; i++) { // this loop will go through rows
            for (int j = 0; j < array_2d[i].length; j++) { // this loop will go through columns
                System.out.println(array_2d[i][j]);

            }
            System.out.println();
        }
    }
}
