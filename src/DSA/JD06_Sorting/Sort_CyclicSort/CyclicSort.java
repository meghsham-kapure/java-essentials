package DSA.JD06_Sorting.Sort_CyclicSort;

import java.util.Arrays;

public class CyclicSort {
    static void main(String[] args) {
        int[] arr = {1, 2};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

//    public static void cyclicSort(int[] arr) {
//        int i = 0;
//
//        while (i < arr.length) {
//            if (arr[i] != (i + 1)) {
//                swap(arr, i, arr[i] - 1);
//            } else {
//                i++;
//            }
//        }
//    }

    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static void cyclicSort(int[] nums) {
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
}