# Binary Search Algorithm

* **Binary Search** algorithm is a technique used to search for a value in a sorted array (ascending or descending).

* **Conditions to apply Binary Search Algorithm** in a data structure:

    * The data structure must be **sorted**.
    * Access to any element of the data structure should take **constant time**.

---

## Binary Search Algorithm (Ascending Array)

1. Considering the start and end point indexes, calculate the **middle element index**.
2. Check if the middle element has the **target value**.
3. If found, return the index.
4. If not found:

    1. If the middle element is **less than** the target, search in the **right** part of the array. So, set
       `start = mid + 1`.
    2. If the middle element is **greater than** the target, search in the **left** part of the array. So, set
       `end = mid - 1`.
    3. Repeat from step 2 until `start > end`.

---

### Java Code Example

```java
package JD05_Searching.Search_LinearSearchAlgo.Search_BinarySearchAlgorithm;

public class PT01_BinarySearchAlgo {
    public static void main(String[] args) {
        int[] arr = new int[]{17, 22, 40, 55, 63, 68, 89, 89, 97};
        int searchValue = 40;
        System.out.println(binarySearchAlgo(arr, searchValue));
    }

    public static int binarySearchAlgo(int[] arr, int searchValue) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2; // safer formula

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
```

---

## Time Complexity of Binary Search

* **Best case:** `O(1)` — when the target is found at the first mid comparison.
* **Worst case:** `O(log N)` — logarithmic time due to halving the search space in each step.

---

## Why Use Binary Search Over Linear Search?

* **Linear Search** has time complexity of `O(n)`, as it checks every element until it finds the match or reaches the
  end.
* **Binary Search** has time complexity of `O(log N)`, which is significantly faster for large arrays.

> Example: In the worst case, Binary Search will take only **25 comparisons** to find (or not find) an element in an
> array of **20 million** elements.

---

## Handling Large Index Values Safely in Binary Search

* In arrays with very large index values, using the standard formula:

```java
int mid = (start + end) / 2;
```

can cause **integer overflow** in Java.

* To avoid this, use the **optimized formula**:

```java
int mid = start + (end - start) / 2;
```

### Why this is better:

* It avoids potential overflow by subtracting first (`end - start`) and then dividing.
* Ensures safety within **32-bit or 64-bit** integer bounds.

---
