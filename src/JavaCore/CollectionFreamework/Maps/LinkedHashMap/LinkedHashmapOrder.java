package JavaCore.CollectionFreamework.Maps.LinkedHashMap;

import java.util.LinkedHashMap;

public class LinkedHashmapOrder {
    public static void main(String[] args) {
        //INSERTION ORDER
        LinkedHashMap <String, Integer> playerLinkedHashMap1 = new LinkedHashMap<>(10,0.6f,false);
        playerLinkedHashMap1.put("Sachin", 100);
        playerLinkedHashMap1.put("Virat", 100);
        playerLinkedHashMap1.put("Sehvag", 100);
        playerLinkedHashMap1.put("Pandya", 100);
        playerLinkedHashMap1.put("Rohit", 100);
        playerLinkedHashMap1.put("Shikhar", 100);
        playerLinkedHashMap1.put("Sehvag", 1000);

        System.out.println(playerLinkedHashMap1);

        //INSERTION ORDER
        LinkedHashMap <String, Integer> playerLinkedHashMap2 = new LinkedHashMap<>(10,0.6f,true);
        playerLinkedHashMap2.put("Sachin", 100);
        playerLinkedHashMap2.put("Virat", 100);
        playerLinkedHashMap2.put("Sehvag", 100);
        playerLinkedHashMap2.put("Pandya", 100);
        playerLinkedHashMap2.put("Rohit", 100);
        playerLinkedHashMap2.put("Shikhar", 100);
        playerLinkedHashMap2.put("Sehvag", 100);

        System.out.println(playerLinkedHashMap2);




    }
}
