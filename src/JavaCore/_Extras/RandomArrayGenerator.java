package _extras;

import java.util.Arrays;

public class RandomArrayGenerator {

    public static void main(String[] args) {
        int[] arr = intArrayGenerator(100);
        System.out.println(Arrays.toString(intArrayGeneratorInAscendingOrder(arr)));
        System.out.println(Arrays.toString(intArrayGeneratorInDescendingOrder(arr)));
    }

    public static int[] intArrayGenerator(int size) {
        int arr[] = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100 + 1);
        }
        return arr;
    }

    public static int[] intArrayGeneratorInAscendingOrder(int[] arr) {
        Arrays.sort(arr);
        return arr;
    }

    public static int[] intArrayGeneratorInDescendingOrder(int[] arr) {
        int[] newArr = new int[arr.length];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = arr[arr.length - 1 - i];
        }

        return newArr;
    }

}
