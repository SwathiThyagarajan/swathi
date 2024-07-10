package MAY.ex_16052024_Inheritance.Single_Inheritance;

import MAY.ex_16052024_Inheritance.Single_Inheritance.PramodHome.Father;

public class OutsidePramod {
    public static void main(String[] args) {

        // You can access father function  outside PramodHome by crteating proper object and reference
        Father fa = new Father();
        fa.bhk2();
    }
}
