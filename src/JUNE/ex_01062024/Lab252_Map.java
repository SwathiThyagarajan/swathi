package JUNE.ex_01062024;

import java.util.HashMap;
import java.util.Map;

public class Lab252_Map {
    public static void main(String[] args) {

        // Map - key value pair, it is an interface
        // name - pramod, age - 65, roll - 1, course -atb all of them are key value pair
        // keys are always unique, duplicate keys not allowed
        // o HashMap
        //o LinkedHashMap
        //o TreeMap
        //o Hashtable
        // These 4 complete the Map
        // API Testing - JSON - JavaScript Object Notation - Map
        // JSON - key value pair
        // HashSet and HastMap

        Map<String, Object> studentMap = new HashMap<>();
 //       studentMap.put("firstname", "Pramod");
        studentMap.put("firstname", "Amit"); // insted of add we have put function
        studentMap.put("age", 65);
        studentMap.put("roll", 1);
        studentMap.put("course", "ATB");
        studentMap.put("lastname", "Dutta");
        studentMap.put("isMale", true);
        System.out.println(studentMap);
        System.out.println(studentMap.get("firstname"));
        System.out.println(studentMap.get("age"));
        System.out.println(studentMap.isEmpty());
        System.out.println(studentMap.containsKey("age"));
        System.out.println(studentMap.containsValue(65));
        System.out.println(studentMap.keySet());
        System.out.println(studentMap.values());
        System.out.println("-------");

        for(Map.Entry<String,Object> item: studentMap.entrySet()){ // this is from fn
            System.out.println(item.getKey() + " : " + item.getValue());
        }




    }
}
