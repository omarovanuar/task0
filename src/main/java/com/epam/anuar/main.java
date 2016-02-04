package com.epam.anuar;

/**
 * Created by Ануар on 04.02.2016.
 */
public class main {
    public static void main(String[] args) {
        Matrix matrix1 = new Matrix(3, 3);
        Matrix matrix2 = new Matrix(3, 3);
        Matrix matrixEnd = new Matrix(matrix1.row, matrix2.column);
        matrixEnd = matrix1.multiply(matrix2, matrixEnd);
        System.out.println(matrixEnd.values);

    }
}
