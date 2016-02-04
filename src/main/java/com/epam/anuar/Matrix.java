package com.epam.anuar;

/**
 * Created by Ануар on 04.02.2016.
 */
public class Matrix {
    int[][] values;
    int row;
    int column;


    Matrix(int rows, int columns){
        row = rows;
        column = columns;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                values[i][j] = (int) (Math.random() * 10);
            }
        }
    }



    public Matrix multiply(Matrix matrix2, Matrix matrixEnd) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < matrix2.column; j++) {
                for (int k = 0; k < column; k++) {
                    matrixEnd.values[i][j] += values[j][k] * matrix2.values[k][j];
                }
            }
        }
        return matrixEnd;
    }
}
