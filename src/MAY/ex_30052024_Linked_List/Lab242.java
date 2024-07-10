package MAY.ex_30052024_Linked_List;

import java.util.Collections;
import java.util.Vector;

public class Lab242 {
    public static void main(String[] args) {

 //   Will sort function work with vector ?? --> Yes
        Vector v2 = new Vector<>();
        v2.add(87);
        v2.add(95);
        v2.add(91);
        v2.add(89);
        Collections.sort(v2);
        System.out.println(v2);
    }
}
