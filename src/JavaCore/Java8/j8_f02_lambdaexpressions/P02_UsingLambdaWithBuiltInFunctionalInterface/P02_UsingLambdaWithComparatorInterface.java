package CoreJavaTopics.java8_features.jf02_lambdaexpressions.p02_usinglambdawithbuiltinfunctionalinterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class P02_UsingLambdaWithComparatorInterface {
    public static void main(String[] args) {
        List<Integer> numberAL = new ArrayList<>(Arrays.asList(42, 91, 73, 28, 99, 76));

        System.out.println("Number List before Sorting: " + numberAL);

        // For custom sorting, the Collections.sort() method can take a Comparator,
        // which provides the comparison logic through its compare method.

        Comparator<Integer> comparatorAscendingSort = (num1, num2) -> num1 - num2;

        // Ascending Sort
        Collections.sort(numberAL, comparatorAscendingSort);
        System.out.println("Number List after Ascending sorting: " + numberAL);

        // Descending Sort
        Collections.sort(numberAL, (num1, num2) -> num2 - num1);
        System.out.println("Number List after Descending sorting: " + numberAL);
    }
}
