package MAY.ex_04052024_Arrays2;

public class Lab138 {
    public static void main(String[] args) {


        // when Rows and columns are not equal

        int[][] array_2d = { // by using 2 square brackets u can initialise 2d arrays
                {34, 12, 11},// 1st Row
                {34, 12, 34},// 2nd Row
        };
        // we have 2 rows
        // i value will go from o,1
        // j value will go from 0,1,2


        // How to find Row ???
        int row = array_2d.length;

        for (int i = 0; i < row; i++) { // this loop will go through rows 0, 1
            // Print each row
            for (int j = 0; j < array_2d[i].length; j++) { // this loop will go through columns 0,1,2
                System.out.println(array_2d[i][j] + " ");
            }
            System.out.println(); // this will add line between 1row and 2nd row
            // this gives you rows in 34, 12, 11 this format


        }
    }
}


