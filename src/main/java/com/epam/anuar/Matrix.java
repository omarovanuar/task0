package com.epam.anuar;

public class Matrix {
    int[][] values;
    int row = 3;
    int column = 3;

    Matrix(){
        values = new int[row][column];
    }

    Matrix(int rows, int columns){
        values = new int[rows][columns];
        row = rows;
        column = columns;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                values[i][j] = (int) (Math.random() *10);
            }
        }
    }



    public Matrix multiply(Matrix matrix1, Matrix matrix2, Matrix matrixEnd) {
        for (int i = 0; i < matrix1.row; i++) {
            for (int j = 0; j < matrix2.column; j++) {
                for (int k = 0; k < matrix1.column; k++) {
                    values[i][j] += matrix1.values[i][k] * matrix2.values[k][j];
                }
            }
        }
        return matrixEnd;
    }


    public void showMatrixValues(int rows, int columns) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(values[i][j] + " ");
            }
            System.out.println();
        }

    }
}
