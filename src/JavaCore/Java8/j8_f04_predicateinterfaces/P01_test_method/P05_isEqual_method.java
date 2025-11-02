package CoreJavaTopics.java8_features.jf04_predicateinterfaces.p01_test_method;

import java.util.function.Predicate;

public class P05_isEqual_method {
    public static void main(String[] args) {
        String str1= "Meghsham";
        String str2= "Megh$ham";
        String str3= "MEGHSHAM";

        Predicate <String> isStringMathing = Predicate.isEqual(str1.toLowerCase());
        System.out.println(isStringMathing.test(str2.toLowerCase())? "Matching" : "Not Maching"); 
        System.out.println(isStringMathing.test(str3.toLowerCase())? "Matching" : "Not Maching"); 
    }
}
