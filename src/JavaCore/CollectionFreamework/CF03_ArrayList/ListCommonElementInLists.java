package JavaCore.CollectionFreamework.CF03_ArrayList;

/*

Find Common Elements Between Two Lists
    Write a program to find all common elements between two Lists of integers.
    Example Input:
    List1 = [1, 2, 3, 4]
    List2 = [3, 4, 5, 6]
    Example Output: [3, 4]

 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListCommonElementInLists {
    public static void main(String[] args) {
        List <Integer> listOne = Arrays.asList(1,2,3, 5,3,4,5);
        List <Integer> listTwo = Arrays.asList(0,3,4,5,7,8,9,5);
        List <Integer> copyList = new ArrayList<>();
        System.out.print("Common elements are : ");
        for (Integer i : listOne){
                if (listTwo.contains(i) && !copyList.contains(i)){
                    copyList.add(i);
                }
        }
        System.out.println(copyList);
    }
}
