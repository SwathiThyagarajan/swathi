package MAY.ex_16052024_Inheritance.Hierarchical_Inheritance.ex1;

public class Vehicle {


    // Vehicle has 2 function top speed and Default constructor

    // Default constructor
    Vehicle(){
        System.out.println("Default constructor Vehicle");
    }

    void VehicleHasTopSpeed(){
        System.out.println("Yeah from " +getClass().getSimpleName());
    }
    // getClass() functions -- tells abt which class has called u

}
