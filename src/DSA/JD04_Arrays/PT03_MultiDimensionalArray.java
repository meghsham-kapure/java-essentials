package DSA.JD04_Arrays;

public class PT03_MultiDimensionalArray {
    public static void main(String[] args) {
        int[][] matrix3by3 = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix3by3[i][j] = (int) (1 + Math.random() * 100);
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix3by3[i][j] + "\t");
                ;
            }
            System.out.println();
        }
    }
}
