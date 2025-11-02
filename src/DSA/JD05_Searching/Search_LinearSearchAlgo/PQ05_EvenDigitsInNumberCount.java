//package DSA.JD05_Searching.Search_LinearSearchAlgo;
//
///*
//
//1295. Find Numbers with Even Number of Digits
//Given an array nums of integers, return how many of them contain an even number of digits.
//
//
//
//Example 1:
//
//Input: nums = [12,345,2,6,7896]
//Output: 2
//Explanation:
//12 contains 2 digits (even number of digits).
//345 contains 3 digits (odd number of digits).
//2 contains 1 digit (odd number of digits).
//6 contains 1 digit (odd number of digits).
//7896 contains 4 digits (even number of digits).
//Therefore, only 12 and 7896 contain an even number of digits.
//Example 2:
//
//Input: nums = [555,901,482,1771]
//Output: 1
//Explanation:
//Only 1771 contains an even number of digits.
//
//
//Constraints:
//
//1 <= nums.length <= 500
//1 <= nums[i] <= 105
//*/
//
//public class PQ05_EvenDigitsInNumberCount {
//    public static void main(String[] args) {
//        Solution sol = new Solution();
//
//        int[] numInput1 = new int[]{12, 345, 0, 6, 7896};
//        int[] numInput2 = new int[]{555, 901, 482, 1771};
//
//        System.out.println(sol.findNumbers(numInput1));
//        System.out.println(sol.findNumbers(numInput2));
//        System.out.println(sol.isEvenNumberDigits(123456));
//
//    }
//}
//
//class Solution {
//    public int findNumbers(int[] nums) {
//        int counter = 0;
//        for (int num : nums) {
//            if (isEvenNumberDigits(num))
//                counter++;
//        }
//        return counter;
//    }
//
////    public boolean isEvenNumberDigits(int num) {
////        int counter = 0;
////        do {
////            num /= 10;
////            counter++;
////        } while (num > 0);
////
////        return counter % 2 == 0;
////    }
//
//    //OPTIMIZED
//    public boolean isEvenNumberDigits(int num) {
//        return ((int) Math.log10(num) + 1) % 2 == 0;
//    }
//
//
//}
