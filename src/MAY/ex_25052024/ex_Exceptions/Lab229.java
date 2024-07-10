package MAY.ex_25052024.ex_Exceptions;

public class Lab229 {
    public static void main(String[] args) {

        // Assignments

        String s1  = null;
        if (s1 != null) {
            s1.trim();
        }
        // fix this

        String s2 = null;
        if (s2 != null) {
            s2 = s2.trim();
        } else {
            // Handle the case where s2 is null, for example by assigning a default value
            s2 = "";
        }

// Now s2 is safely trimmed or assigned a default value
        System.out.println("Result: '" + s2 + "'");


        try {
            String sh = args[0];
            int x = Integer.parseInt(sh);
            int a = 10 / x;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
