package CoreJavaTopics.java8_features.jf09_unaryoperator.p02_binaryoperator;

import java.util.function.BinaryOperator;

public class P02_BinaryOperator {
    public static void main(String[] args) {
        BinaryOperator <String> concatinateStrings = (str1, str2) -> {
            return str1 + str2;
        };
    

        String str1 ="alexandra";
        String str2 ="daddario";
        
        System.out.println("Concatenation of "+str1+" and "+str2+" is "+concatinateStrings.apply(str1, str2));

    }
    
}
