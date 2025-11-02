package DSA.JD05_Searching.Search_BinarySearchAlgorithm;
class PQ06_FindingElementInMountainArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 4, 4, 5, 6, 6, 7, 5, 3, 2, 1, 0};
        int target = 0;
        int peakElement = findPeakElement(arr);
        System.out.println("=>" + findElement(arr, target, peakElement));
    }

    public static int findElement(int[] arr, int target, int peakElement) {
        if (target >= arr[0] && target <= arr[peakElement]) {
            int start = 0;
            int end = peakElement;

            while (start <= end) {
                int mid = (start + (end - start) / 2);

                if (target == arr[mid]) {
                    return mid;
                } else if (arr[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            return -1;
        } else {
            int start = peakElement + 1;
            int end = arr.length - 1;

            while (start <= end) {
                int mid = start + (end - start) / 2;

                if (target == arr[mid]) {
                    return mid;
                } else if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;

                }
            }

            return -1;
        }
    }

    public static int findPeakElement(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid - 1] <= arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return end;
    }
}   
