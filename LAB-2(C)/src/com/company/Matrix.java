package com.company;
public class Matrix {
    //public Object findNumberOfLocalMin;
    private int[][] matrix;

    public Matrix(int n, int m) {
        matrix = new int[n][m];
    }

    public int getVerticalSize() {
        return matrix.length;
    }

    public int getHorizontalSize() {
        return matrix[0].length;
    }

    public int getElement(int i, int j) {
        return matrix[i][j];
    }

    public void setElement(int i, int j, int value) {
        matrix[i][j] = value;
    }

    public String toString() {
        String s = "\nMatrix : " + matrix.length + "x" + matrix[0].length + "\n";
        for (int[] vector : matrix) {
            for (int value : vector) s += value + " ";
            s += "\n";
        }
        return s;
    }

}
class MatrixFactory {

    public static Matrix createRandomized(int n,int m) { Matrix matrix = new Matrix(n,m);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) { matrix.setElement(i, j, (-n)+(int)(Math.random()*2*n+1));
            }

        }

        return matrix;

    }

}
