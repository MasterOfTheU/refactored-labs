package testing;

import org.junit.Assert;
import org.junit.Test;
import refactoring.MatrixSum;

public class MatrixSumTest {

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
