package CoreJavaTopics.java8_features.jf08_biinterfaces.p01_bipredicate;

import java.util.function.BiPredicate;

public class P01_BiPredicate {
    public static void main(String[] args) {
        

        BiPredicate <String, String> stringsNotEmpty = (str1,str2)->
            str1.length() != 0 && str2.length() != 0;

        String string_1 = "Meghsham";
        String string_2 = "Kapure";
        String string_3 = "";


        System.out.println(stringsNotEmpty.test(string_1, string_2)); // true
        System.out.println(stringsNotEmpty.test(string_1, string_3)); // false


    }
    
}
