package DataStructuresAlgorithm.ARRAYS;

import java.util.Arrays;

public class ARRAYS_Chocolate_Distribution {
    public static void main(String[] args) {
        int[] chocolatePack = {12, 4, 7, 9, 2, 23, 25, 41, 30, 40, 28, 42, 30, 44, 48, 43, 50};
        int m=7;
        //edge case
//        System.out.println(maxDif);
//        if(m==0 || chocolatePack.length==0){
//            return -1;
//        }
//        if(m>chocolatePack.length){
//            return -1;
//        }
        int minDif = Integer.MAX_VALUE;
        Arrays.sort(chocolatePack);
        for(int i=0  ;i<=chocolatePack.length-m ; i++){
            int currDif = chocolatePack[i+m-1]-chocolatePack[i];
            if(currDif<minDif){
                minDif = currDif ;
            }
        }
        System.out.println(minDif);
    }
}
