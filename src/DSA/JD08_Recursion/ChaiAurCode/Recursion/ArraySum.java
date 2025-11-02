package DSA.JD08_Recursion.ChaiAurCode.Recursion;

import java.util.Arrays;

public class ArraySum {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        int sum = sumOfArray(0,arr);
        System.out.println(sum);
    }

    public static int sumOfArray(int sum, int[] arr) {
        if (arr.length == 0) {
            return sum;
        } else {
            sum += arr[0];
            return sumOfArray(sum,Arrays.copyOfRange(arr, 1, arr.length) );
        }
    }
}
