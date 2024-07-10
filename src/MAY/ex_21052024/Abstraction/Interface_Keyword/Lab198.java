package MAY.ex_21052024.Abstraction.Interface_Keyword;

public class Lab198 {
    public static void main(String[] args) {

        // this is a Runner class

        // just like class we can create interface also
        // ex: create Break interface
        // Interface_Keyword--> New--> Java Class--> Interface
        // public interface Break --> this is shown once created

        Car c1 = new Car();
        c1.startEngine();
        c1.applyBrake();
        c1.stopEngine();

        // Default functions
        c1.haltingEngineJuststart();
        c1.haltingEngineJuststop();

        // Static functions can also be called will be explained in next topic


        // By using Interface we have totally hidden the functionalities

        // Refer Notes for theory
//        native
//        native  refers to  c++ language
//        Native  if java wants to use c++ language then it will use native keyword


    }



}
