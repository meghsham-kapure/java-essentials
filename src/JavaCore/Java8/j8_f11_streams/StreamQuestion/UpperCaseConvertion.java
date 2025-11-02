package CoreJavaTopics.java8_features.jf11_streams.StreamQuestion;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UpperCaseConvertion {
    public static void main(String[] args) {
        List<String> boys = Arrays.asList("Ram", "Sham", "Sunil", "Anil");
        List<String> UppercaseNames = boys.stream()
                .map(x -> x.toUpperCase())
                .collect(Collectors.toList());

        for (String name : UppercaseNames) {
            System.out.println(name);
        }
    }
}