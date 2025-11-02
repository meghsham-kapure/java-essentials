package DSA.JD06_Sorting.Sort_BubbleSorting;
import java.util.Arrays;

class BubbleSortAscending {
    public static void main(String arg[]) {
        int[] arr = {2, 4, 8, 6, 5, 7, 9};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(asendingBubbleSort(arr)));
    }

    public static int[] asendingBubbleSort(int arr[]) {


        for (int i = 0; i < arr.length; i++) {
            int indexMax = 0;
            for (int j = 0; j < arr.length - i; j++) {

                if (arr[j] > arr[indexMax])
                    indexMax = j;

            }

            System.out.println("Swapping " + arr[indexMax] + " and " + (arr[arr.length - 1 - i]));
            System.out.println(Arrays.toString(arr));

            int temp = arr[indexMax];
            arr[indexMax] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        return arr;
    }

}