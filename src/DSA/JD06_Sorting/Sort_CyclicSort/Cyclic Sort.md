# Cyclic Sort

### What is Cyclic Sort?

* Cyclic Sort is an algorithm used to sort an array containing numbers in the range of 1 to N (or 0 to N-1 if adjusted).
* The idea is simple:

    * Each element has a “correct position” in the array.
    * We check if the current element is at the correct position.
    * If not, we swap it to its correct index.
    * If yes, we move forward to the next element.

### Example Program

```java
package DSA.JD06_Sorting.Sort_CyclicSort;

import java.util.Arrays;

public class CyclicSort {
    static void main(String[] args) {
        int arr[] = {6, 1, 4, 2, 3, 5};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void cyclicSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] != (i + 1)) {
                swap(arr, i, arr[i] - 1);
            } else {
                i++;
            }
        }
    }

    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
```

### Step-by-Step Explanation

1. Looping through the array

    * We start with index `i = 0` and keep looping until `i < arr.length`.

2. Checking the correct position

    * For each element, the correct index should be value – 1.
    * Example: value `6` belongs at index `5`, value `1` belongs at index `0`.

3. Two possibilities in each iteration:

    * If the value is not in the correct index → Swap the current element with the element at its correct position.
    * If the value is already in the correct index → Just move to the next index.

### Dry Run with Example Array

Input: `[6, 1, 4, 2, 3, 5]`

* At `i = 0`, value = 6 → correct index = 5 → swap with arr[5] → `[5, 1, 4, 2, 3, 6]`
* At `i = 0`, value = 5 → correct index = 4 → swap with arr[4] → `[3, 1, 4, 2, 5, 6]`
* At `i = 0`, value = 3 → correct index = 2 → swap with arr[2] → `[4, 1, 3, 2, 5, 6]`
* At `i = 0`, value = 4 → correct index = 3 → swap with arr[3] → `[2, 1, 3, 4, 5, 6]`
* At `i = 0`, value = 2 → correct index = 1 → swap with arr[1] → `[1, 2, 3, 4, 5, 6]`
* Now all elements are at correct positions.

Final Sorted Array: `[1, 2, 3, 4, 5, 6]`

### Complexity

* Time Complexity: O(N)

    * Each element is placed in its correct position with at most one swap.
    * Even though we are inside a while loop, no element is processed more than once incorrectly.

* Space Complexity: O(1)

    * Sorting is done in place without using extra memory.

