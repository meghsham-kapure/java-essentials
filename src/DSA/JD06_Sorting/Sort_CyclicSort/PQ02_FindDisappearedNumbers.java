package DSA.JD06_Sorting.Sort_CyclicSort;

import java.util.ArrayList;
import java.util.List;

public class PQ02_FindDisappearedNumbers {
    static void main(String[] args) {
        System.out.println(new Solution448().findDisappearedNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1}));
    }
}


class Solution448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        cyclicSort(nums);

        List<Integer> disappearedList = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1)
                disappearedList.add(i + 1);
        }

        return disappearedList;
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
