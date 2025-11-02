package JavaCore.CollectionFreamework.CF03_ArrayList;

/*
1. Reverse a List
    Write a program to reverse a List of integers without using built-in reverse methods.
    Example Input: [1, 2, 3, 4, 5]
    Example Output: [5, 4, 3, 2, 1]
*/

import java.util.ArrayList;
import java.util.Arrays;

public class ListCustomReversal {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
        System.out.println("Original List : "+number);
        for(int i=0; i<number.size()/2;i++){
            Integer temp = number.get(i);
            number.set(i, number.get(number.size()-1-i));
            number.set(number.size()-1-i, temp);
        }
        System.out.println("List after reversal: "+number);
    }
}
