package MAY.ex_25052024;

public class Lab216 {
    public static void main(String[] args) {

        // In API Automation how enum is used
        // we create a different class enum


        PAGES e = PAGES.LOGIN;
        switch (e){
            case LOGIN -> System.out.println("Login Page code should be executed");
            case DASHBOARD -> System.out.println("Dashboard Page code should be executed");

        }

    }



}
