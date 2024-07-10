package MAY.ex_21052024.Abstraction.abstract_Keyword.Car_ex;

public class Lab197 {
    public static void main(String[] args) {
/*
        Car lamborgini = new Car();
        lamborgini.openCar();
        lamborgini.start();
        lamborgini.partsGearBox();
        lamborgini.stop();*/

        // since now we have changed car to abstract class
        // we cannot create an object for it

        // Only concrete clas knows about the hidden class

        // When we look at this Lab197 Runner class do we know if we have engine or Gearbox class ??
        // No we do not know. only car class knows that Engine exists
        // and only Engine class knows that GearBox exists

        // This is Multilevel inheritance A-->B-->C
        //GearBox(Granfather) -->Engine(Father)--> Car(Child)

        // Why to hide the class
        // so no one can access them. only the class which extends can access the abstract class

//        Keys k = new Keys();
//        k.openCar();
//        you can't create an object of abstract/incomplete class

        Tesla m1 = new Tesla();
        m1.openCar();
        m1.start();
        m1.partsGearBox();
        m1.stop();
        // it can access all the function in car

 /*
      Here we are hiding the functions/ classes in abstraction
      If you hide the data member(Variable) it is encapsulation
      If you hide the class(functions) it is  abstraction

  */


    }
}
