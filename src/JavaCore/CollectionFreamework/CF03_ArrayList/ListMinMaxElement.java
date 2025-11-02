package JavaCore.CollectionFreamework.CF03_ArrayList;

/*

Find the Maximum Element in a List
    Write a program to find the maximum element in a List of integers without using any built-in methods.
    Example Input: [10, 20, 30, 5, 15]
    Example Output: 30

 */

import java.util.ArrayList;
import java.util.List;

public class ListMinMaxElement {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList();
        list.add(3);
        list.add(2);
        list.add(8);
        list.add(7);
        list.add(2);
        list.add(9);
        list.add(5);

        Integer minValue=list.getFirst();
        Integer maxValue=list.getFirst();

        for (Integer i : list){
            if (i>maxValue)
                maxValue=i;
            if (i<minValue)
                minValue=i;
        }

        System.out.println("Min Value ==> "+minValue);
        System.out.println("Max Value ==> "+maxValue);
    }
}
