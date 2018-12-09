import helpers.MatrixHelper;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        int[][] matrix = MatrixHelper.createMatrix();

        if (MatrixHelper.isSquareMarix(matrix))
            System.out.println("This matrix is square ");

        Matrix targetMatrix = new Matrix(matrix);

        System.out.println("Elements with value bigger than index sum count: "
                + targetMatrix.countElementsWithValueBiggerThanIndexSum());

        System.out.println("Matrix: ");
        System.out.println(targetMatrix);

        int k1;
        int k2;

        k1 = MatrixHelper.getInputFromKeyboard("k1", targetMatrix.getRowCount(), 0);
        k2 = MatrixHelper.getInputFromKeyboard("k2", targetMatrix.getRowCount(), 0);

        targetMatrix = new Matrix(targetMatrix.swapRows(k1, k2));

        System.out.println("Matrix: ");
        System.out.println(targetMatrix);
    }
}
