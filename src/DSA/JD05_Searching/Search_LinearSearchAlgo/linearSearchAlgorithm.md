# Linear Search Algorithm

- In linear search algorithm the target value is searched from 0th index to last index in the given collection of
  elements.
- All the elements are checked one by one till we find the target element.
- If finding multiple occurrence of same element is requirement then, on matching values index of matching element is
  marked.
- Linear search is most easy and strait-forward technique. but takes more time than other techniques

```java
package DSA.JD05_Searching.Search_LinearSearchAlgo;

public class PT01_BasicLinearSearch {
    public static void main(String[] args) {
        int[] arr = new int[]{7, 22, 71, 96, 84, 72, 5, 3, 64, 5, 24};

        //finding 3 in the array

        int searchValue = -3;
        int foundIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == searchValue) {
                foundIndex = i;
                break;
            }
        }

        System.out.println(foundIndex != -1 ?
                "Element value " + searchValue + " is found at index " + "arr[" + foundIndex + "]" :
                "Element value" + searchValue + " is not found ");
    }
}

```

- Time complexity of linear search algorithm is
    - For best case scenario, when the element is present at first (0th) element is O(1)
    - For worst case scenario, when the element is not present in given elements collection, and we have searched the
      entire collection is O(n), where n is the total number of elements in given colection