package DSA.JD06_Sorting.Sort_CyclicSort;

import java.util.Arrays;

public class PQ01_MissingElement {
    static void main() {
        int[] arr = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        int missingElement = new Solution268().missingNumber(arr);
        System.out.println("Missing element in arr " + Arrays.toString(arr) + " is " + missingElement);
    }

    // optimized
    public static int missingNumberUsingForLoop(int[] nums) {
        int[] arr = new int[nums.length + 1];

        for (int i = 0; i < nums.length; i++)
            arr[nums[i]]++;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0)
                return i;
        }

        return -1;
    }
}


class Solution268 {
    public int missingNumber(int[] nums) {
        cyclicSort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                return i;
            }
        }

        return nums[nums.length - 1] + 1;
    }

    public void cyclicSort(int[] nums) {
        int i = 0;

        while (i < nums.length) {

            if (nums[i] != i) {
                if (nums[i] >= nums.length) {
                    i++;
                    continue;

                }
                swap(nums, i, nums[i]);
            } else {
                i++;
            }
        }
    }

    public void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}

