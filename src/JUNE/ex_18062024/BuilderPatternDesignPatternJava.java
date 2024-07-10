package JUNE.ex_18062024;

public class BuilderPatternDesignPatternJava {

    public BuilderPatternDesignPatternJava groundFloor(){
        System.out.println("Do some task for Ground floor");
        return this; // returning BuilderPatternDesignPatternJava
    }

    public BuilderPatternDesignPatternJava FirstFloor(String name){
        System.out.println("Do some task for First floor" + name);
        return this;
    }

    public BuilderPatternDesignPatternJava secondFloor(String name, String color) {
        System.out.println("Do some task for second floor" + name + color);
        return this;
    }

    public static void main(String[] args) {
        BuilderPatternDesignPatternJava bp = new BuilderPatternDesignPatternJava();
//        bp.groundFloor();
//        bp.FirstFloor("FF" );
//        bp.secondFloor("SF", "Red");

        // Instead of doing all above steps I can do the below also using (dot .) operator
        bp.groundFloor().FirstFloor("FF").secondFloor("SF","Red");


        // we use Builder Pattern in Rest Assured also.



    }


}
