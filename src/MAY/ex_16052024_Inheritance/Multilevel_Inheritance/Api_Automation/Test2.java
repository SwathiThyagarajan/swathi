package MAY.ex_16052024_Inheritance.Multilevel_Inheritance.Api_Automation;

public class Test2 extends BaseTest{

    void access(){

        openExcelFile();
        openSQLConnection();

        // Common test case is created only once but, we can create multiple child class extending to it

        // Common code is written once but test cases using it can be written any no. of times


    }

}
