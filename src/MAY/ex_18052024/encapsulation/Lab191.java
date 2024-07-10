package MAY.ex_18052024.encapsulation;

public class Lab191 {
    public static void main(String[] args) {

        // Bad example
        // anyone can create a username and password
        vwologin v1 = new vwologin("admin", "admin123");
        // suppose 1st line code is hidden the hacker can still access the password
        // by using v1.password because in vwo class String username & password; is default
//        v1.username = "admin";
//        v1.password = "admin123";
//        System.out.println(v1.password);
    }

/*
    Example we have a VWO login class
    we are going to automate the page of vwo login page
    we have email id, password and subbmit options
    we can click on green button & submit
 */


}

class vwologin{
    private String username;
    private String password;
    // Right now the access modifier we are using is default
    // we need to change it to private so hackers cannot access
    // Therefore we need to hide the data members


    public vwologin(String username , String password) {
        this.username = username;
        this.password = password;
    }
}

