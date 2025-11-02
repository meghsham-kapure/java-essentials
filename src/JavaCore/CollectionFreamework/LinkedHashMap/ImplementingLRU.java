package CoreJavaTopics.collectionfreamework.LinkedHashMap;

import java.util.*;

class LRUCache<K,V> extends LinkedHashMap <K,V>{

    private int capacity ;

    LRUCache (int capacity){
        super(capacity,0.75f,true);
        this.capacity=capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K,V> m){
        return size()>capacity;
    }
} 

public class ImplementingLRU {
    
   public static void displayMap(LRUCache<Integer, String> studentCatch) {
    for (Map.Entry<Integer, String> entry : studentCatch.entrySet()) {
        System.out.println(entry.getKey() + ":" + entry.getValue());
    }

    System.out.println("============================================");
}

    public static void main(String[] args) {
        LRUCache<Integer, String> studentCatch = new LRUCache<>(5);

        studentCatch.put(1, "Gagan");
        studentCatch.put(2, "Tarun");
        studentCatch.put(3, "Uttam");
        studentCatch.put(4, "Laxman");
        studentCatch.put(5, "Padma");

        displayMap(studentCatch);
      
        studentCatch.put(8, "Sharrukh");

        displayMap(studentCatch);
      
        studentCatch.put(7, "Farukh");

        displayMap(studentCatch);

    }    
}
