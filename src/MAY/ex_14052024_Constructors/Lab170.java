package MAY.ex_14052024_Constructors;

public class Lab170 {
    public static void main(String[] args) {

        // Default constructor
        ATBPerson amitRef = new ATBPerson();
        System.out.println(amitRef.name);
        ATBPerson swapnilRef = new ATBPerson();
        System.out.println();

        // Default constructor
        // created once- whn u typed command new ATBPerson in class loading level
        // called twice

        // Parameterized constructor
        ATBPerson pramodRef = new ATBPerson();
        pramodRef.name = "Pramod"; // This is one way of assigning value
        System.out.println(pramodRef.name);
        System.out.println();

        // 2nd Way Assigning the value directly
//        ATBPerson swathiRef = new ATBPerson("Swathi", 5884569123l); this is givig error because it is missing other attributes / parameters
//        System.out.println(swathiRef.name);
//        System.out.println();
//        //To access the value of name here u must assign this.name = givenName in ATBPerson class
//        // if not in sout output will be shown as only Parameterized constructor instead of the value
//
//        ATBPerson nethraRef = new ATBPerson("Nethra",9775418836l); this is givig error because it is missing other attributes / parameters
//        System.out.println(nethraRef.name);
    }
    /*How Execution Works:--

    Step 1--> In JVM 1st main method will be called
    Step 2--> class loader will call and load the ATBPerson class
    Step 3--> Then I have typed this  ATBPerson pramodRef = new ATBPerson(); and passed a parameter
              Here default value of name will be null value
    Step 4--> when 1st reference is created ATBPerson amitRef = new ATBPerson(); it will first see the null value for name
              same for pramod and swapnil
    Step 5--> To change the value of these objects from null to some value we must use parameterised constructor
              1st Way--> pramodRef.name = "Pramod";

    */

    // The usage pof constructors is to differentiate the objects and initialise the values of variables
}
