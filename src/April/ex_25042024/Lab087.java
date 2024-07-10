package April.ex_25042024;

public class Lab087 {
    public static void main(String[] args) {

        // New feature supports JDK > 13
        // --> arrow feature
        // use of arrow is you don't have to type break

        int itemcode = 001;

        switch (itemcode) {
            case 001 -> System.out.println("It is a laptop!");
            case 002 -> System.out.println("It is a computer!");
            case 003, 004 -> System.out.println("It is a mobile phone!");
            default -> System.out.println("Hello!");
        }

        char ch = 'a';

        switch (ch){
            case 'a','e','i','o','u' -> System.out.println("Vowel");
        }



    }
}
