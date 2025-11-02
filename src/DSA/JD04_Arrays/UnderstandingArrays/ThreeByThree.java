package DSA.JD04_Arrays.UnderstandingArrays;

import java.util.Scanner;

public class ThreeByThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [][] numMat3By3  = new int[3][];

        for (int i = 0; i < numMat3By3.length; i++) {
            System.out.println("Enter 3 values for row : "+i);

            numMat3By3[i] = new int[3];

            for (int j = 0; j < numMat3By3[i].length; j++) {
                numMat3By3 [i][j] = sc.nextInt();
            }
        }

        System.out.println("Your have entered : ");

        for (int i = 0; i < numMat3By3.length; i++) {
            for (int j = 0; j < numMat3By3[i].length; j++) {
                System.out.print(numMat3By3 [i][j]+"\t");
            }
            System.out.println();
        }
    }
}
