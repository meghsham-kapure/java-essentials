package DSA.JD06_Sorting.Sort_BubbleSorting;
import java.util.Arrays;

public class PT01_BubbleSorting {
    public static void main(String[] args) {
        int arr[] = {9, 3, 4, 2, 8, 1, 6};

        for (int i = 0; i < arr.length; i++) {
            boolean isSwaped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                isSwaped = true;
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            if (!isSwaped)
                break;
        }

        System.out.println(Arrays.toString(arr));
    }
}


// this is bubble sort aka sinking sort or exchange sort