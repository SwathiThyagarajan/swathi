package MAY.ex_18052024.encapsulation;

public class ICICIBank {

    // Private
    // Use Setter and Getter with Condition to secure your data members by methods
    // hide the data members - ecapsulation

    // In this bank we have 2 options name and balance
    // conditions are balance should be greater than 0
    // only admins can set the balance

   private String name;
    private long balance;


    // crteate constructor
    public ICICIBank(String name, long balance) {
        this.name = name;
        this.balance = balance;
    }

    // generate getter setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        if (balance > 0){
        this.balance = balance;
    }else {
            System.out.println("Not Allowed");
        }
        // Goa - Scoty -> key -> set (adahr card ) - control
}
}
