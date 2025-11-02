package DSA.JD05_Searching.Search_BinarySearchAlgorithm;

import java.util.Arrays;

public class PQ10_SplitArrayLargestSum {
    public static void main(String[] args) {
        int[] inputArray = new int[]{1, 2, 3, 4, 5};
        int result = new Solution410().splitArray(inputArray, 2);


    }
}

class Solution410 {
    public int splitArray(int[] nums, int k) {
        Arrays.sort(nums);
        int divide = nums.length / k;

        int sum = 0;
        for (int i = divide + 1; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }
}