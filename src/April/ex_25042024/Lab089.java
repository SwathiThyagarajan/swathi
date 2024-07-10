package April.ex_25042024;

public class Lab089 {
    public static void main(String[] args) {

        // JDK > 13 onwards you can return from switch

        // switch expression yield is a new feature which can return something
        char code = 'B';
        int val = switch (code) {
            case 'A':
                yield 65;// yield is used for return
            case 'B' :
                yield 66;
            default:
                System.out.println("Not able to find");
                throw new IllegalStateException("Error");

                // How yield works: when we say char code = 'B';
                // it is matching case 'B' : yield 66;
                // now int val = switch (code) will become int val = 66
                // the whole code case A and case B will be replaced with 66
                //break is not needed here

                // yield is keyword which basically says return this value 66/65

                // This is not much useful but good to know

        };
    }
}
