package MAY.ex_14052024_Constructors;

public class Lab169 {
    public static void main(String[] args) {

        ATBPerson objRef1 = new ATBPerson();
        System.out.println(objRef1.courseName);// the courseName value is assigned by default constructor
        // because it was loaded first
        // So Default constructor are created to assign the value of Instance variable of the class.
        System.out.println(objRef1.isMarried);
        ATBPerson objRef2 = new ATBPerson();
        ATBPerson objRef3 = null; // Default constructor will not be called becoz new keyword is not used

        /*
           There are 2 ways of assigning values to Instance variables
           1. By assigning the value directly
           2. Default constructor will assign

           Default constructor is basically called once for one object
           Default constructor has one problem that is
           I can't assign my values to Instance variable
           objRef1.name = "Amit";
           without creating the above line to assign Amit value to objRef1.name
           you must go to String name in ATBPerson class and assign value Amit

         */

        ATBPerson pramod = new ATBPerson();
        System.out.println(pramod.name); // here pramod.name value will be printed as Amit
        // Because when u assign a value at class level then every object created will see or take the same value
        // This is kind of acting like global
        //Default constructor is used to assign values only which is common to all the objects

        System.out.println();

        ATBPerson amitRef = new ATBPerson();
        System.out.println(amitRef.courseName);
        System.out.println(amitRef.isMarried);
        System.out.println(amitRef.name);// here name is printed as null
        System.out.println();

        ATBPerson swapnilRef = new ATBPerson();
        System.out.println(swapnilRef.courseName);
        System.out.println(swapnilRef.isMarried);
        System.out.println(swapnilRef.name);// here name is printed as null

        /*
           The value of System.out.println(amitRef.name);// here name is printed as null
           and System.out.println(swapnilRef.name);// here name is printed as null
           Here we cannot use default constructor to assign the values
           Because Default constructor is used to assign values only which is common to all the objects
           if Amit is assigned to default constructor then the name value of all objects will also be Amit

           To overcome this to make each object name different PARAMETERISED CONSTRUCTOR was introduced.
           A constructor which has a specific number of parameters is called a parameterized constructor.
           The parameterized constructor is used to provide different values to distinct objects. */

        /*
           How Execution Works:--

           Step 1--> In JVM 1st main method will be called
           Step 2--> ATBPerson -> this class is called and loaded by class loader
           Step 3--> When u create an object using new keyword.
                     An object with attributes and behaviour is created in object area
                     the object reference will be assigned to object in object area
                     and a default constructor will be automatically called

           Step 4--> The moment u created a 2nd object the default constructor will be called again


         */
    }
}
