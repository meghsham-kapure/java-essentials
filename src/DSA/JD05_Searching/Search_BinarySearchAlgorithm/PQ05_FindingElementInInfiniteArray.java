package DSA.JD05_Searching.Search_BinarySearchAlgorithm;
public class PQ05_FindingElementInInfiniteArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 5, 7, 8, 9, 10, 11, 12, 14, 15, 16, 17, 19, 20, 21, 22, 23, 24, 26, 27, 29, 33, 36, 39, 40, 42, 43, 46, 47, 48, 49, 52, 56, 57, 58, 59, 61, 65, 67, 68, 69, 70, 72, 73, 74, 75, 76, 78, 79, 80, 82, 83, 84, 86, 88, 89, 91, 92, 94, 95, 97, 98, 99, 100};
        findElement(arr, 25, 0);
    }

    public static int findElement(int[] arr, int searchValue, int startIndex) {
        int start = startIndex;
        int end = startIndex + 10;


        if (searchValue >= arr[start] && searchValue <= arr[end]) {
            System.out.println("Searching in range " + start + "-" + end);
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (arr[mid] == searchValue) {
                    System.out.println("Element " + searchValue + " is  found on index " + mid);
                    return mid;
                } else if (arr[mid] < searchValue) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            System.out.println("Element " + searchValue + " is found not");
            return -1;
        }
        return findElement(arr, searchValue, startIndex + 10);
    }
}
