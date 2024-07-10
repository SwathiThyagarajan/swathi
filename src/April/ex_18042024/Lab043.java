package April.ex_18042024;

public class Lab043 {
    public static void main(String[] args) {

        // Whenever 2 floats are added double should be used

        float course = 100;
        float GST = 18.45f;
        double total = course + GST;
        System.out.println(total);

        float course1 = 100;
        float GST1 = 18.45f;
        double total1 = course + (int)GST;
        System.out.println(total1);
        // here since int is used explicitly GST will be converted to int & calculated @ 18%
        // because int does not allow decimal numbers



    }
}
