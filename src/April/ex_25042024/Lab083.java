package April.ex_25042024;

public class Lab083 {
    public static void main(String[] args) {

        //INTERVIEW QUESTION

        // switch expressions can take only int, byte,short, long(with it's wrapper types)
        //enums and string

        int a = 10;
        switch(a){

        }
        char ch = 'A'; // A=65
        switch (ch) {

        }
        float f = 30.25f;
        switch ((int) f) {// Explicit type casting Narrowing is done to convert float to int

        }

        double d = 30.0;
        switch ((int) d) {}
        // double unless converted into integer not allowed

       //boolean b = true;
        // switch (b){}

        long all = 30;
        switch ((int)all) {} // only by typecasting it is allowed



    }
}
