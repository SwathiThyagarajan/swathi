package MAY.ex_21052024.Abstraction.Static_keyword;

public class Lab201 {
    public static void main(String[] args) {

        // Static --> is a keyword
        // Static can be a --> Data member
        // Static can be a -->Function
        // Static can be a -->Class

        // Static loads when Class is loaded. -
        // The moment u load the class loaders static variables is also loaded in JVM

        ATB amit = new ATB("9558648872");
        ATB pramod = new ATB("+12558648872");

        amit.printDetails();
        pramod.printDetails(); // the output of both will be different because they belong to class & not class

        System.out.println(ATB.courseName);
        // static means
        // if u see a black board and there are 4 object persons
        // suppose teacher wrote a = 10, object 2 changed a = 20
        // latest value everyone sees is 20
        // it is specific to a class

        ATB ashok = new ATB("6558475512");
        ATB ashok2 = new ATB("6558475512");
        // if I create the same object twice still output will be printed only once because class is loaded only once

        // Here the moment u load the ATB class then automatically the static code in ATB class will be executed
        // static {
        //        System.out.println("I will be Executed when class is loaded");
        //    } this code will be executed automatically

//        ATB priya = null; // if object is not created then code will not be executed

    }

}
// Interview question SIB vs IIB

class ATB{

    // static Block also known as SIB static initialisation block
    static {
        System.out.println("SIB--> I will Load only one Time and  Executed when class is loaded");
    }

    // we can create a IIB --> Insatance initialisation block
    // This is Non static block it is created when object is created
    {
        System.out.println("IIB --> Insatance initialisation block, will be loaded whenever object is created ");
    }


    // static variable belongs to class
    static  String courseName = "ATB";// this is static variable same for pramod and amit
    String phoneNo; // Non static, Instance variable

    public ATB(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public void printDetails(){
        System.out.println("This will print Your Details -->" + "" + this.phoneNo);

    }

    // usage of static blocks and static keyword is to provide common variables,methods to the objects
    // what ever is not common u will declare it as non static
}

