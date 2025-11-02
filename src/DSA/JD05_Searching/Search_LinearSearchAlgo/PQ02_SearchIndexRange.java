package DSA.JD05_Searching.Search_LinearSearchAlgo;

import java.util.Arrays;

public class PQ02_SearchIndexRange {

    public static void main(String[] args) {
        int arr[] = new int[]{16, 42, 7, 19, 84, 96, 83, 78, 45, 33, 72};
        int searchValue = 96;
        int startIndex = 5;
        int endIndex = 10;
        int targetIndex = findTarget(arr, searchValue, startIndex, endIndex);

        System.out.println(
                targetIndex != -1 ?
                        "In array \"" + Arrays.toString(arr) + "\" searchValue '" + searchValue + "' is at index " + targetIndex :
                        "In array \"" + Arrays.toString(arr) + "\" searchValue '" + searchValue + "' is not found ");
    }

    public static int findTarget(int[] arr, int searchValue, int startIndex, int endIndex) {
        for (int i = startIndex; i <= endIndex; i++) {
            if (arr[i] == searchValue) {
                return i;
            }
        }
        return -1;
    }
}
