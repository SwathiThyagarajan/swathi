package MAY.ex_14052024_Constructors;

public class AutomationClass {

    // Default constructor real use case

    // Requirement
    // Before starting/running my testcase 1 & 2  establish
    // 1. dataBaseConnection as "My SQL Connection is Created!"
    //  2. excelOpen as Excel opened

    // Instance variable
    String name;
//The AutomationClass contains an instance variable name
// which will store the name of the test case.

    public AutomationClass(String name) {
        this.name = name;
    }

    // Default constructor
        AutomationClass() {
            // Call the method to create a database connection
            dataBaseConnection();
            excelOpen();
        }

        // Method to create a database connection
        void dataBaseConnection() {
            System.out.println("My SQL Connection is Created!");
        }

    // Method to open Excel
        void excelOpen(){
            System.out.println("Excel opened");
        }

        // A test case method
        void testcase1() {
            // Implementation of test case
            System.out.println("Testcase1" + this.name);
        }
    // Another test case method
    void testcase2(){
        System.out.println("Testcase2" + this.name);

    }
// Before starting my testcase 1 & 2  all the task that u want to do u can do it by using default constructor

        // Main method to test the class
        public static void main(String[] args) {
            AutomationClass tc1 = new AutomationClass("Testcase1"); // This will automatically create a database connection
            AutomationClass tc2 = new AutomationClass("Testcase2"); // This will automatically create a database connection
            // Print the name and run test cases for tc1
            System.out.println(tc1.name);
            tc1.testcase1();
            tc1.testcase2();
            System.out.println();
// Print the name and run test cases for tc2
            System.out.println(tc2.name);
            tc2.testcase1();
            tc2.testcase2();
        }

    }

/*

        ### Explanation of the code:

1.   The default constructor is designed to initialize necessary resources (database connection and Excel file)
  if no parameters are provided during object creation.

2.   The parameterized constructor allows for creating objects with specific names for different test cases.
  The testcase1 and testcase2 methods print the name of the test case,
 demonstrating the use of the name instance variable initialized via the parameterized constructor.

Execution and Output
When you run this program, the following happens:

Object Creation for tc1:

The parameterized constructor is called with "Testcase1".
tc1.name is set to "Testcase1".

Object Creation for tc2:

The parameterized constructor is called with "Testcase2".
tc2.name is set to "Testcase2".


       */
