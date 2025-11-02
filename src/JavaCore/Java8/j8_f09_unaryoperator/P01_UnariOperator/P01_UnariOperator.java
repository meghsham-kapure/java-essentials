package CoreJavaTopics.java8_features.jf09_unaryoperator.p01_unarioperator;

import java.util.function.UnaryOperator;

public class P01_UnariOperator {
    public static void main(String[] args) {
        
        UnaryOperator <Integer> doubleIt = num -> num * 2;
        System.out.println(doubleIt.apply(10));

        UnaryOperator <String> trimString = str -> str.trim();
        System.out.println(trimString.apply("Meghsham Kapure   "));
    }
    
}
