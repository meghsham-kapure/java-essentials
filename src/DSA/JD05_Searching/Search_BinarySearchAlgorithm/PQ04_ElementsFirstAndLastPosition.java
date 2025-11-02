package DSA.JD05_Searching.Search_BinarySearchAlgorithm;
import java.util.Arrays;

public class PQ04_ElementsFirstAndLastPosition {
    public static void main(String[] args) {
        Solution34 sol = new Solution34();
        int[] arr = new int[]{5, 7, 7, 7, 7, 8, 8, 8, 10};
        int target = 11;
        System.out.println(Arrays.toString(sol.searchRange(arr, target)));
    }
}

/*
 1. integers array sorted in ascending order
 2. find the starting and ending position of a given target value return [startingPosition, endingPosition]
 3. if target is not found in the array, return [-1, -1].
*/

class Solution34 {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        Arrays.fill(result, -1);

        if (nums.length == 0)
            return result;

        int first = findFirstOccurrence(nums, target);
        int last = findLastOccurrence(nums, target);

        if (first < nums.length && nums[first] == target) {
            result[0] = first;
        }

        if (last >= 0 && nums[last] == target) {
            result[1] = last;
        }

        return result;
    }

    public int findFirstOccurrence(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] < target)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return start;
    }

    public int findLastOccurrence(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] <= target)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return end;
    }
}
