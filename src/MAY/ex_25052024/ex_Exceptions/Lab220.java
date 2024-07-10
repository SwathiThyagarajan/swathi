package MAY.ex_25052024.ex_Exceptions;

import java.io.FileInputStream;

public class Lab220 {
    public static void main(String[] args) {

//  Exception are divide into 2 parts
//        1. checked --> JVM knows about them--> Compile Time-- when u write the program
//        2. Unchecked --> JVM does not know about them--> Run Time-- when u run the program


        // Compile Time -/JVM? If Knows about it, - Checked Exception

//        1. checked --> JVM knows about them
//         FileInputStream f = new FileInputStream("C:/log.txt"); here ur trying to open a file
//         JVM knows abt it and shows exception in red bulb symbol
//  when u work with Files JVM knows that there can be issue with - opening the files
//  JVM is telling u that u are trying to open a file this file may or may not be available so add an exception

//   How to add an exception?? by using try catch
        try {
            FileInputStream f = new FileInputStream("c:/log.txt");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        // UnChecked - JVM does not know, JVM will know only when u run it
        int a = 10;
        int c = a/0;
        System.out.println(c);

        String s1 = null;
        s1.trim();

    }
}
