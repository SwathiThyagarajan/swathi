package MAY.ex_21052024.Abstraction.abstract_Keyword.Car_ex;

abstract class Car extends Engine{
    // So here car class has implemented all the incomplete functions

    @Override
    void start() {
        System.out.println("Starting the Car");

    }

    @Override
    void stop() {
        System.out.println("Stopping the Car");
    }

    @Override
    void partsGearBox() {
        System.out.println("Assemble the GearBox");

    }

    @Override
    void openCar() {
        System.out.println("Open Car");
    }

//    @Override
//    void openCarWithKeys() {
//        System.out.println("Opening the car using keys");
//    }

    // suppose car has a child Tesla

    abstract void breakMechanism();
    // since we have created an abstract fuction we had change this concrete class to abstract
    // Therefore now the implementation has to be done by tesla
}
