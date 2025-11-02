package DSA.JD06_Sorting.Sort_CyclicSort;

import java.util.Arrays;

public class PQ05_FirstMissingPositive {
    static void main(String[] arg) {
//        int arr[] = {-1, 2, 4, 1}; => 3
//        int arr[] = {1, 2, 0}; // => 3
//        int arr[] = {3, 4, -1, 1}; // =>2
//        int arr[] = {7, 8, 9, 11, 12}; // => 1
        int[] arr = {1, 1}; // => 2
        int i = new Solution41().firstMissingPositive(arr);
        System.out.println(Arrays.toString(arr) + "\t" + i);
    }
}

class Solution41 {

    public int firstMissingPositive(int[] arr) {
        cyclicSort(arr);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                return i + 1;
            }
        }
        return arr[arr.length - 1] + 1;
    }

    public void cyclicSort(int[] arr) {
        int i = 0;

        while (i < arr.length) {
            if (arr[i] > 0 && arr[i] < arr.length) {
                if (arr[i] != i + 1) {
                    if ((arr[i] != arr[arr[i] - 1]))
                        swap(arr, i, arr[i] - 1);
                    else
                        i++;
                } else {
                    i++;
                }
            } else {
                i++;
            }
        }
    }

    public void swap(int[] arr, int p1, int p2) {
        int temp = arr[p1];
        arr[p1] = arr[p2];
        arr[p2] = temp;
    }
}
