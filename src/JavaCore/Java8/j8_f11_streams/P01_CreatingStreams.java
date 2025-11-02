package CoreJavaTopics.java8_features.jf11_streams;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class P01_CreatingStreams {
    public static void main(String[] args) {
    
        // Creating Stream from List
        List <String> avengerNameList = Arrays.asList("Tony","Cris","Bruce","Natasha","Clint");
        Stream <String> avengerNameStream = avengerNameList.stream();
        List <String> avengerNameList2 = avengerNameStream.collect(Collectors.toList());
    
        // Creating Strem froma Set
        Set <Integer> numberSet = Set.of(1,2,3,4,5,6,7);
        Stream <Integer> numberStream = numberSet.stream();
        List <String> numberSet2 = avengerNameStream.collect(Collectors.toList());
        

        //Creating Stream from Array
        String cars [] = {"Bugati", "Ferrari", "Lamborgini"};
        Stream <String> carsStream = Arrays.stream(cars)
        
        ;

    }
}