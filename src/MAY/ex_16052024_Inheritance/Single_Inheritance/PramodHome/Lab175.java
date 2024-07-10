package MAY.ex_16052024_Inheritance.Single_Inheritance.PramodHome;

public class Lab175 {
    public static void main(String[] args) {

        // This is a Runner class
        // The Runner class in Java typically refers to a class that contains the main method,
        // which serves as the entry point for the program.

        Pramod pRef = new Pramod();
        pRef.bhk2();

//    pRef.bhk2();
//   1.  if pramod class is empty only whn pramod class extends father this pRef.bhk2(); is allowed
//   2.  if pramod class has some function then it will access and print pramods bhk

        // child has more priority


        Sister s = new Sister();
    //    s.bhk2(); sister cannot access fathers property



    }


}
