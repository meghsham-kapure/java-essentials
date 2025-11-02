package JavaCore.CollectionFreamework.CF02_ListInterface;

import java.util.*;

public class CollectionHierarchy {
    public static void main(String[] args) {
        // Collection Interface - root interface
        Collection<String> collection = new ArrayList<>();
        
        // List Interface - ordered collection
        List<String> list = new ArrayList<>();
        
        // Set Interface - no duplicates
        Set<String> set = new HashSet<>();
        
        // Queue Interface - FIFO
        Queue<String> queue = new LinkedList<>();
        
        // Map Interface - key-value pairs (not part of Collection hierarchy)
        Map<String, Integer> map = new HashMap<>();
        
        System.out.println("Collection Framework Hierarchy:");
        System.out.println("1. Collection Interface");
        System.out.println("   ↳ List Interface");
        System.out.println("   ↳ Set Interface"); 
        System.out.println("   ↳ Queue Interface");
        System.out.println("2. Map Interface (Separate)");
    }
}
