package DataStructuresAlgorithm.ARRAYS;

import java.util.Arrays;

public class ARRAYS_Chocolate_Distribution {
    public static void main(String[] args) {
        int[] chocolatePack = {12, 4, 7, 9, 2, 23, 25, 41, 30, 40, 28, 42, 30, 44, 48, 43, 50};
        int k=7;
        Arrays.sort(chocolatePack);
        int maxDif = Integer.MAX_VALUE;
        for(int i=0 ; i<=chocolatePack.length-k ; i++){
            int diff = chocolatePack[i+k-1]-chocolatePack[i];
            maxDif = Math.min(maxDif,diff);
        }
        System.out.println(maxDif);
    }
}
