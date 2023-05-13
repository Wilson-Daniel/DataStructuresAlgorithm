package DataStructuresAlgorithm.DAY__80;

import java.util.Arrays;
import java.util.Comparator;

public class GREEDY_Max_Length_Chain_Of_Pairs {
    public static void main(String[] args) {
        int[][] pairs = {{5,24},{39,60},{5,28},{27,40},{50,90}};
        Arrays.sort(pairs, Comparator.comparing(o -> o[1]));
        
    }
}
