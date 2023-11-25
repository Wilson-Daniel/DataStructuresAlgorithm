package DataStructuresAlgorithm.DYNAMIC_PROGRAMMING;

import java.util.Arrays;

public class DP_Climbing_Stairs {

    public static int climb(int n,int[] ways){
        if(n==0){
            return 1;
        }
        if(n<0){
            return 0;
        }
        if(ways[n]!=-1){
            return ways[n];
        }
        ways[n] = climb(n-1,ways) + climb(n-2,ways) +climb(n-3,ways);
        return ways[n];
    }


    public static void main(String[] args) {
        int n=5;
        int[] ways = new int[n+1];
        Arrays.fill(ways,-1);
        System.out.println(climb(n,ways));
    }
}
