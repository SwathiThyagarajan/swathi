package April.ex_23042024;

public class                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             Lab069 {
    public static void main(String[] args) {

        /**
         *  CONDITIONS AND LOOPS
         * ex: condition only if u pay the fee you can attend the class
         *  if not u cannot attend the class
         *
         *  So basically condition means either this will happen or that will happen
         *  if this is true do this, else do this
         */

        // condition
        // if your age > 18 you can watch the movie
        // if not you can't watch the movie
        // condition always returns to true or false


        // if--> is the keyword
//
//        STRUCTURE OF IF LOOP
//        Input --> if --> condition --> sout if true --> else --> sout if false
//        if (condition -> boolean true or false)
//        {           sout if true
//        }
//        else{
//                    sout if false
//        }


        int age = 13;
        if (age > 18) {
            System.out.println("You can watch the movie A");
        }else{
            System.out.println("You can't");
        }

        int age1 = 65;
        if (age1 > 18) {
            System.out.println("You can watch the movie A");
        }else{
            System.out.println("You can't");
        }


        // automatically intellij has greyed the else part condition
        // it is telling you else part will not be executed
        // because intellij automatically evaluate the condition



    }
}
