package JavaCore.CollectionFreamework.CF06_SetInterface;

import java.util.*;

public class SetExample {
    public static void main(String[] args) {
        // Set interface - no duplicates, no order guarantee
        Set<String> set = new HashSet<>();
        
        // Adding elements
        set.add("Apple");
        set.add("Banana");
        set.add("Apple"); // Duplicate - won't be added
        
        System.out.println("Set: " + set);
        System.out.println("Size: " + set.size());
        System.out.println("Contains Apple: " + set.contains("Apple"));
        
        // Set operations
        Set<String> otherSet = new HashSet<>(Arrays.asList("Banana", "Cherry"));
        set.retainAll(otherSet); // Intersection
        System.out.println("After intersection: " + set);
    }
}
