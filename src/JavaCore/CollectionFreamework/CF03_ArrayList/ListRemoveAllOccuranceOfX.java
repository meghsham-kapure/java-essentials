package JavaCore.CollectionFreamework.CF03_ArrayList;

/*
Remove All Occurrences of a Specific Element
    Write a program to remove all occurrences of a specific element from a List.
    Example Input:
    List = [1, 2, 3, 2, 4, 2],
    Element to remove: 2
    Example Output: [1, 3, 4]
*/

import java.util.ArrayList;
import java.util.List;

public class ListRemoveAllOccuranceOfX {
    public static void main(String[] args) {
        List<Integer> list  = new ArrayList<>();

        list.add(5);
        list.add(8);
        list.add(2);
        list.add(5);
        list.add(6);
        list.add(8);
        list.add(2);

        System.out.println(list);

        while (list.contains(Integer.valueOf(5)))
            list.remove(Integer.valueOf(5));

        System.out.println(list);
    }
}
