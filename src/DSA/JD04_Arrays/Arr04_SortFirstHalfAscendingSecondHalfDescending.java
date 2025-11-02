package DSA.JD04_Arrays;

import java.util.Arrays;

public class Arr04_SortFirstHalfAscendingSecondHalfDescending {
    public static void main(String[] args) {
        int [] numberArray = new int[11];
        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = (int) (Math.floor(Math.random() * 100));
            System.out.print(numberArray[i] + "\t");
        }


        for (int i = 0; i < numberArray.length/2; i++) {
            for (int j = i+1; j < numberArray.length/2; j++) {
                if (numberArray[i]>numberArray[j]){
                    int temp = numberArray[i];
                    numberArray[i] = numberArray[j];
                    numberArray[j] = temp;
                }
            }
        }

        for (int i = numberArray.length/2; i < numberArray.length; i++) {
            for (int j = i+1; j < numberArray.length; j++) {
                if (numberArray[i]<numberArray[j]){
                    int temp = numberArray[i];
                    numberArray[i] = numberArray[j];
                    numberArray[j] = temp;
                }
            }
        }

        System.out.println("\nAfter Sorting First Half Ascending and Second Half Descending : \n"+Arrays.toString(numberArray));
    }
}
