package MAY.ex_14052024_Constructors;

public class Lab172 {
    public static void main(String[] args) {

        BankAccount sbi_ref = new BankAccount();// Default constructor
        sbi_ref.printDetails();
        System.out.println();

        BankAccount hdfc_ref = new BankAccount();
        hdfc_ref.printDetails();// here bank name will be sbi to change use parameterised constructor
        System.out.println();

        BankAccount axis_ref = new BankAccount("Axis",100,"Axis001");
        axis_ref.printDetails();
        System.out.println();

        BankAccount icici_ref = new BankAccount("ICICI",20,"ICIC001");
        icici_ref.printDetails();
        System.out.println();

        BankAccount yes_ref = new BankAccount("YES","YES001");
        yes_ref.printDetails();
        System.out.println();
    }
}
