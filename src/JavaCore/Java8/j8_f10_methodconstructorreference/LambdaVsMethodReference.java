package CoreJavaTopics.java8_features.jf10_methodconstructorreference;

import java.util.*;

public class LambdaVsMethodReference {
    public static void main(String[] args) {
        List<String> messages = Arrays.asList("hello", "world", "java", "8");
        
        System.out.println("=== LAMBDA EXPRESSION ===");
        messages.forEach(s -> System.out.println(s));
        
        System.out.println("\n=== METHOD REFERENCE ===");
        messages.forEach(System.out::println);
        
        System.out.println("\n=== LAMBDA vs METHOD REFERENCE COMPARISON ===");
        
        // Example 1: Static method
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        
        // Lambda
        numbers.stream()
               .map(n -> Math.sqrt(n))
               .forEach(r -> System.out.println("Lambda sqrt: " + r));
        
        // Method reference
        numbers.stream()
               .map(Math::sqrt)
               .forEach(r -> System.out.println("Method ref sqrt: " + r));
        
        // Example 2: Instance method
        List<String> words = Arrays.asList("Hello", "World");
        
        // Lambda
        words.stream()
             .map(s -> s.toLowerCase())
             .forEach(s -> System.out.println("Lambda lower: " + s));
        
        // Method reference
        words.stream()
             .map(String::toLowerCase)
             .forEach(s -> System.out.println("Method ref lower: " + s));
    }
}
