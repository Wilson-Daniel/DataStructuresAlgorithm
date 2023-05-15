package DataStructuresAlgorithm.DAY__80;

import java.util.Arrays;
import java.util.Comparator;

public class GREEDY_Max_Length_Chain_Of_Pairs {
    public static void main(String[] args) {
        int[][] pairs = {{5,24},{39,60},{5,28},{27,40},{50,90},{100,130}};
        Arrays.sort(pairs, Comparator.comparing(o -> o[1]));

        int chainLen = 1;
        int chainEnd = pairs[0][1];
        for(int i=1 ; i<pairs.length ; i++){
            if(chainEnd<=pairs[i][0]){
                chainLen++;
                chainEnd = pairs[i][1];
            }
        }
        System.out.println(chainLen);
    }
}
