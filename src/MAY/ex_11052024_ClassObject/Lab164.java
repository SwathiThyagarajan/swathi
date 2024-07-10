package MAY.ex_11052024_ClassObject;

public class Lab164 {
    public static void main(String[] args) {

        // creating an object named tesla

        Car tesla = new Car();
        tesla.name = "Tesla";
        tesla.model = "Model 3";

        tesla.reverse();
        tesla.speedTop(); // after tesla once u type .you can find a list of functions that u can access

       /* How tesla is able to access all these functions
        In JVM we have class loaders, a class named car will be loaded
        In the Heap area we have object area, when we use new operator and type new car();
                A new area was created. This area will have Attributes/properties and Behaviour/functions
                So, in every tesla reference the tesla will point to attributes and behaviour in object area
*/
        // we can create another object names volvo
        Car volvo = new Car();
        volvo.name = "Volvo";
        volvo.model = "XC90";

        volvo.reverse();
        volvo.speedTop();

        // when we created a new object volvo here
        // The reference volvo is totally different,
        // a new object area is created with different attributes and behaviour

        // So, totally we will have 2 object area created where
        // tesla reference will point 1 object area and
        // volvo refence will point the other object area





    }
}
