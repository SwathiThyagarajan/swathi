package April.ex_20042024;

public class Lab061 {
    public static void main(String[] args) {


        String s1 = "Swathi";
        // |0|1|2|3|4|5| --> this is how string swathi is stored
        // There are 6 char/characters in swathi
        // S->0, w->1, a->2, t->3, h->4, i->5
        char c = s1.charAt(1);
        char c1 = s1.charAt(5);
        System.out.println(c);
        System.out.println(c1);

        boolean result = s1.contains("t");
        System.out.println(result);
        s1.concat("Thyagarajan");
        System.out.println(s1);// here still swathi will be shown
        // because concatenation will only create a new string
        // we have not assigned Thyagarajan only when reassigned we can see changes
        s1 = s1.concat("Thyagarajan");
        System.out.println(s1);

    }
}
