package MAY.ex_16052024_Inheritance.Multilevel_Inheritance.Api_Automation;

public class Test extends BaseTest {

    // Test extends from Base test like a - child

    void  accessExcelAndSQL(){
        openExcelFile();
        openSQLConnection();
        System.out.println(API_VERSION);// this is coming from commonToAll Grandfather
        System.out.println(VERSION);

        // I can use my Grandfather and fathers attributes and behaviour without object
    }

    void openJSON(){
        System.out.println("Test");
    }
}
