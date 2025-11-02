package JavaCore.CollectionFreamework.CF03_ArrayList;

/*

Merge and Sort Two Lists,
    Write a program to merge two Lists and sort the resulting List in ascending order.
    Example Input:
    List1 = [4, 1, 7]
    List2 = [5, 3, 2]
    Example Output: [1, 2, 3, 4, 5, 7]

*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListMergeAndSort {
    public static void main(String[] args) {

        List  listMerger =  new ArrayList();
        listMerger.addAll( Arrays.asList(3,2,8,3));
        listMerger.addAll(Arrays.asList(7,2,9,4,5));
        Collections.sort(listMerger);
        System.out.println(listMerger);
    }
}
