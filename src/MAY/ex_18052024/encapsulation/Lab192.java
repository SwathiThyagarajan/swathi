package MAY.ex_18052024.encapsulation;

public class Lab192 {
    public static void main(String[] args) {

        //creating vwologin1 class
        vwoLogin1 v1 = new vwoLogin1("admin","admin123");

//        v1.username = "admin" //we cannot access the username directly
//     encapsulation says that if u want to access use a function  known as getters

        String username = v1.getUsername();
//         Code to Auth  isAuth = true
//         so only if isAuthenticated is true hacker can see the password
//         if isAuthenticated is false hacker cannot see the password

        // String password = v1.getPassword(false);

        // setting password for pramod
        v1.setPassword("pramod",true);

    }



}
//   creating vwologin1 class
class vwoLogin1{
    private String username;
    private String password;

    // creating a parameterised constructor
    public vwoLogin1(String username, String password) {
        this.username = username;
        this.password = password;
    }
    // To access vwologin1 username & password create getter  setter method
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword(boolean isAuth) {
        if(isAuth) {
            return password;
        }
        else {
            return "Not Allowed";
        }
    }

    public void setPassword(String password, boolean isAuth) {
        if(isAuth) {
            this.password = password;
        }
        else {
            System.out.println("Not Allowed");
        }

    }

}
