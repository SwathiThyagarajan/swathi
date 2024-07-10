package MAY.ex_16052024_Inheritance.Multilevel_Inheritance.Api_Automation;

public class Lab177 {
    public static void main(String[] args) {

//        Test t1 = new Test();
//        t1.openExcelFile();
//        t1.openSQLConnection();
//        int a = t1.API_VERSION;

//   What is the significance of using parent reference in child dynamic dispatch
        CommonToAll c = new CommonToAll();
        c.openExcelFile(); // u can only use this



        CommonToAll c1 = new Test();
        c1.openExcelFile();
        c1.openJSON();// This goes to Test because openJSON is 1st available in Test immediate predessor child

/*   Common Functions Rules

    1. c1.openJSON();// This goes to Test because openJSON is 1st available in Test immediate predecessor child
    2. If c1.openJSON(); is not present in Test class it will go to BaseTest
    3. If not present in BaseTest also it will go to CommonToAll class

       This applies only to common functions
*/

    }
}
