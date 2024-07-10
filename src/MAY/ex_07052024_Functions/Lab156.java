package MAY.ex_07052024_Functions;

public class Lab156 {
    public static void main(String[] args) {

        // Function within function is not possible

        System.out.println("Start of the Program");
        System.out.println("End of the Program");
        main(10);
        main("Swathi");
        // main(56.37) this is double but if there is no method with this created it will throw error

    }

    // You can have any number of main functions but the real one is line no. 4 main function
    // rest all of the below are just copy clones
    // you can define as many functions as u want. but it should be within the class

    // You can create same main function but with different parameter
    static void main(int a ) {
        System.out.println(a);
    }
    // You can create same main function but with different parameter
    static void main(String[] a,String b ) {
        System.out.println(a);
    }
    //You can create another main function which can return something
    static String main(String a ) {
        System.out.println(a);
        return "Hello";
    }

    // You can call main function in between
    static void God(){
        main(new String[]{"12"});
        // so here God function can call the main function
    }
}
