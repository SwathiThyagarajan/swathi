package MAY.ex_18052024.super_thisKeyword;

public class Lab183 {
    public static void main(String[] args) {

        // Super with constructor

        Physics sc1 = new Physics();


/*
   output
            science - Default constructor
           Physics - Default constructor
   when we use Default constructor automatically super keyword is assigned in child class
    which is invisible. it will call the parent's Default constructor

  If child has DC -> Parent DC will be called by super() automatically in Java
*/

/*
       To access a variable -- use --  super.variable
       To access a method -- use --  super.method()
       To access a Default constructor -- use--  super()
       To access a Parameterised constructor -- use -- super("pramod')

 */

    }
}
class science{// Creating Super/parent class
    science(){ // Default constructor
        System.out.println("science - Default constructor");
    }

    // If Parent has parameterised constructor then how to call it
    science(String a) {
        System.out.println("science - Parameterised constructor");
    }

    science(String a, int a1){
        System.out.println("science - Parameterised constructor");
    }
}

class Physics extends science{

    Physics(String s ){
        System.out.println("Parameterised constructor - Physics");
    }


    Physics(){
        //        super(); // this is automatically assigned by java we do not enter this
        super("pramod", 13);
        // science(String a, int a1){ when u have a parameterised constructor in parent class
        // then while calling super keyword you add parameter with super
  //      this("Pramod"); not allowed
  //      super("Pramod"); not allowed
        System.out.println("Physics - Default constructor");
    }
    /*
     In Java, you cannot use both this and super in the same constructor
 because each constructor must either call another constructor in the same class (using this)
 or call a constructor in the superclass (using super),
 and this call must be the first statement in the constructor.

   Key Points
Constructor Calls:
If you need to call a superclass constructor, use super as the first statement.
If you need to call another constructor in the same class, use this as the first statement.
You cannot combine super and this in the same constructor call.
 */

}