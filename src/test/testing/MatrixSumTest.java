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

}
