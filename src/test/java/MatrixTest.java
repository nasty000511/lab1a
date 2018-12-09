
import helpers.MatrixHelper;
import org.junit.Test;

import java.util.Arrays;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;


public class MatrixTest {
    @Test
    public void testCountElements_NoElementsAreBiggerThanIndexCount_ReturnsZero() {
        int[][] matrix = {
                {0, 0},
                {0, 0}
        };

        Matrix targetMatrix = new Matrix(matrix);

        int count = targetMatrix.countElementsWithValueBiggerThanIndexSum();

        assertEquals(count, 0);
    }

    @Test
    public void testCountElements_SomeElementsAreBiggerThanIndexCount_ReturnsSomeElementsCount() {
        int[][] matrix = {
                {0, 2},
                {5, 0}
        };

        Matrix targetMatrix = new Matrix(matrix);

        int count = targetMatrix.countElementsWithValueBiggerThanIndexSum();

        assertEquals(count, 2);
    }

    @Test
    public void testCountElements_AllElementsAreBiggerThanIndexCount_ReturnsElementsCount() {
        int[][] matrix = {
                {5, 5},
                {5, 5}
        };

        Matrix targetMatrix = new Matrix(matrix);

        int count = targetMatrix.countElementsWithValueBiggerThanIndexSum();

        assertEquals(count, targetMatrix.getColumnCount() * targetMatrix.getRowCount());
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testSwapElements_K1IsOutOfBounds_ReturnsNull() {
        int[][] matrix = {
                {5, 5},
                {5, 5}
        };

        int k1 = -1;
        int k2 = 0;

        Matrix targetMatrix = new Matrix(matrix);
        targetMatrix.swapRows(k1, k2);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testSwapElements_K2IsOutOfBounds_ReturnsNull() {
        int[][] matrix = {
                {5, 5},
                {5, 5}
        };

        int k1 = 0;
        int k2 = -1;

        Matrix targetMatrix = new Matrix(matrix);
        targetMatrix.swapRows(k1, k2);
    }

    @Test()
    public void testSwapElements_K1AndK2IsInBoundsAndK1DoesNotEqualK2_ReturnsMatrixWithSwappedRow() {
        int[][] matrix = {
                {1, 2},
                {3, 4}
        };

        int[][] swappedMatrix = {
                {3, 4},
                {1, 2}
        };

        int k1 = 0;
        int k2 = 1;

        Matrix targetMatrix = new Matrix(matrix);

        assertTrue(Arrays.deepEquals(swappedMatrix, targetMatrix.swapRows(k1, k2)));
    }

    @Test
    public void testSwapElements_K1AndK2IsInBoundsAndK1EqualsK2_ReturnsMatrixWithSwappedRow() {
        int[][] matrix = {
                {1, 2},
                {3, 4}
        };

        int k1 = 0;
        int k2 = 0;

        Matrix targetMatrix = new Matrix(matrix);

        assertTrue(Arrays.deepEquals(matrix, targetMatrix.swapRows(k1, k2)));
    }

    @Test
    public void isSquareMarix_MatrixIsZero() {
        int[][] matrix = new int[0][0];

        boolean isSquare = MatrixHelper.isSquareMarix(matrix);

        assertTrue(isSquare == false);
    }

    @Test
    public void isSquareMarix_MatrixIsNotSquare() {
        int[][] matrix = new int[2][3];

        boolean isSquare = MatrixHelper.isSquareMarix(matrix);

        assertTrue(isSquare == false);
    }

    @Test
    public void isSquareMarix_MatrixIsSquare() {
        int[][] matrix = new int[3][3];

        boolean isSquare = MatrixHelper.isSquareMarix(matrix);

        assertTrue(isSquare == true);
    }
}
