package CoreJavaTopics.java8_features.jf08_biinterfaces.p02_bifunctions;

import java.util.function.BiFunction;

public class P02_BiFunctions {
    public static void main(String[] args) {
        BiFunction <String, String, Integer> combinedLengthCalculator = (string_1, string_2) ->{
            return string_1.length()+string_2.length();
        };

        String str_1 = "Meghsham";
        String str_2 = "Kapure";

        System.out.println("Combined length of " + str_1 + " and " + str_2);
        System.out.println(combinedLengthCalculator.apply("Meghsham", "Kapure"));
    }
}
