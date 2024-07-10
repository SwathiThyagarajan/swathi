package Assignments.Wrapper_class_25052024;

public class ex01 {
    public static void main(String[] args) {

        Integer x1 = 400, y1 = 400;
        if (x1 == y1)
            System.out.println("Same");
        else
            System.out.println("Not Same");
        // Integer x & y are not same because they both are different object references
        // whenever we have a wrapper class an object will be created and both have different locations
    }
}
