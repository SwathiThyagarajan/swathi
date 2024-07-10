package MAY.ex_18052024.encapsulation;

public class Lab193 {
    public static void main(String[] args) {
        // Runner class

        ICICIBank i = new ICICIBank("Pramod",100);
        System.out.println(i.getBalance());
        i.setBalance(-1);// setting balance to -1 this should not be allowed because
        // conditions are balance should be greater than 0
        // therefore we need to add some condition in ICICI setBalance method
        // the output for i.setBalance(-1); will be Not Allowed
        System.out.println(i.getBalance());
    }



}
