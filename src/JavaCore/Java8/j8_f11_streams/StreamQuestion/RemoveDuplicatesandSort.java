package CoreJavaTopics.java8_features.jf11_streams.StreamQuestion;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesandSort {
    public static void main(String[] args) {
        List <Integer> numberList = Arrays.asList(4, 1, 2, 2, 3, 1, 4);
        List <Integer> noDupsSorted = numberList.stream().sorted().distinct().collect(Collectors.toList());
        System.out.println("After Duplicate Removal and Sorting : "+noDupsSorted);
    } 
}
