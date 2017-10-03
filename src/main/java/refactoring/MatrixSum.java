package refactoring;

import java.util.*;

public class MatrixSum {

    //region createUserMatrix
    public static int[][] createUserMatrix(int n) {
        int[][] matrix = new int[n][n];
        Random random = new Random();

        System.out.println("The start matrix is: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = random.nextInt(5);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        return matrix;
    }
    //endregion

    /**
     * Calculates the sum of items in matrix on main diagonal, above and below it.
     * @param n - Takes order from user input
     * @param matrix - Generates matrix of order <b>n</b>
     */
    //region calculateSum
    protected static void calculateSum(int n, int[][] matrix) {

        int sumMainDiagonal = 0,
                sumAboveDiagonal = 0,
                sumBelowDiagonal = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    sumMainDiagonal += matrix[i][j];
                }
            }
        }
        System.out.println("The sum on the main diagonal is: " + sumMainDiagonal);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i < j) {
                    sumAboveDiagonal += matrix[i][j];
                }
            }
        }
        System.out.println("The sum above main diagonal is: " + sumAboveDiagonal);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i > j) {
                    sumBelowDiagonal += matrix[i][j];
                }
            }
        }
        System.out.println("The sum below main diagonal is: " + sumBelowDiagonal);
    }
    //endregion
}
