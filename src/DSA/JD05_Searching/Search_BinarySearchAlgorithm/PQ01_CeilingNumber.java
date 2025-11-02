package DSA.JD05_Searching.Search_BinarySearchAlgorithm;
public class PQ01_CeilingNumber {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 3, 5, 9, 14, 16, 18};
        int searchValue = 15;
        int ceilingIndex = findCeilingNumber(arr, searchValue);
        System.out.println(ceilingIndex != -1 ?
                "Ceiling Value of " + searchValue + " is " + arr[ceilingIndex] + " in array" + " present at index " + ceilingIndex :
                "Ceiling value of " + searchValue + " is not found in array");
    }

    public static int findCeilingNumber(int[] arr, int searchValue) {
        int start = 0;
        int end = arr.length - 1;

        if (searchValue > arr[arr.length - 1]) {
            return -1;
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == searchValue) {
                return mid;
            } else if (arr[mid] <= searchValue) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start;
    }
}