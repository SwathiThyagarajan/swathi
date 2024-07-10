package MAY.ex_18052024.super_thisKeyword;

public class Lab186 {
    public static void main(String[] args) {

        // just like constructor chaining Method chaining can also be done

    }
}


//    Method Calls: The m2 method demonstrates how one method can call another method within the same class.


class  P{
    void m1(){ //  a method named m1 is created within the class P.
                // The void keyword indicates that this method does not return any value.
        System.out.println("M1");
    }

    void m2(){
        m1(); // Calls the m1 method within the same class.
        System.out.println("M2");
    }

    // If u run this program the output will be
    // 1st M1 will Run then M2
}
