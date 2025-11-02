package DSA.JD04_Arrays;

import java.util.Arrays;

public class Arr03_ReverseAnArray {
    public static void main(String[] args) {
        int [] numberArray = new int[5];
        System.out.println("Auto Adding Elements : ");
        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = (int) (Math.floor(Math.random() * 100));
            System.out.print(numberArray[i] + "\t");
        }

        System.out.println("\nReversed Array : ");

        for (int i = 0; i < numberArray.length/2; i++) {
            int temp = numberArray[i];
            numberArray[i] = numberArray[numberArray.length-1-i];
            numberArray[numberArray.length-1-i] = temp;
        }

        System.out.println(Arrays.toString(numberArray));
    }
}
