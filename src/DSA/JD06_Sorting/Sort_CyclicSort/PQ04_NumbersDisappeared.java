package DSA.JD06_Sorting.Sort_CyclicSort;

//package DSA.JD06_Sorting.Sort_CyclicSort;
//
//import java.util.Arrays;
//
//public class PQ02_NumbersDisappeared {
//    static void main() {
//        int[] arr = {1, -2, 4, -1, -4, 2, 0, 5, 6};
//        cyclicSort(arr);
//        System.out.println(Arrays.toString(arr));
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] < 0)
//                return (i + 1);
//        }
//
//    }
//
//    public static int[] cyclicSort(int[] arr) {
//        int i = 0;
//
//        while (i < arr.length) {
//            if (arr[i] > 0) {
//                if (arr[i] - 1 != i) {
//                    swap(arr, i, (arr[i] - 1));
//                } else {
//                    i++;
//                }
//            } else {
//                i++;
//            }
//        }
//        return arr;
//    }
//
//    public static void swap(int a[], int i1, int i2) {
//        int t = a[i1];
//        a[i1] = a[i2];
//        a[i2] = t;
//    }
//}
//
/// /
/// /class Solution448 {
/// /
/// /
/// /    public List<Integer> findDisappearedNumbers(int[] nums) {
/// /        cyclicSort(nums);
/// /
/// /        List<Integer> disappearedList = new ArrayList<>();
/// /
/// /        for (int i = 0; i < nums.length; i++) {
/// /            if (nums[i] != i + 1)
/// /                disappearedList.add(i + 1);
/// /        }
/// /
/// /        return disappearedList;
/// /    }
/// /
/// /
/// /}
//
//
/// / bruteforce
/// /    public List<Integer> findDisappearedNumbers0(int[] nums) {
/// /        int arr[] = new int[nums.length+1];
/// /
/// /        for (int i = 0; i < nums.length; i++)
/// /            arr[nums[i]]++;
/// /
/// /        List<Integer> disappearedList = new ArrayList<>();
/// /
/// /        for (int i = 0; i < arr.length; i++) {
/// /            if (arr[i] == 0)
/// /                disappearedList.add(i);
/// /        }
/// /
/// /        return disappearedList;
/// /    }
//
