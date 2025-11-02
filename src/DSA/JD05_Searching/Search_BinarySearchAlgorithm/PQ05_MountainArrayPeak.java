package DSA.JD05_Searching.Search_BinarySearchAlgorithm;
public class PQ05_MountainArrayPeak {
    public static void main(String[] args) {
        int[] arr = {3, 5, 3, 2, 0};
        Solution852 sol = new Solution852();
        System.out.println(sol.peakIndexInMountainArray(arr));
    }
}

class Solution852 {
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        System.out.println();
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start;
    }
}
