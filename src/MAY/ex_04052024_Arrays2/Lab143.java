package MAY.ex_04052024_Arrays2;

public class Lab143 {
    public static void main(String[] args) {

       String s1 = "Swathi"; // this will be stored in string constant pool
       String s2 = new String("Swathi"); // this will be stored in object/ heap area

       // Strings are immutable in nature:- which means once created cannot be changed

        // The value of stringBuffer can be changed
        StringBuffer stringBuffer = new StringBuffer("Swathi");//This value will be stored in Heap/object area
        stringBuffer.append("Thyagarajan"); // append means to add, now there will be onle one string that is SwathiThyagarajan

        StringBuilder stringBuilder = new StringBuilder("Swathi");
        stringBuilder.append("Thyagarajan");

        /*
           What is String Builder and String Buffer?? Refer notes

           StringBuffer and StringBuilder are mutable in nature
           You don't have to create new string everytime
           You can just append/update the existing string

           StringBuffer and StringBuilder both are like brothers
           only minor difference is there
           StringBuffer is Thread safe - anyone can use it one by one everyone cannot access it at once
           This is a slow process
           StringBuilder is not Thread safe - here every one can use it at once and this is faster*/






    }
}