package MAY.ex_21052024.Abstraction.abstract_Keyword.Real_ex;

public class Lab195 {
    public static void main(String[] args) {

        // suppose I have a runner class i will cretae an TC1 object

        TC1_CHROME chrome = new TC1_CHROME();
        chrome.openBrowser();
        chrome.closeBrowser();

        // here the we do not know the base class from where chrome.openBrowser();
        //        chrome.closeBrowser();functions  are coming it is hidden
        // Baseclass is totally hidden from the runner class
        // This is how abstraction is done
    }
}
