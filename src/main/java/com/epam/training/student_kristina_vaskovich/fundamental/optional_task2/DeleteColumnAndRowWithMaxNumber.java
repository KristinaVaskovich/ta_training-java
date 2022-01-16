package com.epam.training.student_kristina_vaskovich.fundamental.optional_task2;

import java.util.*;

public class DeleteColumnAndRowWithMaxNumber {
    private Set<Integer> rowsToDelete, columnsToDelete;

    public static void main(String[] args) {
        DeleteColumnAndRowWithMaxNumber program = new DeleteColumnAndRowWithMaxNumber();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter the number of matrix elements : ");
        int number = scanner.nextInt();
        System.out.println("Please, enter the upper border of the digits : ");
        int border = scanner.nextInt();
        int[][] matrix = new int[number][number];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * border * 2) - border;
            }
        }
        System.out.println("Before:");
        program.prettyPrintMatrix(matrix);
        System.out.println();

        int[][] modifiedMatrix = program.deleteRowsAndColumns(matrix);
        System.out.println("After:");
        program.prettyPrintMatrix(modifiedMatrix);
    }

    private int[][] deleteRowsAndColumns(int[][] matrix) {
        int max = findMaxValueInMatrix(matrix);
        determineCoordinatesMax(matrix, max);

        System.out.println("Maximum: " + max);
        System.out.println("Row to delete: " + rowsToDelete);
        System.out.println("Column to delete: " + columnsToDelete);
        System.out.println();

        int[][] modifiedMatrix = deleteRows(matrix);
        modifiedMatrix = deleteColumns(modifiedMatrix);

        return modifiedMatrix;
    }

    private int findMaxValueInMatrix(int[][] matrix) {
        int max = matrix[0][0];
        for (int[] row : matrix) {
            for (int value : row) {
                if (value > max) {
                    max = value;
                }
            }
        }
        return max;
    }

    private void determineCoordinatesMax(int[][] matrix, int max) {
        rowsToDelete = new HashSet<>();
        columnsToDelete = new HashSet<>();

        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                if (matrix[r][c] == max) {
                    rowsToDelete.add(r);
                    columnsToDelete.add(c);
                }
            }
        }
    }

    private int[][] deleteRows(int[][] matrix) {
        int rowsToLeave = matrix.length - rowsToDelete.size();
        int[][] modifiedMatrix = new int[rowsToLeave][];
        int i = 0;
        for (int r = 0; r < matrix.length; r++) {
            if (!rowsToDelete.contains(r)) {
                modifiedMatrix[i] = matrix[r];
                i++;
            }
        }
        return modifiedMatrix;
    }

    private int[][] deleteColumns(int[][] matrix) {
        int columnsAlreadyDeleted = 0;
        for (int columnToDelete : columnsToDelete) {
            int[][] modifiedMatrix = new int[matrix.length][matrix[0].length - 1];
            for (int r = 0; r < matrix.length; r++) {
                int i = 0;
                for (int c = 0; c < matrix[r].length; c++) {
                    if (c != columnToDelete - columnsAlreadyDeleted) {
                        modifiedMatrix[r][i] = matrix[r][c];
                        i++;
                    }
                }
            }
            columnsAlreadyDeleted++;
            matrix = modifiedMatrix;
        }
        return matrix;
    }

    private void prettyPrintMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}
