package MAY.ex_18052024.Polymorphism.MethodOverRiding;

public class Lab190 {
    public static void main(String[] args) {

        // MethodOverRiding

        Dog d = new Dog();
        d.bark();

        Mudhol_Hound h = new Mudhol_Hound();
        h.bark();

        Dog d1 = new Mudhol_Hound();
        d1.bark(); // dynamic dispatch / Runtime polymorphism

    }

}
