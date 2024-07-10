package MAY.ex_04052024_Arrays2;

public class Lab141 {
    public static void main(String[] args) {

        // 1d Array how for each loop works

        // for each loop
        int[] arr = { 23,23,43};// this array initialisation is common for both for each and for loop
       for (int item : arr) {
           System.out.println(item);
       }

        System.out.println("--------");

        // for loop
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

            // both are same they will give u the same result
        }




    }
}
