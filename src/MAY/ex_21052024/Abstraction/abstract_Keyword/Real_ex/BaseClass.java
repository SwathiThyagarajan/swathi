package MAY.ex_21052024.Abstraction.abstract_Keyword.Real_ex;

abstract class BaseClass {

    // suppose we are creating web automation
    // In web automation why abstraction is used

    // Hierarchical Inheritance--> we have a Base class --> Child 1, Child 2

    // I have 2 functions which are incomplete/abstract class
    abstract String openBrowser();
    abstract String closeBrowser();

    // 1 compplete class

    void printing(){
        System.out.println("Logs");
    }


}
