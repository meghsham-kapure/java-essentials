package DSA.JD04_Arrays.UnderstandingArrays;

import java.util.Arrays;

public class HalfArraySorter {
    public static void main(String[] args) {
        int arr [] = {1,4,7,8,2,5,3,6,9};

        System.out.println("before sort " + Arrays.toString(arr));

        Arrays.sort(arr, 0, arr.length/2);

        System.out.println("after sort " +Arrays.toString(arr));
    }
}
