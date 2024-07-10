package MAY.ex_18052024.super_thisKeyword;

public class Lab182 {
    public static void main(String[] args) {//-----3

//         Creating an object / instance of Student
//        ClassName objectName = new ClassName();
        Student s1 = new Student(); //-------4
//          s1.message(); // whose ever object is created there message will be accessed and printed
        s1.display();

    }


}

// Creating a Student class ----2
class Student extends Person{
    // we can find--- is a  --- relation, this indicates inheritance. student is a type of person
    void message(){
        System.out.println("I am Student message");

    }
    // Creating a display function ----5
    void display(){
        this.message();
        super.message();
    }


}

// Creating a person class---1
class Person{
    void message(){
        System.out.println("I am person message");

    }
}
