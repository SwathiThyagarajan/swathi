package MAY.ex_23052024.static_Keyword;

public class Lab206 {
    public static void main(String[] args) {

        // creating an instance of class
        Car c = new Car("Lamborgini");

        // Create an instance of the inner class Engine to access it
        // to access the inner class we need to use the outer reference "c"
        // if u don't know the outer reference "c" you cannot access the inner class
        Car.Engine engine = c.new Engine("400CC");

        // Call methods to start the engine
        engine.start();
        c.drive();

        // Nested class is used to shield the  Inner class

    }
}
// creating a car class
class Car {
    String make; // Instance Variable

    // Generating a parameterised constructor
    public Car(String make) {
        this.make = make;
    }

    // creating a method
    void drive() {
        System.out.println("You can Drive the car");
    }

    // creating an inner class Engine
    class Engine {
        // Instance Variable
        String horsePower;

        // Generating a parameterised constructor
        public Engine(String horsePower) {
            this.horsePower = horsePower;
        }

        // Creating a method start which can access make
        void start() {
            System.out.println("Engine is started !! -> " + make);
            // make is allowed to be used in inner class
        }

        // Engine can have one more class GearBox
        class GearBox {
            void m2() {
                System.out.println("m2");
            }

            class PP {
                class OO {

                }
            }

            // You can create any no. of class within class
        }
    }
}