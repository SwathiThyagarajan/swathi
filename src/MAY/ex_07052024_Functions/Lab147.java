package ex_07052024;

public class Lab147 {
    public static void main(String[] args) {

    /* Functions v/s Methods
       whenever a function is used in a separate class then it is called as a method
       else we call it as a normal function

       There are 2 types of function
       1. Does not return anything / something
          - if a function does not return anything it is known as void return
       2. Returns something

       How a function can call another function ???
        - for this purpose always you must the below steps
        1.Define a function--> Give Definition of a function
        2. call the function

        To call another function within a function you must
        add static to (void saysomething(){)
        i.e;--> static void saysomething(){
     */
        saysomething();// This is Step 2--> calling the function
        System.out.println("End!!");

    }
    // Let's create a function
    // First we will create a function which does not return anything

   // void saysomething(){
   // To call another function within a function you must add static keyword

    static void saysomething(){ // This is Step 1--> Defining the function
        System.out.println("Hello, How are You?");

        /*
           Now here if you notice main is also a function with void
           void means it does not return anything

           A function can call another function also
           just like how in lab147 we have created a main method and also created a saysomething function
           But a function within a function is not possible

         Execution will start from line no.4 main method
           How execution works :--
           JVM will call the main function
           main function is calling the saysomething function
           whenever you call something JVM will go to the definition
           so, now it will execute the sout code
           the output will be "Hello, How are You?"
           After this JVM will return back to line no. 24 saysomething
           where main function is calling another function
           1st say something will be called then sout will be printed

           JVM-->main function-->saysomething-->static void saysomething(){-->execute sout and print "Hello, How are You?"
           -->saysomething-->execute sout--> and print "End!!"
         */
    }

}
