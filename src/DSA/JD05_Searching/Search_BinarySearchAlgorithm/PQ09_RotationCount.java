package DSA.JD05_Searching.Search_BinarySearchAlgorithm;
import java.util.Arrays;

public class PQ09_RotationCount {
    public static void main(String[] args) {
        int[] inputArr = {1, 2, 3, 4, 5, 6, 7, 8};
        int peak = new SolutionRotationCount().findPeak(inputArr);
        System.out.println("Peak of " + Arrays.toString(inputArr) + " is " + (peak));
        System.out.println("Rotational Count of " + Arrays.toString(inputArr) + " is " + ((peak + 1) % inputArr.length));

    }
}

class SolutionRotationCount {
    int findPeak(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[0] <= arr[mid])
                start = mid + 1;
            else
                end = mid - 1;
        }
        return end;
    }
}
