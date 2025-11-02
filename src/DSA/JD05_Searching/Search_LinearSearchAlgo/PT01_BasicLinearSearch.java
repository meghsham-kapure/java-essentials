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
