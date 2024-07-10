package MAY.ex_11052024_ClassObject;

public class Lab161 {

    // All of the below are override functions

    public Lab161() {
        super();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public static void main(String[] args) {

        /*  IMPORTANT TOPIC
          Topics Covered:---
          1. OOPS concept
             - Object class
             2. why object class is created
         */
        /*Object class- every class extends to a object class
          object class is parent of every class
          which means there will be some common attribute which
          will be shared by object class to lab 161

          why object class is created??
          *  by default this object class is present in java.lang Package
          *  every class in java is directly or indirectly derived from object class
             they wanted to create a object oriented programming.
             Therefore they added a parent class of object to every class
             so that few methods and functions can be reused by any class
          *  The moment you create Lab161 in main method you can dirtectly declare toString method
             no need to initialise them --> this function is coming from object class

 If you Right click on the screen and click on Generate -> override method.
 You can see all the object class functions under java.lang.object
 In the object class we can find many methods like hashcode, =,clone, tostring etc.
 We can call all the override functions

          The advantage of using this override functions is you can re-use this,
  Example:- By default all the properties of the parents will be available to their children
            if they have 3BHK, scooty etc...
            by default all these inherited to them
            The Developers java created a parent class and sub classes which u can access from parent class
          by default all the properties of parent class will be available to other sub classes under it
          we can use this pre built functions if required in future
          only few are useful like toString, hashcodes and equals

          How these methods are used, to understand this first we need to understand oops concept first.

   In API and web Automation toString, hashcodes and equals only these are used majorly

         */






    }
}
