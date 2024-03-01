package javaAssignment5;

import java.util.Arrays;

public class SpiralMatrix {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(Arrays.deepToString(spiral(n)));
    }
    static int[][] spiral(int n){
        int i = 0;
        int j = 0;
        int count = 1;

        int top = 0;
        int bottom = n;
        int left = 0;
        int right = n;
        int[][] arr = new int[4][4];
        while(right >= left && bottom >= top && count < (n*n)){
            while(i < bottom){
                arr[i++][j] = count++;
            }
            bottom--;
            i--;
            j++;
            while(j < right){
                arr[i][j++] = count++;
            }
            right--;
            i--;
            j--;
            while(i >= top){
                arr[i--][j] = count++;
            }
            top++;
            i++;
            j--;
            while(j > left){
                arr[i][j--] = count++;
            }
            left++;
            i++;
            j++;
        }
        return arr;
    }
}
