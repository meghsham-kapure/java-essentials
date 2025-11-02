package DSA.JD06_Sorting.Sort_InsertionSorting;

import java.util.Arrays;

public class Sort_InsertionSorting {
    public static void main(String args[]) {
        int arr[] = {1, 6, 2, 8, 5};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.println(arr[i] + " < " + arr[j] + "=" + (arr[i] < arr[j]));
                if (arr[j] > arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}

