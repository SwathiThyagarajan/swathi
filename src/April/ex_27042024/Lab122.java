package April.ex_27042024;

public class Lab122 {
    public static void main(String[] args) {


        int i = 10;
        do {
            System.out.println(i);
            i++;
        }while (i < 10);   // here condition is checked last




        int i1 = 10;
        while (i1 < 10){      // here condition is checked first
            System.out.println(i1);
            i1++;
        }


    }
}
