package MAY.ex_14052024_Constructors;

public class BankAccount {

    String bankName;
    int balance;
    String bankcode;

    // All of the above are Instance variables
    // where default values are automatically assigned for the variables
    // String null, int 0.

//     Default constructor
    BankAccount(){
        bankName = "SBI";
        bankcode = "SBI001";
        balance = 0;

        // once  Default constructor is created all the default values will be changed to default constructor values
    }

       // Parameterised constructor
    public BankAccount(String bankName, int balance, String bankcode) {
        this.bankName = bankName;
        this.balance = balance;
        this.bankcode = bankcode;
    }
    // constructor overloading
    public BankAccount(String bankName, String bankcode) {
        this.bankName = bankName;
        this.bankcode = bankcode;
    }


    void printDetails() {
        System.out.println("Bank Name-->" + bankName);
        System.out.println("Bank Code-->" + bankcode);
        System.out.println(" Balance-->" + balance);
    }
}
