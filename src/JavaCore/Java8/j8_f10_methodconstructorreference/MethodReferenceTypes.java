package CoreJavaTopics.java8_features.jf10_methodconstructorreference;

import java.util.*;

class Person {
    private String name;
    private int age;
    
    public Person(String name) {
        this.name = name;
        this.age = 0;
    }
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // Static method
    public static boolean isAdult(Person p) {
        return p.age >= 18;
    }
    
    // Instance method
    public String getName() {
        return name;
    }
    
    // Instance method with parameter
    public int compareByName(Person other) {
        return this.name.compareTo(other.name);
    }
    
    @Override
    public String toString() {
        return name + "(" + age + ")";
    }
}

public class MethodReferenceTypes {
    
    // Static method for method reference
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
    
    // Static method for string processing
    public static String toUpperCase(String str) {
        return str.toUpperCase();
    }

    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jane", "Jack", "Doe");
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Person> people = Arrays.asList(
            new Person("John", 25),
            new Person("Jane", 17),
            new Person("Bob", 30),
            new Person("Alice", 16)
        );

        System.out.println("=== 1. REFERENCE TO STATIC METHOD ===");
        // ClassName::staticMethodName
        numbers.stream()
               .filter(MethodReferenceTypes::isEven)
               .forEach(System.out::println);

        System.out.println("\n=== 2. REFERENCE TO INSTANCE METHOD OF PARTICULAR OBJECT ===");
        // object::instanceMethodName
        MethodReferenceTypes example = new MethodReferenceTypes();
        names.stream()
             .map(String::toUpperCase)  // This is actually type 3, but often confused
             .forEach(System.out::println);

        System.out.println("\n=== 3. REFERENCE TO INSTANCE METHOD OF ARBITRARY OBJECT ===");
        // ClassName::instanceMethodName
        names.stream()
             .map(String::toUpperCase)
             .forEach(System.out::println);

        System.out.println("\n=== 4. REFERENCE TO CONSTRUCTOR ===");
        // ClassName::new
        List<String> nameList = Arrays.asList("John", "Jane", "Bob");
        List<Person> personList = nameList.stream()
                                         .map(Person::new)
                                         .toList();
        personList.forEach(System.out::println);

        System.out.println("\n=== 5. COMPARATOR WITH METHOD REFERENCE ===");
        people.stream()
              .sorted(Comparator.comparing(Person::getName))
              .forEach(System.out::println);

        System.out.println("\n=== 6. PREDICATE WITH METHOD REFERENCE ===");
        people.stream()
              .filter(Person::isAdult)
              .forEach(System.out::println);
    }
}
