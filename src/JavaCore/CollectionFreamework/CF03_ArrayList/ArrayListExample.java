package JavaCore.CollectionFreamework.CF03_ArrayList;

import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        // Creating ArrayList
        ArrayList<String> list = new ArrayList<>();
        
        // Adding elements
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        
        // Accessing elements
        System.out.println("First element: " + list.get(0));
        
        // Iterating
        for(String fruit : list) {
            System.out.println(fruit);
        }
        
        // Common methods
        System.out.println("Size: " + list.size());
        System.out.println("Contains Apple: " + list.contains("Apple"));
        list.remove("Banana");
        System.out.println("After removal: " + list);
    }
}
