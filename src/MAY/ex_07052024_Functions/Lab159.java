package ex_07052024;

public class Lab159 {
    public static void main(String[] args) {
        // How functions work practically in Web Automation
        // suppose I want to test a website

        // Testcase 1
        openBrowser();
        testLoginPage1();
        testLoginPage("Page2");
        closeBrowser();
//   I can call the above function multiple times

        // Testcase 2
        openBrowser();
        testLoginPage("Page3");
        closeBrowser();

        // Testcase 3
        openBrowser();
        testLoginPage("Page4");
        closeBrowser();

        // Testcase 4
        openBrowser();
        testLoginPage("Page5");
        closeBrowser();

 // Here we are re-using the code, write the code once execute it multiple times
//  we can test unlimited no. of times
//  for this purpose we have function with
// -with  parameter, no parameter, return type, non-return type

    }

    static void openBrowser() {
        System.out.println("Chrome Browser Opened");

    }

    static void closeBrowser() {
        System.out.println("Chrome Browser Closed");

    }

    static void testLoginPage1() {
        System.out.println("Testing Page 1 Opened");
    }

    static void testLoginPage(String page) {
        System.out.println("Testing ->" + page);


    }
}

/*
  until now we have learnt functions
  we use functions when not working with oops concept
  Methods we will learn in oops concept
 */
