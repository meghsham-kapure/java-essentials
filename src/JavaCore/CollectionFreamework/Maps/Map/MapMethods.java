package JavaCore.CollectionFreamework.Maps.Map;

import java.util.*;

public class MapMethods {
    public static void main(String[] args) {
        //Map is interface, so implemented in hashmap

        Map<Integer, String> studentDetails  = new HashMap<>();

        System.out.println(studentDetails.put(1, "John"));//null
        System.out.println(studentDetails.put(2, "Tony"));//null
        System.out.println(studentDetails.put(3, "Adam"));//null
        System.out.println(studentDetails.put(3, "Peter"));//Adam
        //put method used to add and update the entry
        //if key is not available then new entry is added with given key and value
        //if the key is present then value with associated key is updated and old value is returned

        String value1 =  studentDetails.get(2);
        System.out.println(value1);//Tony
        String value2 =  studentDetails.get(4);
        System.out.println(value2);//null
        //get method take the key and return value if key is present, if key not present the returns null


        System.out.println(studentDetails.remove(3));//Peter
        System.out.println(studentDetails.remove(3));//null
        // remove method removes the entry associate with given key and returns the value, if key is not found the null
        System.out.println(studentDetails);



        System.out.println(studentDetails.containsKey(1));
        System.out.println(studentDetails.containsKey(5));
        //if key is found in map the true otherwise false

        System.out.println(studentDetails.containsValue("Tony"));
        System.out.println(studentDetails.containsValue("Adam"));
        //if value is found in map the true otherwise false


        studentDetails.put(3, "Rony");
        studentDetails.put(4, "Anthony");
        System.out.println(studentDetails.size());
        // returns the number of entries in map

        System.out.println(studentDetails.isEmpty());
        // false is map is not empty

        studentDetails.clear();
        // without returning anything clears all entries in map

        System.out.println(studentDetails.isEmpty());
        // true is map is empty



        Map emptyMap = new HashMap();
        Map mapOne = new HashMap();

        mapOne.put (1,"Sham");
        mapOne.put (2,"Radha");
        mapOne.put (3,"Ram");
        mapOne.put (4,"Sita");

        emptyMap.putAll(mapOne);

        System.out.println(emptyMap);

        Set mapOneKeys = mapOne.keySet();
        System.out.println(mapOneKeys);

        Collection mapOneValues = mapOne.values();
        System.out.println(mapOneValues);

        Set mapOneEntries = mapOne.entrySet();
        System.out.println(mapOneEntries);

    }
}
