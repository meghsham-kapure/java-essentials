package DSA.JD05_Searching.Search_BinarySearchAlgorithm;
public class PT01_BinarySearchAlgo {
    public static void main(String[] args) {
        int[] arr = new int[]{17, 22, 40, 55, 63, 68, 89, 89, 97};
        int searchValue = 34;
        System.out.println(binarySearchAlgo(arr, searchValue));
    }

    public static int binarySearchAlgo(int[] arr, int searchValue) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
//            int mid = (start + end) / 2;
            int mid = start + (end - start) / 2;
            if (arr[mid] == searchValue) {
                return mid;
            } else if (arr[mid] < searchValue) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
