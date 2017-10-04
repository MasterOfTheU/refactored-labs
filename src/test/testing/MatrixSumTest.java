package testing;

import org.junit.Assert;
import org.junit.Test;
import refactoring.MatrixSum;

import java.util.Random;

public class MatrixSumTest {

    private static int[][] fillMatrix(int[][] matrix) {
        Random rand = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = rand.nextInt(50);
            }
        }
        return matrix;
    }

    @Test
    public void createUserMatrix() {
        int[][] resultMatrix = MatrixSum.createUserMatrix(5);
        Assert.assertNotNull(resultMatrix);
    }

    @Test
    public void calculateSum() {
        int[][] matrix = new int[5][5];
        boolean result = MatrixSum.calculateSum(matrix.length, matrix);
        Assert.assertTrue(result);
    }

    @Test
    public void calculateSumNotNull() {
        int[][] matrix = new int[5][5];
        boolean result = MatrixSum.calculateSum(matrix.length, matrix);
        Assert.assertNotNull(result);
    }

}
