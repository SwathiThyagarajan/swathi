package MAY.ex_18052024.super_thisKeyword;

public class Lab181 {
    public static void main(String[] args) {


        // Super keyword in Java
        // parent -> child relationship Single Inheritance
        // Super keyword is a reference to parent class
        // It can refer Variable of Parent.
        // It can refer Method of the parent.
        // It can refer Constructor of the parent.

        // Step 3

                // Creating an instance of Car
                Car c = new Car();
                int speed = c.maxSpeed;
        System.out.println(speed); // Here this will print child's maxspeed
                // Displaying the maximum speed of Vehicle and Car
                c.display();
            }
        }

// Subclass / child class   Step  2
// Car is a type of Vehicle here we are using single Inheritance
        class Car extends Vehicle {
              int maxSpeed = 180; // Child class's instance variable
            // Creating a display method to show max speed in sout
            void display() {

                // void display() {
                // How this function is accessed
//  if Private is added infront of int maxSpeed = 180; Then we cannot access int speed = c.maxSpeed;
//  In  such cases we can access maxspeed through display function.
// display function can access it through this. function

//   Here for  car there is no instance variable for now. but how to access it
//          System.out.println("Max speed of car can be" + maxspeed);
//   you cannot directly access the maxspeed as shown above nothing will be printed in sout

                // Using super to refer to the parent class's instance variable maxspeed
                System.out.println("Max speed of Vehicle can be: " + super.maxSpeed);
                // Using this to refer to the child class's instance variable maxSpeed
                System.out.println("Max speed of Car can be: " + this.maxSpeed);
            }
        }

// Superclass / Parent class  Step  1
// Creating a Vehicle class with an instance variable maxspeed
        class Vehicle {
    int maxSpeed = 100; // this is an instance variable

    // No return type, no argument method
    void message() {
        System.out.println("This is Vehicle Class");
    }

}