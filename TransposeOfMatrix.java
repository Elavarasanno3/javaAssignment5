package javaAssignment5;

import java.util.Arrays;

public class TransposeOfMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(Arrays.deepToString(transpose(arr)));
    }
    static int[][] transpose(int [][]arr){
        for(int i = 0;i<arr.length;i++){
            for(int j = i;j<arr.length;j++){
                int temp = arr[j][i];
                arr[j][i] = arr[i][j];
                arr[i][j] = temp;
            }
        }
        return arr;
    }
}
