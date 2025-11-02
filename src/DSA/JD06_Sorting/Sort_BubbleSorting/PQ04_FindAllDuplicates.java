package DSA.JD06_Sorting.Sort_BubbleSorting;
import java.util.ArrayList;
import java.util.List;

public class PQ04_FindAllDuplicates {
    static void main() {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(new Solution442().findDuplicates(arr));
    }
}


class Solution442 {
    public List<Integer> findDuplicates(int[] nums) {
        cyclicSort(nums);

        List<Integer> duplicates = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                duplicates.add(nums[i]);
            }
        }

        return duplicates;
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