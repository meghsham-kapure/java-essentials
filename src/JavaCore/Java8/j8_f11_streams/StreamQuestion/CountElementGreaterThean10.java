package CoreJavaTopics.java8_features.jf11_streams.StreamQuestion;

import java.util.Arrays;
import java.util.List;

public class CountElementGreaterThean10 {
    public static void main(String[] args) {
        List <Integer> numberList = Arrays.asList(5, 12, 8, 20, 3, 15);
        long count = numberList.stream()
        .filter(n -> n >10).count();      
    System.out.println("Count of Nuber Stream with element greater than 10 is : "+count);

    }
}
