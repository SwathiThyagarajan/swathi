package April.ex_20042024;

public class Lab064 {
    public static void main(String[] args) {

        // Equal Ignore Case
        String password = "Swathi@123"; // this is my password
        String pass_u = password.toLowerCase();// someone else is writing my password they don't know which letter is in caps
        System.out.println(pass_u);// output--> swathi@123
        System.out.println(pass_u == password);// pass_u = password? their references are not equal
        System.out.println(pass_u.equals(password));// pass_u.equals(password) their contents are also not equal
        System.out.println(pass_u.equalsIgnoreCase(password));// pass_u.equalsIgnoreCase(password) here both are equal
        // because we are ignoring lower and upper case


        //There are hundreds of other string functions
        // Below is sub string fuction,
        // Substrings are commonly used in programming for
        // tasks like searching, manipulating, and extracting portions of text data.
        //A substring is a smaller piece of text that is contained within a larger text.
        System.out.println(password.substring(0,1));
        /*In the substring method when we specify substring(0, 1),
        we're saying "start at index 0 and include everything up to, but not including, index 1."
        the concept of the ending index being exclusive means that when you're selecting a range,
        you include the starting point but exclude the ending point
*/
        /**
         * Thus the length of the substring is endIndex-beginIndex.
         * Examples:
         * "hamburger".substring(4, 8) returns "urge", excluse upto index 4 and linlast exclude index 8 also
         * "smiles".substring(1, 5) returns "mile"
         *
         */
        System.out.println(password.indexOf("a"));

    }
}
