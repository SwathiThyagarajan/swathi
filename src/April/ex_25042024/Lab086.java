package April.ex_25042024;

public class Lab086 {
    public static void main(String[] args) {

        // JDK > 13 onwards thi new feature was introduced
        // You can mention multiple cases in one line

        int itemcode = 002;
        switch (itemcode){
            case 001, 002, 003 :
                System.out.println("It is a Electronic Gadget!");
                break;
            case 004,005,007 :
                System.out.println("It is a Mechanical Gadget!");
                break;
            default:
                System.out.println("None");





        }
    }
}
