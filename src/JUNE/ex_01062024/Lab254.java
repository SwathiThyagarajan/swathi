package JUNE.ex_01062024;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Lab254 {
    public static void main(String[] args) {

        // Storing information of student 1
        Map<String, String> map = new HashMap();
        map.put("firstName", "pramod");
        map.put("lastName", "pawar");
        map.put("email", "dasda@addad.omc");
        map.put("phone", "1234567890");
        map.put("city", "Pune");
        map.put("state", "MH");
        map.put("country", "India");
        map.put("zip", "411057");
//        System.out.println(map);

        // Storing information of student 2
        Map<String, String> map2 = new HashMap();
        map2.put("firstName", "Amit");
        map2.put("lastName", "pawar");
        map2.put("email", "dasda@addad.omc");
        map2.put("phone", "1234567890");
        map2.put("city", "Pune");
        map2.put("state", "MH");
        map2.put("country", "India");
        map2.put("zip", "411057");
//        System.out.println(map2);

        // List of Map
        ArrayList list = new ArrayList();
        list.add(map);
        list.add(map2);
        System.out.println(list);// Print the entire list
        System.out.println(list.get(0)); // Print the first element in the list (map)
        System.out.println(list.get(1));// Print the second element in the list (map2)
    }
}
