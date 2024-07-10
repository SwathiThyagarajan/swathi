package MAY.ex_07052024_Functions;

public class Lab149 {
    public static void main(String[] args) {

        // create a function which will say Hi

        sayHi(); // calling a function
        sayHi(); // calling a function again
        sayHi(); // calling a function agian
        sayHi(); // calling a function again
        System.out.println("-------");
        // we can call infinite no. of times 
        // suppose I want to call it 100 times then instead of doing ctrl D
        // I can use for loop to call a function multiple times
        for (int i = 0; i < 100; i++) {// it will call 100 times
            sayHi();

            sayBye(); // incase You are calling this function without defining it then
            // if you over over on sayBye and move cursor on bulb symbol
            // it will show an option to create a method sayBye
            // if u select it automatically a method will be created
            Rama();
            Ram();
        }

        }

     static void Ram() {
    }

    static void Rama() {
        System.out.println("Rama");
    }

    static void sayBye() { // You can remove private keyword in the front
         System.out.println("Bye");
    }

    static void sayHi(){
        System.out.println("Hello Hi");// step 1 Defining a function

    }


}
