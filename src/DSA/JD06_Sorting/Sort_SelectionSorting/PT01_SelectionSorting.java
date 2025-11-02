package DSA.JD06_Sorting.Sort_SelectionSorting;

import java.util.Arrays;

public class PT01_SelectionSorting {
    public static void main(String[] args) {

        int[] arr = new int[]{4, 2, 9, 1, 7, 3, 6};
        int[] sortedArrayAsc = selectionSortingAscending(Arrays.copyOf(arr, arr.length));
        int[] sortedArrayDsc = selectionSortingDescending(Arrays.copyOf(arr, arr.length));

        System.out.println("Original Array non-sorted  is " + Arrays.toString(arr));
        System.out.println("Array sorted in ascending order by selection sort is " + Arrays.toString(sortedArrayAsc));
        System.out.println("Array sorted in descending order by selection sort is " + Arrays.toString(sortedArrayDsc));
    }

    public static int[] selectionSortingAscending(int[] arr) {
        System.out.println("i=>" + -1 + "\t" + Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            int max = 0;
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[max]) {
                    max = j;
                }
            }
            swapElements(arr, max, arr.length - 1 - i);
            System.out.println("i=>" + i + "\t" + Arrays.toString(arr));
        }

        return arr;
    }

    public static int[] selectionSortingDescending(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int max = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] > arr[max]) {
                    max = j;
                }
                swapElements(arr, max, i);
            }
        }
        return arr;
    }

    public static int[] swapElements(int[] arr, int indexOne, int indexTwo) {
        int temp = arr[indexOne];
        arr[indexOne] = arr[indexTwo];
        arr[indexTwo] = temp;
        return arr;
    }
}