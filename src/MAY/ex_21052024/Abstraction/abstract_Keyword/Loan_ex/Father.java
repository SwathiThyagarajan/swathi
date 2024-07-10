package MAY.ex_21052024.Abstraction.abstract_Keyword.Loan_ex;

abstract class Father {

    // here Father is an abstract class
    // Father has somekind of loan

    abstract void loan50k(); // new loan
    void loan25k(){
        System.out.println("25k Repaid by Father");
        // this 25k is apart from 50k which is repaid
        // so pending is 50k
    }

}
