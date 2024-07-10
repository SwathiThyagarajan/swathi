package April.ex_20042024;

public class Lab059 {
    public static void main(String[] args) {

    String name = "The Testing Academy"; // SCP
    String name1 = "The Testing Academy"; // SCP
    String name2 = new String("The Testing Academy"); //Heap/object Area

        System.out.println(name == name1); // checks the Reference
        // the output will be in boolean true or false
        // == this operator  checks whether references are equal or not
        // == checks whether the references of name and name1 are equal or not

        // To check whether the contents are equal or not we can use .equals method
        System.out.println(name.equals(name1)); // checks the contents/values
        // the output will be in boolean true or false

        System.out.println(name == name2);
        System.out.println(name.equals(name2));
        // here this will be true because the contents are same but references are different.



        }
}
