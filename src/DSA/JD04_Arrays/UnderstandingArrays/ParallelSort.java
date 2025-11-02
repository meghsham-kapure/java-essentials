package DSA.JD04_Arrays.UnderstandingArrays;

import java.util.Arrays;

public class ParallelSort {
    public static void main(String[] args) {
//        int arr [] = {1,4,7,8,2,5,3,6,9};
//
//        System.out.println("before sort " + Arrays.toString(arr));
//
//        Arrays.parallelSort(arr);
//
//        System.out.println("after sort " +Arrays.toString(arr));

        int arr1 [] = {1,4,7,8,2,5,7,3,6,9,7};
        int arr2 [] = {1,4,2,5,3,6,9};

//        System.out.println(Arrays.mismatch(arr1, arr2));

        System.out.println(Arrays.binarySearch(arr1,0, arr1.length-1, 7));;

        String str[] = {"lkj"};
        System.out.println(str[0].length());;


    }
}
