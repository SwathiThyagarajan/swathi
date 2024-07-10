package MAY.ex_21052024.Abstraction.abstract_Keyword.Real_ex;

public class TC2_FIREFOX extends BaseClass{
    // Firefox will have its own way of implementing

    // Abstraction means hiding the important functionalities
    // where we have hidden the functionality

    @Override
    String openBrowser() {
        System.out.println("Starting Firefox 1");
        return "";
    }

    @Override
    String closeBrowser() {
        System.out.println("Starting Firefox 2");
        return "";
    }
}
