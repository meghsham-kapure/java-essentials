package CoreJavaTopics.java8_features.jf12_optionalclass;

import java.util.Optional;

public class P01_CreatingOptionalValues {

    public static void main(String[] args) {
        String myName = "Shahrukh";
        Optional<String> name = Optional.ofNullable(myName);
    
        if (name.isPresent()){
            System.out.println("Name :"+name.get());
        }else{
            System.out.println("Name : E404");
        }   

    }
}