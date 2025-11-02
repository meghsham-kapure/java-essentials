package DSA.JD05_Searching.Search_LinearSearchAlgo;

import java.util.Arrays;

public class PQ03_MinMaxNumber {
    public static void main(String[] args) {
        int arr[] = new int[]{16, 42, 7000, 19, 84, 96, 83, 78, 45, 0, 33, 72};

        if (arr.length != 0) {
            int[] numMinMax = findMinMax(arr);
            System.out.println("In Array " + Arrays.toString(arr) +
                    "\n\tMinimum Number " + numMinMax[0] + "\n\tMaximum Number " + numMinMax[1]);
        } else {
            System.out.println("Empty array is given");
        }
    }

    public static int[] findMinMax(int[] arr) {

        int min = arr[0];
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
            if (arr[i] < min)
                min = arr[i];
        }
        return new int[]{min, max};
    }
}
