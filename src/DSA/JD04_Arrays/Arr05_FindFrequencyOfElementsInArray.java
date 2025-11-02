package DSA.JD04_Arrays;

import java.util.Arrays;

public class Arr05_FindFrequencyOfElementsInArray {
    public static void main(String[] args) {

        int [] numberArray = new int[20];
        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = (int) (Math.floor(Math.random() * 10));
        }

        System.out.println("Auto Created Array is "+ Arrays.toString(numberArray));
        for (int i = 0; i < numberArray.length; i++) {
            int counter = 1 ;
            if (numberArray[i]!=-1){
                for (int j = i+1; j < numberArray.length; j++) {
                    if (numberArray[i]==numberArray[j]){
                        counter++;
                        numberArray[j]=-1;
                    }
                }
                System.out.println(numberArray[i]+"=>"+counter);
            }
        }
    }
}