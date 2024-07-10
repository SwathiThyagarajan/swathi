package MAY.ex_14052024_Constructors;

public class Person {

    // Topic - Copy constructor

    String name;
    int age;

    // Parameterised constructor
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    // Copy constructor
    // u can create a constructor with same name it will take person reference
    Person(Person person) {
        this.name = person.name;
        this.age = person.age;
    }
    public static void main(String[] args) {
        // I can create a main method here also
        Person person1 = new Person("John" ,30);
        Person person2 = new Person(person1);
        System.out.println(person1.name  +  " is " + person1.age  +  " years old ");
        System.out.println(person2.name  +  " is " + person2.age  +  " years old ");
        // here by using copy constructor person2 copies the values of person1

        // In class loader we have 1 class
        // 2 objects but both have same value because we used copy constructor and copied the full reference

    }
}
