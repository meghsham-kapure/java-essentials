package DSA.JD04_Arrays.ArrayList;

import java.util.Arrays;

public class PT06_ArrayEquality {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3, 4, 5};
        int[] arr2 = new int[]{1, 2, 3, 4, 5};

        System.out.println(arr1 == arr2); // false
        /*
        arr1 == arr2 checks reference / memory location equality, because they are separate objects They're not contain in same memory location hence here result becomes false.
        */

        System.out.println(arr1.equals(arr2)); //false
        /*
        The default equals() method in arrays behaves just like == — it doesn't compare the contents, only the reference, hence here result becomes false.
         */

        System.out.println(Arrays.equals(arr1, arr2));
        /*
         Arrays.equals(arr1, arr2) is specifically designed to check if two arrays have the same contents in the same order.hense result is true here.
         */
    }
}
