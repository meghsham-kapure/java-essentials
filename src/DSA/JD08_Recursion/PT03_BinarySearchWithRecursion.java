package DSA.JD08_Recursion;


public class PT03_BinarySearchWithRecursion{

    public static void main(String[] args){
        int arr[] = {1,3,7,8,11,58,98};


        int foundOnIndex = binarySearch(arr, 30, 0, arr.length-1);
        System.out.println("Found On Index : "+foundOnIndex); // Should print -1 for element not found

        int foundOnIndex2 = binarySearch(arr, 11, 0, arr.length-1);
        System.out.println("Found On Index : "+foundOnIndex2); // Should print 4
    }


    public static int binarySearch(int [] arr, int target, int start, int end){
        if ( end < start  )
            return  -1;

        int mid = start + (end -start) / 2;

        if (arr[mid]==target)
            return mid;

        else if (target< arr[mid])
            return binarySearch(arr,target,start,mid - 1);

        else
            return binarySearch(arr,target,mid + 1,end);
    }
}