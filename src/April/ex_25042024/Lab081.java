package April.ex_25042024;

import java.util.Scanner;

public class Lab081 {
    public static void main(String[] args) {

        // How switch will be used in automation framework???
        // Web Automation
        // I want to run web automation you will ask user which browser you want to run the code.
        // Chrome--> start chrome, firefox-->firefox, edge--> execution edge

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Brower Name!!, where you want to execute the program! ");
        // to get this

        String BrowserName = sc.nextLine();
        BrowserName = BrowserName.toLowerCase();
        // whatever brower name the user types we will convert it into lowecase and then we will check
        // user may sonetiomes enter characters in lower or upper case to ease the process this is done


        switch (BrowserName){

            case "chrome":
                System.out.println("starting the chrome browser");
                // Further code to start the chrome
                // webdriver driver = new chrome(); // Selenium code
                break;
            case "firefox":
                System.out.println("starting the firefox browser");
                // Further code to start the Firefox
                // webdriver driver = new firefox(); // Selenium code
                break;
            case "edge":
                System.out.println("starting the edge browser");
                // Further code to start the edge
                // webdriver driver = new edge(); // Selenium code
                break;
            default:
                System.out.println("I have no idea which browser is this");
            // default means which browser it does not support


        }
           sc.close();
    }
}
