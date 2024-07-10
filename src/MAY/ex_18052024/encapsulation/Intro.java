package MAY.ex_18052024.encapsulation;

public class Intro {

    /*
    Encapsulation is the process of wrapping the data (variables) and the code (methods)
    that operates on the data into a single unit, called a class.
    This concept is also known as data hiding because
    it restricts direct access to some of the object's components,
    which can prevent the accidental modification of data.

    Encapsulation refers to the bundling of data and methods that operate on that data within a single unit, or object.
    Encapsulation helps to promote the principle of "data hiding".
    This is achieved by declaring the object's data fields as private
    and providing public getter and setter methods to access and modify the data.
    */

        // Encapsulation is a fundamental concept in object-oriented programming (OOP),
        // and it is one of the four basic principles of OOP, along with abstraction, inheritance, and polymorphism.
        // In Java, encapsulation refers to the bundling of data (variables) and methods (functions)
        // that operate on the data into a single unit, typically a class.
        // This concept also restricts direct access to some of an object's components,
        // which is a means of preventing accidental interference and misuse of the data.
        // Here are the key aspects of encapsulation in Java:

        // ### 1. **Private Fields**
        // Fields (variables) of a class are made private to prevent direct access from outside the class.
        // This is achieved using the `private` keyword.

        public class Person {
            private String name;
            private int age;
        }

        // ### 2. **Public Getter and Setter Methods**
        // To access and update the value of private fields, public methods known as getters and setters are provided.
        // This allows for controlled access to the fields.

        public class Person1 {
            private String name;
            private int age;

            // Getter for name
            public String getName() {
                return name;
            }

            // Setter for name
            public void setName(String name) {
                this.name = name;
            }

            // Getter for age
            public int getAge() {
                return age;
            }

            // Setter for age
            public void setAge(int age) {
                if (age > 0) { // Example of validation
                    this.age = age;
                }
            }
        }

        // ### 3. **Benefits of Encapsulation**
        // - **Data Hiding:** The internal state of an object is hidden from the outside. Only the object’s methods are exposed to interact with that state.
        // - **Increased Flexibility:** The internal implementation of the class can be changed without affecting the code that uses the class.
        // - **Improved Maintainability:** Since the class controls how its data is accessed and modified, it is easier to debug and maintain.
        // - **Enhanced Security:** By controlling the access level of the class members, you can protect the integrity of the data.

        // ### 4. **Example Usage**
        // Here's an example demonstrating encapsulation:

//        public class Main {
//            public static void main(String[] args) {
//                Person1 person = new Person1();
//                person.setName("John Doe");
//                person.setAge(30);
//
//                System.out.println("Name: " + person.getName());
//                System.out.println("Age: " + person.getAge());
//            }
//        }

        // In this example, the `Person1` class encapsulates the `name` and `age` fields, and provides controlled access through the getter and setter methods.

        // ### 5. **Encapsulation in Practice**
        // Encapsulation is a widely used practice in Java and other object-oriented languages. It is particularly useful in large and complex systems where maintaining the integrity and consistency of data is crucial. By using encapsulation, you can ensure that the internal state of an object is accessed and modified in a controlled manner, thus leading to more robust and reliable code.
        // In summary, encapsulation in Java is about keeping the internal data of an object safe from outside interference and misuse, while providing a clean and controlled interface for interacting with that data. This leads to better modularity, maintainability, and security in your code.
    }


//        ### Key Points:
//            1. **Private Fields:** The `Person` class demonstrates fields made private to prevent direct access.
//            2. **Getter and Setter Methods:** The `Person1` class provides getter and setter methods to access and modify private fields.
//3. **Benefits:** Encapsulation ensures data hiding, flexibility, maintainability, and security.
//4. **Example Usage:** The `Main` class provides an example of how encapsulation is used in practice.
//
//    This structure ensures that the explanation and code examples are clear and cohesive.

