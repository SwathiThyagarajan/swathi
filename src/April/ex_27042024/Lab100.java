package April.ex_27042024;

public class Lab100 {
    public static void main(String[] args) {

        /* Till now we learnt -
           1. If Else
           2.  If Else-if  - used for multiple conditions
           3. Switch  - used for multiple conditions with break keyword
        */
         /* LOOPS - For Loop, While Loop and Do Loop
            -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-
            Loops means to perform a task multiple times
            repetitive task ex- print 1 to 100
          */
        // print 1 to 100
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);
        System.out.println(6);
        System.out.println(7);
        System.out.println(8);
        System.out.println(9);
        System.out.println(10);

        // Instead of printing 1 - 100. 100 times we can use For Loop
        // For Loop shortcut once u enter for -- fori will apper click on it syntax will come

        /* syntax of for Loop
        for(A:B:C)
         A -> initialization -> Where you want to start. - int i = 0;
         B -> Condition (When you want to stop) - i < 10
         C -> How you want to do increment / decrement / updation - i++ ---> i = i+1
         */
        for (int i = 0; i < 10; i++) {
            // A-> int i = 0;  int means initialization, i = 0 -> I want to start from 0
            // B -> i < 10; Till where u want to go/ When you want to stop when i is less than 10
            //  i < 10--> 0 is < 10, 1<10, 2<10, 3<10, 4<10....... 9<10   ( 0,1,2,3,4,5,6,7,8,9)
            // C -> i++
            System.out.println("Code which you want to execute multiple times");

        }







    }
}
