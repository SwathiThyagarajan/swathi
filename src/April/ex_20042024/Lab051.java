package April.ex_20042024;

public class Lab051 {
    public static void main(String[] args) {

        int a = 87;
        long b = 90l;
        String s1 = "KK";
        String s2 = "VV";
        System.out.println(s1+s2+a+b); //--> KKVV8790 here normal concatination happens and everthing is just put together
        System.out.println(s1+s2+(a+b)); //--> KKVV177 here since a+b is in bracket BODMAS applies here and both their values are added

        // BODMAS - Brackets of division multiplication addition and subtraction





    }
}
