package MAY.ex_14052024_Constructors;

public class Lab167 {
    // creating a Runner class in the class Lab167 and creating a main method
    public static void main(String[] args) {

        // Structure to create an object
        // ClassName objRef = new keyword + ClassName();

        // INTERVIEW QUESTION
        // Which is the object from above
        // object is --> new keyword + ClassName();
        // Object Reg --> objRef

        // ATBPerson atbPerson1 =  ATBPerson(); here this is normal calling of a function not an object
        // because new keyword is not used
        ATBPerson atbPerson1 = new ATBPerson();
        System.out.println(atbPerson1.name);// this will print null. default values
        // For Instance variables default values are automatically assigned

        atbPerson1.name = "Amit";//Assigning Amit as value to atbPerson1
        System.out.println(atbPerson1.name);// This will print Amit

        // To view 2 class/Lab exercises in same screen
        //open the 2 lab ecercises/class
        // if u right click on Lab 167/ine of the class and select split right.
        // Now u can see 2 classes

        /*
            How Execution Works:--

            Step 1--> In JVM 1st main method will be called
            Step 2--> ATBPerson -> this class is called and loaded by class loader
            Step 3--> Once class loader loads the class ATBPerson, it will go to ATBPerson file
                      and assign default values to all Instance variables present
             Right now since object is not created yet. so, we are assigning the default values for all the variables

           Step 4--> Next we have object area the object reference atbPerson1 will be pointing to null in object area
           Step 5--> The moment u create an object using new keyword. An object with attributes and behaviour is created in object area
                     Still the attributes will take the default value from class loaders
           Step 6--> the moment u assign some value to object reference (atbPerson1.name = "Amit";) the attribute value will be changed to "Amit"


           While creating the object itself we can assign the value rather than doing an extra step
            for this purpose there is a special method known as Constructor --> Refer ATBPerson class

                      

         */
    }
}
