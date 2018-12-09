package helpers;

import java.security.SecureRandom;
import java.util.Scanner;

public class MatrixHelper {
    public static boolean isSquareMarix(int[][] matrix) {
        if (matrix == null) return false;

        if (matrix.length == 0) return false;

        return matrix.length == matrix[0].length;
    }

    public static void showMatrix(int[][] matrix) {
        System.out.println("Matrix: ");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++)
                System.out.print(String.valueOf(matrix[i] + " "));

            System.out.println();
        }
    }

    public static int[][] createMatrix() {
        int rowCount;
        int columnCount;

        String input;

        Scanner in = new Scanner(System.in);

        SecureRandom secureRandom = new SecureRandom();

        System.out.println("Create new matrix");

        while (true) {
            try {
                System.out.println("Enter row count: ");
                input = in.next();

                rowCount = Integer.parseInt(input);

                break;
            } catch (Exception ex) {
                System.out.println("Input error: " + ex.toString());
            }
        }

        while (true) {
            try {
                System.out.println("Enter column count: ");
                input = in.next();

                columnCount = Integer.parseInt(input);

                break;
            } catch (Exception ex) {
                System.out.println("Input error: " + ex.toString());
            }
        }

        int[][] matrix = new int[rowCount][columnCount];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = secureRandom.nextInt(100);
            }
        }

        return matrix;
    }

    public static int getInputFromKeyboard(String name, int max, int min) {
        String strInput;
        int input = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Enter " + name + " : ");
                strInput = scanner.next();

                input = Integer.parseInt(strInput);

                if (input > max || input < min)
                {
                    System.out.println("Out of range");
                    continue;
                }

                break;
            } catch (Exception ex) {
                System.out.println("Input error: " + ex.toString());
            }
        }

        return input;
    }
}

