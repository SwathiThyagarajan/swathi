package MAY.ex_25052024;

public class Lab215_1_enum_Intro {

 /*
    In Java, an enum (short for "enumeration") is a special data type that enables a variable to be a set of predefined constants. Enums are used when we know all possible values at compile time, such as days of the week, directions, states, etc. It improves type safety and makes the code more readable and maintainable.

### Key Points about Enums in Java

1. **Declaration**:
   Enums are declared using the `enum` keyword. Here's an example of an enum for days of the week:

   ```java
   public enum Day {
       SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
   }
   ```

2. **Using Enums**:
   You can use enums just like any other data type. Here's an example:

   ```java
   public class TestEnum {
       public static void main(String[] args) {
           Day day = Day.MONDAY;

           switch (day) {
               case MONDAY:
                   System.out.println("Mondays are tough.");
                   break;
               case FRIDAY:
                   System.out.println("Fridays are better.");
                   break;
               case SUNDAY:
                   System.out.println("Sundays are relaxing.");
                   break;
               default:
                   System.out.println("Midweek days are so-so.");
                   break;
           }
       }
   }
   ```

3. **Methods in Enums**:
   Enums can have fields, methods, and constructors. Here's an example:

   ```java
   public enum Day {
       SUNDAY("Weekend"), MONDAY("Weekday"), TUESDAY("Weekday"), WEDNESDAY("Weekday"),
       THURSDAY("Weekday"), FRIDAY("Weekday"), SATURDAY("Weekend");

       private String type;

       private Day(String type) {
           this.type = type;
       }

       public String getType() {
           return type;
       }
   }
   ```

4. **Enum with Methods**:
   Enums can also include methods:

   ```java
   public class TestEnum {
       public static void main(String[] args) {
           for (Day day : Day.values()) {
               System.out.println(day + " is a " + day.getType());
           }
       }
   }
   ```

5. **Advanced Features**:
   Enums can implement interfaces and have complex behaviors. Here's an example of an enum implementing an interface:

   ```java
   interface Greet {
       void greet();
   }

   public enum Day implements Greet {
       SUNDAY {
           public void greet() {
               System.out.println("Have a nice Sunday!");
           }
       },
       MONDAY {
           public void greet() {
               System.out.println("Start of the work week!");
           }
       },
       // other days...

       public static void main(String[] args) {
           Day day = Day.SUNDAY;
           day.greet();
       }
   }
   ```

### Advantages of Enums

1. **Type Safety**: Enums provide compile-time type safety. For example, you cannot assign an integer or any other type to an enum variable.
2. **Namespace Control**: Enums provide a namespace for the values, avoiding naming conflicts.
3. **Readable Code**: Using enums makes the code more readable and understandable.
4. **Predefined Methods**: Enums come with useful predefined methods such as `values()`, `valueOf()`, `name()`, `ordinal()`, etc.

Enums in Java are a powerful feature that, when used appropriately, can lead to more readable, maintainable, and error-free code.
  */


}
