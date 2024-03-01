package javaAssignment5;

import java.util.Arrays;

public class ArrayRotation {
    public static void main(String[] args) {
        int []arr= {1,2,3,4,5};
        int rotation = 5;
        System.out.println(Arrays.toString(rotateArray(arr,rotation)));

    }
    static int[] rotateArray(int[] arr,int rotation){
        int index = 0;
        rotation = rotation % arr.length;
        int[]ans = new int[arr.length];
        for(int i = rotation;i<arr.length;i++){
            ans[index++] = arr[i];
        }
        for(int i = 0;i<rotation;i++){
            ans[index++] = arr[i];
        }
        return ans;
    }
}
