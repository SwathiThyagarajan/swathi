package MAY.ex_25052024.ex_Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab227 {
    public static void main(String[] args) {

        // To handle these 2 we can use try catch
        // shortcut for try catch select the exception line click on surround select try catch

        try {
            int a = 10/0; // this is unchecked Exception - Runtime
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        try {
            FileReader f = new FileReader(new File("C://a/txt")); // this is checked Exception compile time
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }



    }
}
