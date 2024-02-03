package _2D_Arrays;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Spiral_Order_Printing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Rows : ");
        int rows = sc.nextInt();
        System.out.print("Enter the Number of Cols : ");
        int cols = sc.nextInt();
        int[][] mat = new int[rows][cols];
        generateRandomMatrix(mat, rows, cols);
        System.out.println("\nThe Matrix is : ");
        printTheMatrix(mat);
        System.out.println("\nThe Spiral Order Printing is : ");
        spiralOrderPrinting(mat, rows, cols);
    }

    public static void spiralOrderPrinting(int[][] mat, int r, int c) {
        int top = 0, bottom = r - 1, left = 0, right = c - 1;
        while (top <= bottom && left <= right) {
            // top
            for (int j = left; j <= right; j++) {
                System.out.print(mat[top][j] + " ");
            }

            // right
            for (int i = top + 1; i <= bottom; i++) {
                System.out.print(mat[i][right] + " ");
            }

            // bottom
            for (int j = right - 1; j >= left; j--) {
                if (top == bottom) {
                    break;
                }
                System.out.print(mat[bottom][j] + " ");
            }

            // left
            for (int i = bottom - 1; i >= top + 1; i--) {
                if (left == right) {
                    break;
                }
                System.out.print(mat[i][left] + " ");
            }

            top++;
            bottom--;
            left++;
            right--;
        }
    }

    public static void generateRandomMatrix(int[][] mat, int r, int c) {
        Random rd = new Random();
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mat[i][j] = rd.nextInt(10, 100);
            }
        }
    }

    public static void printTheMatrix(int[][] mat) {
        for (int[] arr : mat) {
            System.out.println(Arrays.toString(arr));
        }
    }
}