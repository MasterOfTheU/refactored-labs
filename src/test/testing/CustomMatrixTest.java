package testing;

import org.junit.Assert;
import org.junit.Test;
import refactoring.*;

public class CustomMatrixTest {

    @Test
    public void checkZeroMatrix() {
        int[][] resultMatrix = CustomMatrix.createMatrix(0);

        for (int i = 0; i < resultMatrix.length; i++) {
            for (int j = 0; j < resultMatrix.length; j++) {
                Assert.assertTrue(resultMatrix[i][j] == 0);
            }
        }
    }

    @Test
    public void createMatrix() {
        int[][] resultMatrix = CustomMatrix.createMatrix(5);
        Assert.assertNotNull(resultMatrix);
    }

    @Test
    public void obtainNewMatrix() {
        int[][] startMatrix = CustomMatrix.createMatrix(5);
        int[][] obtainedMatrix = CustomMatrix.obtainNewMatrix(startMatrix.length, startMatrix);
        Assert.assertNotEquals(startMatrix, obtainedMatrix);
    }

    @Test
    public void printZeroOrderMatrix() {
        boolean failedResult = CustomMatrix.printObtainedMatrix(0);
        Assert.assertFalse(failedResult);
    }

    @Test
    public void printObtainedMatrix() {
        boolean successfulResult = CustomMatrix.printObtainedMatrix(5);
        Assert.assertTrue(successfulResult);
    }

}