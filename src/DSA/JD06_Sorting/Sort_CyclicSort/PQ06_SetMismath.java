package DSA.JD06_Sorting.Sort_CyclicSort;

import java.util.Arrays;

public class PQ06_SetMismath {
    static void main() {
        int[] arr = {1, 2, 2, 3};
        int[] missMatch = new Solution645().findErrorNums(arr);
        System.out.println(Arrays.toString(missMatch));
    }
}


class Solution645 {
    public int[] findErrorNums(int[] nums) {
        int[] arr = new int[2];

        cyclicSort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                return new int[]{nums[i], i + 1};
            }
        }

        return new int[]{-1, -1};
    }

    public int[] cyclicSort(int[] arr) {
        int i = 0;

        while (i < arr.length) {
            if (arr[i] == i + 1) {
                i++;
            } else {
                if (arr.length < arr[i]) {
                    i++;
                } else {
                    if (arr[i] != arr[arr[i] - 1])
                        swap(arr, i, arr[i] - 1);
                    else
                        i++;
                }
            }

        }
        return arr;
    }

    public void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}