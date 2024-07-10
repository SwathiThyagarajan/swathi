package MAY.ex_21052024.Abstraction.Interface_Keyword;

public class Car implements Brake, Engine{

    // here in car class we use implements instead of extends
    // by using implements we can implement the Brake, Engine interface
    // who ever implements they need to give all the definition of incomplete functions

    @Override
    public void applyBrake() {
        System.out.println("Applying Brake");

    }

    @Override
    public void startEngine() {
        System.out.println("Starting Engine");

    }

    @Override
    public void stopEngine() {
        System.out.println("Stopping Engine");
    }

    // Here we are using Multiple Inheritance
    // Grandfather--> Son1---> Son2
    // A-->B--->c

    // Multilevel Inheritance Grandfather-->Father--> Child
    // A--> B, C
}
