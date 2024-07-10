package MAY.ex_18052024.Polymorphism.MethodOverloading;

public class Lab189 {

    // Constructor Overloading
    // We have already seen this in parameterised constructor
    Lab189(){

    }

    Lab189(int a ){

    }

    Lab189(int a, int b){

    }
    Lab189(int a, String b){

    }




    // Method Overloading --> multiple methods with same name, but different arguments
    // order also matters

    // creating a gift method
    void Gift(String s){
        System.out.println("S is a String -->" + s);
    }
    // creating another method with same name but different argument
     int Gift(int x){
        System.out.println("X is a int -->" + x);
        return x;
    }

    float Gift(float x){
        System.out.println("X is a float -->" + x);
        return 89 ;
    }

    void Gift(double x){
        System.out.println("X is a double -->" + x);
        return ;
    }
    // order matters

    void a(int pramod, float amit){

    }
    void a(float y,int x){

    }

    // Creating a Runner class
    public static void main(String[] args) {
        Lab189 p = new Lab189();
        p.Gift(10); // this will match int
        p.Gift("Pramod"); // this will match String

    }


}

