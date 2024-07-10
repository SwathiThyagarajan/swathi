package MAY.ex_04052024_Arrays2;

public class Lab137 {
    public static void main(String[] args) {

        // One Directional Array
        int[] array_1d = {450, 50, 321};

        /* 2D Arrays
         Example for 2D Arrays is Matrix which consists of both Rows and columns
         Rows --> Horizontal (sleeping line 1 2 3 ...... in excel sheet)
         Column --> Vertical ( straight line / A B C..... in excel sheet)
        */

/*

        // 1st way of creating 2D Array
     int[][] array_2d = { // by using 2 square brackets u can initialise 2d arrays
             {34,12,11},// 1st Row
             {34,12,34},// 2nd Row
             {11,23,98}// 3rd Row
     };
*/



        // 2nd way of creating 2d Array by using new operator

        int[][] array_2d_2 = new int[3][3]; // This will create 3*3 Matrix
        // |0,0,0|
        // |0,0,0|
        // |0,0,0| the 0's will be automatically assigned since we are using new operator

        // How to assign the value???
        array_2d_2[0][0] = 34; // if u want to assign the new value 34
        // |34.0,0|// now the 0 value will be changed to 34
        // |0,0,0|
        // |0,0,0|
        array_2d_2[0][1] = 12; // now the new value will be
        // |34,12,0|
        // |0,0,0|
        // |0,0,0|
        // this is a long process


        /* 3D Array
           Rarely people use this array in web automation
           In 3D array there is X axis, Y axis and Z axis
           3-dimensional array like cube length breadth and width
         */


        // 1st way of creating 2D Array
        int[][] array_2d = { // by using 2 square brackets u can initialise 2d arrays
                {34,12,11},// 1st Row
                {34,12,34},// 2nd Row
                {11,23,98}// 3rd Row
        };



        // How to print the 2D array Value ??
        for (int i = 0; i < array_2d_2.length; i++) { // this loop will go through rows
            for (int j = 0; j < array_2d[i].length; j++) { // this loop will go through columns
                System.out.println(array_2d[i][j]);

                // when i and j both are 0 ie; i=0, j=0 the element is 34
                //after this j will continuously increase now j will be ++ until it is < i
                // after 34 in j 12 and 11 will be printed
                // after this i will become 1
            }
        }



        // when i= 0, j will travel from --> 0,1,2
        // when i= 1, j will again travel from --> 0,1,2
        // when i= 2, j will again travel from --> 0,1,2 and keep printing the values





    }
}
