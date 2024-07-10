package April.ex_11042024;

public class Lab003 {
    /** JVM Flow ( INTERVIEW QUESTION)
     * JVM will Load the class-->Lab003
     * after loading Class it will find main method
     * in main method it will execute the statements one by one
     */

        public static void main(String[] args) {
            System.out.println("1");
            System.out.println("2");
            System.out.println("3");
            System.out.println("4");

            /** while creating main method if you type capital 'M' java will throw error
             * because main is a keyword
             * execution starts from main method
             * args is arguments
             * you can replace args with any word no issues.
             */

            /** In future if you want to change the JDK of Intellij
             * you can right click on project name and select module setting-->sdk's-->project-->sdk-->change here.
             */

        }
}
