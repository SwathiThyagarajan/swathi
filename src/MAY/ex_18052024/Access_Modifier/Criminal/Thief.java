package MAY.ex_18052024.Access_Modifier.Criminal;

import MAY.ex_18052024.Access_Modifier.Police.Cop;
// Automatically import is done because cop & thief are in different package

public class Thief {
    public static void main(String[] args) {

         // Thief created an instance of cop and now he is able to access the gun
        Cop cop = new Cop(10); // make cop public in cop class to assess it here
        System.out.println(cop.gun); // cop can access the gun
//        cop.canIshoot();//Thief can access canIshoot because it is public in cop class
        // so u should change it to private so thief cannot access

        /*
           Yes, that's correct! The Thief class creates an instance of the Cop class,
            and because the gun field in the Cop class is declared as public, the Thief class can access it directly.
            This is because access modifiers determine the visibility of class members, and since gun is declared as public,
            it's accessible from any other class.
         */

    }
}
