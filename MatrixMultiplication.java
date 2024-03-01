package javaAssignment5;

import java.util.Arrays;

public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] firstArray = {{1,2,3},{4,5,6}};
        int[][] secondArray = {{10,11},{20,21},{30,31}};
        System.out.println(Arrays.deepToString(multiplication(firstArray,secondArray)));
    }
    static int[][] multiplication(int[][]firstArray,int[][]secondArray){
        int [][]ans = new int[firstArray.length][secondArray[0].length];
        for (int i = 0; i < firstArray.length; i++) {
            for (int j = 0; j < secondArray[0].length; j++) {
                for (int k = 0; k < firstArray[0].length; k++) {
                    ans[i][j] += firstArray[i][k] * secondArray[k][j];
                }
            }
        }
        return ans;
    }
}
