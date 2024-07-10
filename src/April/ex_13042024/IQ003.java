package April.ex_13042024;

public class IQ003 {
    public static void main(String[] args) {
        int a = 10;
        int b = 45;
        System.out.println(a+b);

        // Interview question concatenation of integer with string
        //Concatenation refers to the operation of joining two or more strings together
        // to create a new string.
        // Principle followed here is left to right
        String name = "Swathi";
        System.out.println(a+name);
        System.out.println(name+a);

        System.out.println(a+b+name);
        System.out.println(name+a+b);
        // only left to right allowed, right to left a+b value is not calculated, it is just printed as it is




    }
}
