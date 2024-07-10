package MAY.ex_16052024_Inheritance.Hierarchical_Inheritance;

public class Intro {


/*                1 Father, Multiple children
     Hierarchical inheritance in Java is a type of inheritance
     where multiple classes inherit from a single parent class.
     This allows different subclasses to reuse the code in the parent class,
     providing a way to establish a natural hierarchy.
     Below is an explanation with examples to illustrate hierarchical inheritance in Java.

### Key Points of Hierarchical Inheritance:

1. **Single Parent Class**: Multiple child classes inherit from a single parent class.
2. **Code Reusability**: Common code can be placed in the parent class and reused in child classes.
3. **Polymorphism**: Subclasses can override methods of the parent class to provide specific implementations.

### Example:

Let's say we have a base class `Animal` and two subclasses `Dog` and `Cat` that inherit from `Animal`.


// Parent class
class Animal {
    void eat() {
        System.out.println("This animal eats food");
    }
}

// Child class Dog inherits from Animal
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

// Child class Cat inherits from Animal
class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows");
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating objects of subclasses
        Dog dog = new Dog();
        Cat cat = new Cat();

        // Calling methods from parent class
        dog.eat(); // This animal eats food
        cat.eat(); // This animal eats food

        // Calling subclass-specific methods
        dog.bark(); // Dog barks
        cat.meow(); // Cat meows
    }
}


### Detailed Explanation:

1. **Class `Animal`**:
   - Contains a method `eat()`.
   - This method is common to all animals, so it's placed in the base class.

2. **Class `Dog`**:
   - Inherits from `Animal`.
   - Contains an additional method `bark()`, which is specific to `Dog`.

3. **Class `Cat`**:
   - Inherits from `Animal`.
   - Contains an additional method `meow()`, which is specific to `Cat`.

4. **Main Class**:
   - Creates objects of `Dog` and `Cat`.
   - Calls the `eat()` method from `Animal` class using both `dog` and `cat` objects.
   - Calls `bark()` method using the `dog` object and `meow()` method using the `cat` object.

### Advantages of Hierarchical Inheritance:

1. **Code Reusability**: Shared code is written once in the parent class and used by all child classes.
2. **Ease of Maintenance**: Changes in the parent class automatically reflect in all child classes.
3. **Logical Structure**: Represents a clear hierarchy and logical relationships between classes.

### Considerations:

1. **Overriding Methods**: Child classes can override methods of the parent class to provide specific behavior.
2. **Access Modifiers**: Ensure correct use of access modifiers (`private`, `protected`, `public`)
                         to control access to parent class members.
3. **Constructors**: Parent class constructors are not inherited,
                     but can be called from the child class using `super()`.

Hierarchical inheritance is widely used in Java to model real-world relationships
 and to create a clean, maintainable, and reusable code structure.
 */

/*
1. Overriding Methods
Overriding methods allows a subclass to perform the same task but in a different way of a method that is already defined in its superclass.

   Overriding Methods means that child classes can provide their own version of a method that is already defined in the parent class.
This allows child classes to customize the behavior of methods inherited from the parent class.
It's like giving each type of animal its own way of making a sound, even though they all share the same basic idea of making a sound.
This concept is crucial in object-oriented programming as it allows for more flexible and specialized behavior in subclasses while maintaining a common interface in the superclass.

 class Animal {
    void eat() {
        System.out.println("This animal eats food");
    }
}

class Dog extends Animal {
    // Overriding the eat method
    @Override
    void eat() {
        System.out.println("Dog eats bone");
    }
}

class Cat extends Animal {
    // Overriding the eat method
    @Override
    void eat() {
        System.out.println("Cat eats fish");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        // Calling overridden methods
        dog.eat(); // Dog eats bone
        cat.eat(); // Cat eats fish
    }
}




 */

}
