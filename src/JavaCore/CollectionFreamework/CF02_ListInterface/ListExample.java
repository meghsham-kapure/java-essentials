package JavaCore.CollectionFreamework.CF02_ListInterface;

import java.util.*;

public class ListExample {
    public static void main(String[] args) {
        // List interface common methods
        List<String> list = new ArrayList<>();
        
        // Adding elements
        list.add("Apple");
        list.add("Banana");
        list.add(1, "Mango"); // Insert at specific position
        
        // Accessing elements
        System.out.println("Element at index 0: " + list.get(0));
        System.out.println("Index of Banana: " + list.indexOf("Banana"));
        
        // List specific operations
        List<String> subList = list.subList(0, 2);
        System.out.println("Sublist: " + subList);
        
        // ListIterator
        ListIterator<String> iterator = list.listIterator();
        while(iterator.hasNext()) {
            System.out.println("List element: " + iterator.next());
        }
    }
}
