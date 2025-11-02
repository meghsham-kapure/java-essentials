package DSA.JD04_Arrays;

public class Arr00_FindSmallestAndLargestElementInArray {
    public static void main(String[] args) {
        // Creating an arrays
        int[] numberArray = new int[10];
        System.out.print("Auto Adding Elements : ");
        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = (int) (Math.floor(Math.random() * 100));
            System.out.print(numberArray[i] + "\t");
        }

        System.out.println("\nFinding Largest and Smallest number...");
        int min = numberArray[0];
        int max = numberArray[0];

        for (int i = 0; i < numberArray.length; i++) {
            if (min>numberArray[i])
                min=numberArray[i];

            if (max<numberArray[i])
                max=numberArray[i];
        }

        System.out.println("In given array Largest number is " + min + " and Smallest Number is " + max);
    }
}
