package MAY.ex_28052024_Array_List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab237 {
    public static void main(String[] args) {


        // API Endpoints
        // Pages - LoginPage, Dashboard, HomePage
        List url_pages = new ArrayList();
        url_pages.add("LoginPage");
        url_pages.add("Dashboard");
        url_pages.add("HomePage");
        System.out.println(url_pages);
        System.out.println("----");

        for (int i = 0; i < url_pages.size(); i++) {
            System.out.println(url_pages.get(i));
        }

        System.out.println("----");
        for (Object page : url_pages) {
            System.out.println(page);
        }

        System.out.println("----");

        Iterator itr = url_pages.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
