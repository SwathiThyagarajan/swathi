package MAY.ex_25052024.ex_Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab226 {
    public static void main(String[] args) throws FileNotFoundException {

        readFile("C://a.txt");

    }


        // this is a checked exception
        // The line FileReader f = new FileReader(new File("C://a/txt"));
        // in Java is an attempt to create a FileReader object for reading a file located at the specified path
        // import class
 //       FileReader f = new FileReader(new File("C://a/txt")); unreported exception java.io.FileNotFoundException; must be caught or declared to be thrown

        // we can use try catch to fix this exceptions. This is one way of handling
//        try {
//            FileReader f = new FileReader(new File("C://a/txt"));
//        }catch (Exception e){
//            System.out.println("FileNotFoundException!");
//        }

    static void readFile(String fileName) throws FileNotFoundException {
        int a = 10 / 10;
        int c =0;
    //    int a1 = 10 / c; // real error ArithmeticException


        // Another way of handling is by add an exception directly to method signature through Throws keyword
        // it basically says that this function can throw some exception related to file not found
        // throws is always available to functions  and work with checked exceptions

        FileReader f = new FileReader(new File("C://a/txt"));

        // try and catch works with any variables checked and unchecked exceptions

    }

}
