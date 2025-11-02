package CoreJavaTopics.java8_features.jf10_methodconstructorreference;

import java.util.*;
import java.util.function.*;

class Product {
    private String name;
    private double price;
    
    // Default constructor
    public Product() {
        this.name = "Unknown";
        this.price = 0.0;
    }
    
    // Parameterized constructor
    public Product(String name) {
        this.name = name;
        this.price = 0.0;
    }
    
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    @Override
    public String toString() {
        return name + ": $" + price;
    }
}

public class ConstructorReference {
    public static void main(String[] args) {
        System.out.println("=== CONSTRUCTOR REFERENCES ===");
        
        // 1. Default constructor reference
        Supplier<Product> productSupplier = Product::new;
        Product p1 = productSupplier.get();
        System.out.println("Default constructor: " + p1);
        
        // 2. Single parameter constructor reference
        Function<String, Product> nameToProduct = Product::new;
        Product p2 = nameToProduct.apply("Laptop");
        System.out.println("Single param constructor: " + p2);
        
        // 3. Two parameter constructor reference
        BiFunction<String, Double, Product> fullProductCreator = Product::new;
        Product p3 = fullProductCreator.apply("Phone", 599.99);
        System.out.println("Two param constructor: " + p3);
        
        // 4. Constructor reference in streams
        List<String> productNames = Arrays.asList("Mouse", "Keyboard", "Monitor");
        List<Product> products = productNames.stream()
                                           .map(Product::new)
                                           .toList();
        System.out.println("Products from stream: " + products);
        
        // 5. Array constructor reference
        IntFunction<int[]> arrayCreator = int[]::new;
        int[] numbers = arrayCreator.apply(5);
        System.out.println("Array length: " + numbers.length);
    }
}
