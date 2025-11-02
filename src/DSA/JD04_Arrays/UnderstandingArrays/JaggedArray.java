package DSA.JD04_Arrays.UnderstandingArrays;

import java.util.Arrays;
import java.util.Scanner;

public class JaggedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows : ");
        int rows = sc.nextInt();

        int [][] jaggedArray = new int[rows][];

        for (int i = 0; i < jaggedArray.length; i++) {

            System.out.println("Enter the number columns are in row " + i + " : ");
            int col = sc.nextInt();

            jaggedArray[i] = new int[col];

            System.out.println("Enter " + col + " elements in the row "+ i + " : ");
            for (int j = 0; j < jaggedArray[i].length ; j++) {
                jaggedArray [i] [j] = sc.nextInt();
            }
        }
        System.out.println("You have entered : ");
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
