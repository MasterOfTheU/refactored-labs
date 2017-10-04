package refactoring;

import java.util.*;

public class CustomMatrix {

    private static int[][] createMatrix(int matrixOrder) {
        int[][] squareMatrix = new int[matrixOrder][matrixOrder];

        Random random = new Random();
        System.out.println("The start square matrix is: ");
        for (int k = 0; k < matrixOrder; k++) {
            for (int l = 0; l < matrixOrder; l++) {
                squareMatrix[k][l] = random.nextInt();
                System.out.print(squareMatrix[k][l] + " ");
            }
            System.out.println();
        }
        return squareMatrix;
    }


    /**
     * @param matrixOrder - Gets the matrix order from user input.
     * @param squareMatrix - Generated matrix.
     * Obtains an integer square matrix of the input order in which the element is equal to one,
     * if the corresponding element of the output matrix is greater than an element, located in its line on the main diagonal,
     * otherwise is equal to zero.
     */
    private static int[][] obtainNewMatrix(int matrixOrder, int[][] squareMatrix) {
        int[][] newMatrix = new int[matrixOrder][matrixOrder];
        System.out.println("The obtained square matrix is: ");

        // Array for check of elements' value
        ArrayList<Integer> diagonal = new ArrayList<Integer>();
        for (int i = 0; i < matrixOrder; i++) {
            for (int j = 0; j < matrixOrder; j++) {
                if (i == j) {
                    diagonal.add(squareMatrix[i][j]);
                }
                newMatrix[i][j] = squareMatrix[i][j];

                if (i < j || i > j) {

                    for (int k = 0; k < diagonal.size(); k++) {

                        for (int l = 0; l < matrixOrder; l++) {
                            for (int m = 0; m < matrixOrder; m++) {
                                if (diagonal.get(k) <= squareMatrix[l][m]) {
                                    newMatrix[l][m] = 1;
                                } else if (diagonal.get(k) > squareMatrix[l][m]) {
                                    newMatrix[l][m] = 0;
                                }
                            }
                        }
                    }
                }
                System.out.print(newMatrix[i][j] + "  ");
            }
            System.out.println();
        }
        return newMatrix;
    }

    static boolean printObtainedMatrix(int matrixOrder) {
        obtainNewMatrix(matrixOrder, createMatrix(matrixOrder));
        if (matrixOrder != 0) {
            return true;
        }
        else return false;
    }
}