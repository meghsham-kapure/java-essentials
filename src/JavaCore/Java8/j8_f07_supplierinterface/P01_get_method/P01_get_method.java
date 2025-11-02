package CoreJavaTopics.java8_features.jf07_supplierinterface.p01_get_method;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class P01_get_method {
    public static void main(String[] args) {

        Supplier <String> getUrl = () -> "www.google.com";
        System.out.println("Website url : " + getUrl.get());

        Supplier <List <String> > getBankList = () -> {
            return new ArrayList<>(Arrays.asList("Bank of India","Bank of Maharastra","Bank of Canada", "Bank of UK"));
        };

        List <String> banksList =getBankList.get();

        System.out.println(banksList);
    }    
}
