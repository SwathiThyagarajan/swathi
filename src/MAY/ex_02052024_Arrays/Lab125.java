package ex_02052024;

public class Lab125 {
    public static void main(String[] args) {

        int[] a = new int[4];
        // size of this array is 4
        // defaults value of a =  [0,0,0,0]
        // |0,0,0,0| In JVM this is how it is stored in a straight stream same memory
        a[3] = 90;

        a[4] = 90; // ArrayIndexOutOfBoundsException: Index is only 4 - out of bounds for length 4
        a[5] = 90; // ArrayIndexOutOfBoundsException: Index is only 5- out of bounds for length 4
       // Index can access only upto 3 (0 1 2 3) because length of the array is only 4 ( 0 0 0 0 )




    }
}
