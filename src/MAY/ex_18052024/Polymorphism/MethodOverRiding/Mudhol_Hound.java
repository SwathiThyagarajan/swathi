package MAY.ex_18052024.Polymorphism.MethodOverRiding;

public class Mudhol_Hound extends Dog {// Indian Dog Breed

//     @Override -- type @ select overide this is an annotation
    // this is optional java knows it is an overide u don't have to mention
    // @Override means same method name present in Dog, but we are overiding here in Hound
    // hound also can bark
    void bark() {
        System.out.println("I am Mudhol_Hound , I will Sniff!!");
    }
}
