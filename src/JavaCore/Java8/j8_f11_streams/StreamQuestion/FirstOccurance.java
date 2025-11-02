package CoreJavaTopics.java8_features.jf11_streams.StreamQuestion;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FirstOccurance {
    public static void main(String[] args) {
        List <String> names = 
            Arrays.asList("Ram", "Shyam", "Radha", "Sita", "Ravi");
        Optional <String>firstNameStraingWithS = names.stream().filter(str-> str.charAt(0)=='S').findFirst();
        System.out.println(firstNameStraingWithS);
    }
}
