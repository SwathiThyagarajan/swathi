package MAY.ex_21052024.Abstraction.abstract_Keyword;

abstract class Car { // Here we added a keyword abstract
    // which means this class is incomplete right now
    // somebody in future will complete this


    // Generating a constructor
     Car() {
    }

    // This is a complete function
    // after brackets (){ } we have open & close flower bracket which indicates complete function
    void gearbox(){
        System.out.println("Gerabox is working ");
    }


    // creating an incomplete method car
    // when u use car u have to use drive mechanism

    // This is an Incomplete function
    // after brackets we have semicolon ; which indicates incomplete function
    abstract void drive();

    // if you are creating an incomplete/abstract method
    // u need to create abstract class also
    // so in public class Car---> remove public and add abstract
}
