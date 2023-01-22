package DataStructuresAlgorithm.DAY19.ASSIGNMENT;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Q2 {
    /*
    Q2 - Given an array of integers, print a sum triangle from it such that the first level(the bottom
        level in triangular fashion) has all array elements. From then, at each level, the number of
        elements is one less than the previous level and elements at the level is the sum of
        consecutive two elements in the previous level.

        Input1 : n = 5
                 arr = {1, 2, 3, 4, 5}
        Output1 : [48]
                  [20, 28]
                  [8, 12, 16]
                  [3, 5, 7, 9]
                  [1, 2, 3, 4, 5]
     */
    public static void main(String[] args) {
        int n = 5;
        int[] arr = {1, 2, 3, 4, 5};
        triangle(arr);
    }
    public static void triangle(int[] arr){

        //Base Case
        if(arr.length ==0){
            return ;
        }
        int[] ans = new int[arr.length-1];
        for(int i=0 ; i<arr.length-1 ; i++){
            ans[i] = arr[i] + arr[i+1];
        }

        triangle(ans);
        System.out.println(Arrays.toString(arr));

    }
}
