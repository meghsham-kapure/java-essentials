package CoreJavaTopics.java8_features.jf14_collectors;

import java.util.*;
import java.util.stream.*;

public class CollectorsExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jane", "Jack", "Doe");
        
        // Collect to List
        List<String> resultList = names.stream()
            .filter(name -> name.startsWith("J"))
            .collect(Collectors.toList());
        
        // Collect to Set
        Set<String> resultSet = names.stream()
            .collect(Collectors.toSet());
            
        // Collect to Map
        Map<String, Integer> nameLengthMap = names.stream()
            .collect(Collectors.toMap(
                name -> name,
                name -> name.length()
            ));
        
        // Joining
        String joined = names.stream()
            .collect(Collectors.joining(", "));
            
        System.out.println("List: " + resultList);
        System.out.println("Set: " + resultSet);
        System.out.println("Map: " + nameLengthMap);
        System.out.println("Joined: " + joined);
    }
}
