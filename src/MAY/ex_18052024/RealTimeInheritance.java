package MAY.ex_18052024;

public class RealTimeInheritance {
    public static void main(String[] args) {

        // Dynamic Dispatch
        BaseClass t1 = new Test1();
        t1.setBrowser("edge",true);
        t1.openBrowser();
        t1.closeBrowser();
    }

}
// single in heritance
class Test1 extends BaseClass{
    @Override // method overiding
    public void setBrowser(String browser, boolean isAuth) {
//        super.setBrowser(browser, isAuth);
        System.out.println("I am done");
    }
}

class BaseClass {
    private String browser;

    public String getBrowser() {
        return browser;
    }
    // encapsulationfg
// only if ur authenticated user u can set the password
    public void setBrowser(String browser, boolean isAuth) {
        if (isAuth) {
            this.browser = browser;
        }else{
            System.out.println("Not Allowed");
        }
    }

    void openBrowser() {
        System.out.println("Chrome Browser!!");
    }
//  Method overloading concept
    void openBrowser(String browserName) {
        System.out.println("Open Browser!! -> " + browserName);
    }

    void closeBrowser() {
        System.out.println("Open Browser!!");
    }
}
