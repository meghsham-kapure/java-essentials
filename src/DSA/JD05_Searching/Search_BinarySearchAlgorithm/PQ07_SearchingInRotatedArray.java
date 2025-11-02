package DSA.JD05_Searching.Search_BinarySearchAlgorithm;
public class PQ07_SearchingInRotatedArray {
    public static void main(String[] args) {
        Solution33 sol = new Solution33();

        int[] inputArr = {5, 1, 3}; // sorted array with 3 digits shift
        int searchValue = 0;

        System.out.println(sol.search(inputArr, searchValue));


    }


}

class Solution33 {
    public int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;


            if (arr[mid + 1] < arr[mid])
                return mid;

            else if (arr[0] > arr[mid])
                start = mid + 1;

            else if (arr[0] <= arr[mid])
                end = mid - 1;
        }
        return start;
    }

    public int search(int[] arr, int target) {
        if (arr.length <= 1) {
            if (arr.length == 0)
                return -1;
            else {
                if (arr[0] == target)
                    return 0;
                else
                    return -1;
            }

        }

        int pivot = findPivot(arr);
        int start = 0;
        int end = arr.length - 1;


        if (arr[0] <= target && arr[pivot] >= target) {
            start = 0;
            end = pivot;
        } else if (arr[pivot + 1] <= target && arr[arr.length - 1] >= target) {
            start = pivot + 1;
            end = arr.length - 1;
        } else
            return -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid])
                return mid;
            else if (target > arr[mid])
                start = mid + 1;
            else
                end = mid - 1;

        }
        return -1;
    }
}