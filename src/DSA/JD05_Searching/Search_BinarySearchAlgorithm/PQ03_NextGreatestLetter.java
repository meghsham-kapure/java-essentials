package DSA.JD05_Searching.Search_BinarySearchAlgorithm;
public class PQ03_NextGreatestLetter {
    public static void main(String[] args) {
        char arr1[] = new char[]{'c', 'f', 'j'};
        char target1 = 'a';// =>'c'

        char arr2[] = new char[]{'c', 'f', 'j'};
        char target2 = 'c'; // => 'f'

        char arr3[] = new char[]{'x', 'x', 'y', 'y'};
        char target3 = 'z'; // =>x

        Solution744 sol = new Solution744();

        System.out.println(sol.nextGreatestLetter(arr1, target1));
        System.out.println(sol.nextGreatestLetter(arr2, target2));
        System.out.println(sol.nextGreatestLetter(arr3, target3));
    }
}

/*
    1. characters array sorted in ascending order with least two different characters in letters
    2. character target
    3. return the smallest character in letters that is greater than target
    4. if such a character does not exist, return the first character in letters
*/

class Solution744 {
    public char nextGreatestLetter(char[] arr, char searchValue) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] <= searchValue) {
                start = mid + 1;
            } else if (arr[mid] > searchValue) {
                end = mid - 1;
            }
        }
        return arr[start % arr.length];
    }
}