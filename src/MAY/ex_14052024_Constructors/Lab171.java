package MAY.ex_14052024_Constructors;

public class Lab171 {
    public static void main(String[] args) {

        ATBPerson amitRef = new ATBPerson(); // Default constructor
        ATBPerson pramodRef = new ATBPerson("Pramod", 9554618872l, "pramod@gmail.com",true,"ATB");
        ATBPerson atulRef = new ATBPerson("Atul", 9554649972l, "atul@gmail.com",false,"MTB");
        //if ratul belongs to MTB and ATB then
        atulRef.courseName = "ATB";
        ATBPerson swathiRef = new ATBPerson("Swathi",9556485565l); // constructor overloading using 2 parameters

        // above the 2 objects have 2 different entities this is how real things are added using constructors

        // If u want toi create 100 objects then u can use for loop but, it will print same name
        for (int i = 0; i < 100; i++) {
            new ATBPerson("A"+i, 9554618872l, "pramod@gmail.com",true,"ATB" );
            System.out.println();
        }

    }
}
