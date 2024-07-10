package MAY.ex_16052024_Inheritance.Multilevel_Inheritance;

public class Lab175 {
    public static void main(String[] args) {


//        Child c = new Child();
//        c.home();

/*   c.home();--> Trying to access home
    1.  Here child's home is accessed because child has home of 3bhk latest one will be used
    2. If child does not have any home then Father's home will be used
    3. If Father also does not have then Grandfathers will be used

    So, here we have 3 levels
    Child---> Father--> GrandFather
 */
//
//        GrandFather grandFather = new GrandFather();
//        grandFather.home();
//
//        Father father = new Father();
//        father.home();
//
//        Child child = new Child();
//        child.home();
//

        // DYNAMIC DISPATCH

//   GrandFather can access all of them  GrandFather, Father and Child
        // Upcasting
        GrandFather grandFather1 = new GrandFather();
        grandFather1.home();
        GrandFather grandFather2 = new Father();
        grandFather2.home();
        GrandFather grandFather3 = new Child();
        grandFather3.home();

        Father f1 = new Child();//whose ever new object is created 1st their home/ functio will be accessed
        f1.home(); // Father can access child home because child is born

//   Child reference cannot access GrandFather home before he is born
//   Child is born using new keyword -->  new Child();object
//        Child c1 = new GrandFather();
     //   This statement is trying to create an instance/object of the GrandFather class
    //    using the new keyword and assign it to a reference of type Child.
    //    However, GrandFather is the superclass in this hierarchy, and Child is the subclass.
    //    In Java, you cannot directly assign an instance of a superclass to a reference of its subclass type
    //    without explicit casting. This statement would result in a compilation error.

//        Father c2 = new GrandFather();

//    A Super class/Parent class can access Sub/child/derived class but Child cannot access parent
    }
}
