package CoreJavaTopics.java8_features.jf04_predicateinterfaces.p01_test_method;

import java.util.Scanner;
import java.util.function.Predicate;

public class P01_test_method {
    public static void main(String[] args) {
        // Create predicate fucntion
        Predicate <Integer> isNumberOddOrEven = (n) -> n%2==0 ;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number ==> ");
        Integer number  = sc.nextInt();

        // Call predicate functions
        System.out.println(isNumberOddOrEven.test(number)==true?"Even Number":"Odd Number");

        sc.close();

    }
    
}
