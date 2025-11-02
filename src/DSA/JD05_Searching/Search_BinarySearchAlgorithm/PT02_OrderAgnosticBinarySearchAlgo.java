package DSA.JD05_Searching.Search_BinarySearchAlgorithm;

public class PT02_OrderAgnosticBinarySearchAlgo {
    public static void main(String[] args) {
        int[] arrAsc = new int[]{18, 41, 307, 312, 427, 625, 712, 750, 759, 805};
        int[] arrDsc = new int[]{805, 759, 750, 712, 625, 427, 312, 307, 41, 18};
        int[] arr = new int[]{759, 759, 759, 759, 759, 759, 759, 759, 759, 759};
        int[] arrEmpty = new int[]{759, 759, 759, 759, 759, 759, 759, 759, 759, 759};
        int searchValue = 7159;

        System.out.println("In Ascending array element is found at index " + OrderAgnosticBinarySearchAlgo(arrAsc, searchValue));
        System.out.println("In Descending array element is found at index " + OrderAgnosticBinarySearchAlgo(arrDsc, searchValue));
        System.out.println("In Equal array element is found at index " + OrderAgnosticBinarySearchAlgo(arr, searchValue));
        System.out.println("In Empty array element is found at index " + OrderAgnosticBinarySearchAlgo(arrEmpty, searchValue));
    }


    public static int OrderAgnosticBinarySearchAlgo(int[] arr, int searchValue) {
        int start = 0;
        int end = arr.length - 1;

        if (arr.length == 0) return -1;

        if (arr[0] < arr[arr.length - 1]) {
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (arr[mid] == searchValue)
                    return mid;
                else if (arr[mid] < searchValue)
                    start = mid + 1;
                else
                    end = mid - 1;

            }
        } else if (arr[0] > arr[arr.length - 1]) {
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (arr[mid] == searchValue)
                    return mid;
                else if (arr[mid] < searchValue)
                    end = mid - 1;
                else
                    start = mid + 1;

            }
        } else {
            if (arr[start] == searchValue)
                return 0;
        }
        return -1;
    }
}
