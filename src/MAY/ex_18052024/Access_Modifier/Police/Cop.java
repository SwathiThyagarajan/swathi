package MAY.ex_18052024.Access_Modifier.Police;

public class Cop {
    public int gun; // public means accessed by anyone
    private String idCard; // private -- only available to the cop

    public Cop(int gun){
        this.gun = gun; // Parameterised constructor
    }

    protected void canIshoot(){
        System.out.println("Of-course, Shoot!");
    }
}
