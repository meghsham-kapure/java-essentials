package DSA.JD06_Sorting.Sort_CyclicSort;

public class PQ03_DuplicateNumber {
    static void main() {
        System.out.println(new Solution287().findDuplicate(new int[]{1, 3, 4, 2, 2}));
    }
}


class Solution287 {
    public int findDuplicate(int[] nums) {
        cyclicSort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                return nums[i];
            }
        }

        return -1;
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