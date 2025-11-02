package CoreJavaTopics.java8_features.jf08_biinterfaces.p03_biconsumer;

import java.util.function.BiConsumer;

public class P03_BiConsumer {
    public static void main(String[] args) {
        
        BiConsumer <String, String> stringCombinator = (string_1, string_2) ->{
            System.out.println( string_1+string_2 );
        };

        String str_1 = "Meghsham";
        String str_2 = "Kapure";


       
        stringCombinator.accept(str_1, str_2);

    }
    
}
