package MAY.ex_25052024.ex_Exceptions;

import java.io.File;
import java.io.FileReader;

public class Lab225 {
    public static void main(String[] args) {

        // String path = "C://a.txt";
        //  File file = new File(path);
        //            FileReader fileReader = new FileReader(file);
        // the above 2 are checked Exception they

        try {
            String path = "C://a.txt";
            File file = new File(path);
            FileReader fileReader = new FileReader(file);
        } catch (Exception e) {
            System.out.println(e.getMessage());

            // file and file reader are present these below 2 io package use dto read a file
            // import java.io.File;
            //import java.io.FileReader;

        }
    }
}
