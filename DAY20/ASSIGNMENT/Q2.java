package DataStructuresAlgorithm.DAY20.ASSIGNMENT;

import java.util.ArrayList;

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
        System.out.println(triangle(arr,n-1));
    }
    public static int[] triangle(int[] arr,int idx){
        int[] ans = new int[idx];
        //Base Case
        if(idx == 0){
            return ans;
        }
        triangle(ans,idx-1);
        ans[idx-1] = arr[idx]+arr[idx-1];
        return ans;

    }
}
