package MAY.ex_18052024.Access_Modifier.Police;

public class JrCop {
    public static void main(String[] args) {

        Cop cop = new Cop(10);
        System.out.println(cop.gun);
        cop.canIshoot(); // here Junior cop is not able to access can I shoot so make it as protected in car class
        // so, protected means  accessible within the same package police and by all subclasses of the package
    }
}
