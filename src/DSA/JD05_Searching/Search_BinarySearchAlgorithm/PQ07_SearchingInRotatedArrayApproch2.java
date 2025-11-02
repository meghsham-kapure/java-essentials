package DSA.JD05_Searching.Search_BinarySearchAlgorithm;
//package Lec10_BinarySearchAlgorithm;
//
//public class PQ07_SearchingInRotatedArrayApproch2 {
//    public static void main(String[] args) {
//         int[] inputArr = {7,8,9,0,1,2,3,4,5,6}; // sorted array with 3 digits shift
//        int searchValue = 0;
//
//        System.out.println(search(inputArr, searchValue));
//    }
//
//    public  int search (int [] arr, int target){
//        int start = 0;
//        int end = arr.length - 1;
//        int i = 1;
//        while (start<=end){
//            System.out.println("i==>"+(i++));
//            int mid = start + ( end - start ) / 2;
//
//            if (target == arr[mid]){
//                return mid;
//            }
//
//            if (arr [start] <= arr[mid] ){
//                if (arr[start] <= target && target <=arr[mid]){
//                    end = mid - 1;
//                }else {
//                     start = mid + 1;
//                }
//            }else {
//                if (arr[mid] <= arr[end] ){
//                System.out.println("direction==>RIGHT");
//
//                    if (arr[mid]<=target && target<= arr[end]){
//                        start = mid + 1;
//                    }else{
//                        end = mid - 1;
//                    }
//                }
//
//            }
//        }
//
//        return -1;
//    }
//}
//
