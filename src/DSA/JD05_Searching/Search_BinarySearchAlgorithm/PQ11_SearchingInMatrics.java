package DSA.JD05_Searching.Search_BinarySearchAlgorithm;

public class PQ11_SearchingInMatrics {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int target = 60;

        String foundOnIndex = "-1";
        int rowStart = 0;
        int rowEnd = arr.length - 1;

        while (rowStart <= rowEnd) {
            int rowMid = rowStart + (rowEnd - rowStart) / 2;

            int colStart = 0;
            int colEnd = arr[rowMid].length - 1;

            if (arr[rowMid][colStart] > target)
                rowEnd = rowMid - 1;

            else if (arr[rowMid][colEnd] < target)
                rowStart = rowMid + 1;

            else {
                while (colStart <= colEnd) {
                    int colMid = colStart + (colEnd - colStart) / 2;
                    if (arr[rowMid][colMid] == target) {
                        foundOnIndex = "Element found arr[" + rowMid + "] [" + colMid + "] ";
                        break;
                    } else if (arr[rowMid][colMid] < target)
                        colStart = colMid + 1;
                    else
                        colEnd = colMid - 1;
                }
            }

            if (!foundOnIndex.equals("-1"))
                break;

        }
        System.out.println("Result => " + foundOnIndex);
    }

    static int[] search(int[][] matrix, int target) {
        int r = 0;
        int c = matrix[0].length - 1;  // <-- Should be matrix[0].length, not matrix.length

        while (r < matrix.length && c >= 0) {
            if (matrix[r][c] == target) {
                return new int[]{r, c};
            }
            if (matrix[r][c] < target) {
                r++;  // move down
            } else {
                c--;  // move left
            }
        }

        return new int[]{-1, -1};  // Not found
    }

}