package DSA.JD05_Searching.Search_BinarySearchAlgorithm;
public class PQ02_FloorNumber {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 3, 5, 9, 14, 16, 18};
        int searchValue = 15;
        int floorValue = floorValue(arr, searchValue);
        System.out.println(floorValue != -1 ?
                "Floor Value of " + searchValue + " is " + arr[floorValue] + " in array" + " present at index " + floorValue :
                "Floor value of " + searchValue + " is not found in array");
    }

    public static int floorValue(int[] arr, int searchValue) {
        int start = 0;
        int end = arr.length - 1;

        if (searchValue < arr[0]) {
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
        return end;
    }
}