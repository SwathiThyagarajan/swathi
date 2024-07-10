package April.ex_20042024;

public class Lab055 {
    public static void main(String[] args) {

        String s1 = "Swathi";
        String s2 = s1;
        System.out.println(s2);
        // when s2 = s1 is told then in string constamt pool both will point to one /same string class

        System.out.println(" ----- ");

        String s3 = "The Testing Academy";
        s3.toLowerCase();// This creates a new "The Testing Academy in lower case, totally 2 string class is created here
        // But it is not assigned to s3. so, it is floating in the string constant pool
        // you need to point it to string s3
        System.out.println(s3);// oputput-->The Testing Academy
        s3 = s3.toLowerCase();
        System.out.println(s3);// oputput-->the testing academy




    }


}
