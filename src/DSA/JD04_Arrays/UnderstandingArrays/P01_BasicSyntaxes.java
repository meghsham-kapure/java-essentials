package DSA.JD04_Arrays.UnderstandingArrays;

import java.util.Arrays;

public class P01_BasicSyntaxes {
    public static void main(String[] args) {

        // Creating an arrays
        int [] numberArray = new int[10];
        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = (int) (Math.floor(Math.random() * 100));
            System.out.print(numberArray[i] + "\t");
        }

        for (int i = 0; i < numberArray.length; i++) {
            for (int j = i+1; j < numberArray.length; j++) {
                if (numberArray[i]>numberArray[j]){
                    int temp = numberArray[i];
                    numberArray[i] = numberArray[j];
                    numberArray[j] = temp;
                }
            }
        }

        System.out.println();
        for (int i : numberArray){
            System.out.print(i+"\t");
        }


    }
}
