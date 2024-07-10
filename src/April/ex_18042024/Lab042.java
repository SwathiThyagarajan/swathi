package April.ex_18042024;

public class Lab042 {
    public static void main(String[] args) {
        //Narrowing is the process of converting higher datatype to lower type


        int a1 = 300;
        // byte range is only -128 to 127
        //byte b1 = a1;// --> not allowed because int is bigger container can't store it in small container byte.
        // But you can Explicitly tell convert a1 into byte and then store it in byte
        byte b1 = (byte)a1;
        System.out.println(b1); // --> here the output is 44.
        // Data loss is happening
        // 300 is converted into Binary code 32 Bits ie; 0 1 0 1 0 1 0 1 0 1 0 1 0 1 0 1 0 1 0 1 0 1 0 1 0  1 0 1 0 1 0 1
        // byte can only store 8 bits so, only last 8 bits is taken from above 32 bits
        // These 8 bits are converted into 44





    }
}
