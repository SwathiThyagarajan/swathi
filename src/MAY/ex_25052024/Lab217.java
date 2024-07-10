package MAY.ex_25052024;

public class Lab217 {
    public static void main(String[] args) {


//        // I want to Run Only Test Related to Login
        PAGES ref = PAGES.LOGIN;
        // driver.get(ref.getUrl()); we will use this in future it is selenium code
        System.out.println(ref.getPage());
        System.out.println(ref.getUrl());

        // here we are using enums from PAGES class created
        // suppose url changes in PAGES no need to change in Lab217/Testcase u must change only in enum class PAGES
    }
}
