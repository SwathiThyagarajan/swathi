package MAY.ex_21052024.Abstraction.Interface_Keyword;

public interface Engine {

    void startEngine();
    void stopEngine();
    // when we use interface we don't have to mention the keyword for incomplete functions

    // interface can have 1 complete method known as default
    default void haltingEngineJuststart(){
        System.out.println("Juststart Halts the Engine");
    } // this is a complete function

    // we can have multiple default functions
    default void haltingEngineJuststop() {
        System.out.println("Juststop Halts the Engine");
    }

    // we can have static function also
    static  void M1(){
        System.out.println("M1");
    }

    // we cannot have a normal complete/concrete function
//    void m2(){
//
//    }
}
