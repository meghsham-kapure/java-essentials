package DSA.JD04_Arrays;

public class Arr02_FindSecondSmallestElementInArray {
    public static void main(String[] args) {
        int [] numberArray = new int[10];
        System.out.println("Auto Adding Elements : ");
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

        if(numberArray.length>=2){
            System.out.println("\nThe Second Highest Number Is : " + numberArray[numberArray.length-2]);
        }else {
            System.out.println("\nAdd 2 numbers at least to get second highest number");
        }


    }
}
