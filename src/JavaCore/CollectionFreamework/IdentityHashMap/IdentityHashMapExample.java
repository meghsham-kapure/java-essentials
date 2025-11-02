package JavaCore.CollectionFreamework.IdentityHashMap;

import java.util.Map;
import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapExample {

    public static void main(String[] args) {
        
        String key1 = new String ("Key");
        String key2 = new String ("Key");

        createHashMap(key1,key2);
        
        createIdentityHashMap(key1,key2);

    }

    public static void createHashMap(String key1, String key2){
        
        Map <String, Integer>map1 =new HashMap<>();
    
        map1.put(key1, 10);
        map1.put(key2, 20);

        System.out.println(map1);
    }

    public static void createIdentityHashMap(String key1, String key2){
        Map <String, Integer>map2 =new IdentityHashMap<>();
    
        map2.put(key1, 10);
        map2.put(key2, 20);

        System.out.println(map2);
    }
}