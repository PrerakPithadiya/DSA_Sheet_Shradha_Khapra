package _2D_Arrays;

import java.util.Arrays;

public class Diagonal_Traversal {
    public static void main(String[] args) {
        int[][] mat = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[] result = diagonalTraversal(mat);
        System.out.println(Arrays.toString(result));
    }

    public static int[] diagonalTraversal(int[][] mat) {
        int r = mat.length, c = mat[0].length;
        int diagonalNo = 1, row = 0, col = 0, k = 0;
        int[] arr = new int[r * c];
        while (row < r && col < c) {
            if (diagonalNo % 2 != 0) {
                int i = row;
                int j = col;
                for (; i > -1 && j < c; i--, j++) {
                    arr[k++] = mat[i][j];
                }
                row = i + 1;
                col = j - 1;
                if (col == c - 1)
                    row++;
                else
                    col++;
            } else {
                int i = row;
                int j = col;
                for (; i < r && j > -1; i++, j--) {
                    arr[k++] = mat[i][j];
                }
                row = i - 1;
                col = j + 1;
                if (row == r - 1)
                    col++;
                else
                    row++;
            }
            diagonalNo++;
        }
        return arr;
    }
}