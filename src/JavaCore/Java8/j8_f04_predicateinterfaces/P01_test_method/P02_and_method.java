package CoreJavaTopics.java8_features.jf04_predicateinterfaces.p01_test_method;

import java.util.Scanner;
import java.util.function.Predicate;

public class P02_and_method {
    public static void main(String[] args) {
     
      Predicate <Integer> isDivideBy2 = (n) -> n%2==0 ;
      Predicate <Integer> isDivideBy3 = (n) -> n%3==0 ;

      Predicate<Integer> isDivideBy2and3 = isDivideBy2.and(isDivideBy3);

      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the number ==> ");
      Integer number  = sc.nextInt();

      System.out.println("The number is divided by 2 and 3 : " + isDivideBy2and3.test(number));

      sc.close();

    }
}
