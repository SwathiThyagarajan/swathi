package MAY.ex_21052024.Abstraction.Interface_Keyword;

public class Lab200 {
}

class Pramod extends B1{

    @Override
    public void atb() {
        System.out.println("ATB completed");
    }

    @Override
    void mtb() {

    }
}

abstract class B1 implements Course{
    abstract void mtb();

}

interface Course{
    void atb();
}
