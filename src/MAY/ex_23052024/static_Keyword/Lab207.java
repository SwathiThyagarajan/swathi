package MAY.ex_23052024.static_Keyword;

public class Lab207 {public static void main(String[] args) {

    // creating an object
    OOC.SNIC snic = new OOC.SNIC();
    snic.show();
}

}

// creating outer class
class OOC{
    // creating static variable in outer class
    static int o = 10;
    int oa = 20;

    // creating static class in inner class
    static class SNIC{
        void show(){
            System.out.println(o);
            //System.out.println(oa); it in non-static member so u cannot access
        }
    }
}
