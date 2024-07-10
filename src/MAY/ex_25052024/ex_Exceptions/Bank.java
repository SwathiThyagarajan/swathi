package MAY.ex_25052024.ex_Exceptions;

public class Bank {
    private String currency;
    private Integer amount;

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Bank(String currency, Integer amount) {
        this.currency = currency;
        this.amount = amount;
    }
    // with throws keyword
    public Integer add(Bank bankName) throws Exception {
        if (!bankName.currency.equalsIgnoreCase("INR")) {
            throw new Exception("Currency Doesn't Match");
        }
        Integer sum = this.amount + bankName.amount;
        return sum;
    }
    // without throws keyword with try catch
    public Integer add1(Bank bankName1) {
        try {
            if (!bankName1.currency.equalsIgnoreCase("INR")) {
                throw new Exception("Currency Doesn't Match");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        Integer sum = this.amount + bankName1.amount;
        return sum;
    }

    }

// we can use try catch also
// we cannot sum INR and USD together, so, we should add some kind of condition in the Bank class
// to avoid currency mismatch

// condition --> if ny bankname currency  is notb equal to INR throw a new type of exception
