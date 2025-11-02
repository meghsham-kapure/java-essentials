package DSA.JD04_Arrays;

import java.util.Scanner;

public class PT04_JaggedArray {
    public static void main(String[] args) {
        int jaggedArray[][];
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many rows are the in jagged array =>");
        int rows = scanner.nextInt();

        jaggedArray = new int[rows][];

        for (int i = 0; i < rows; i++) {
            System.out.print("How many columns are the in jagged array row " + i + " => ");
            int cols = scanner.nextInt();
            jaggedArray[i] = new int[cols];
            for (int j = 0; j < cols; j++) {
                jaggedArray[i][j] = (int) (1 + Math.random() * 100);
            }
        }

        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
