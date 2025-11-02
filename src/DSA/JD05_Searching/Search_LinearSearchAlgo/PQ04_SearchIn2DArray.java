package DSA.JD05_Searching.Search_LinearSearchAlgo;

import java.util.Arrays;

public class PQ04_SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1, 5}, {7, 6, 2, 4}, {}, {3, 9, 8}};
        int searchValue = 3;

        int[] searchIndex = findIn2DArray(arr, searchValue);

        if (Arrays.equals(searchIndex, new int[]{-1, -1})) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at Arr[" + searchIndex[0] + "][" + searchIndex[1] + "]");
        }

    }

    public static int[] findIn2DArray(int arr[][], int searchValue) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
                if (arr[i][j] == searchValue) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
