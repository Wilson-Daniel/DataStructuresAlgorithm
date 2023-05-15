package DataStructuresAlgorithm.DAY__80;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class GREEDY_Indian_Coins {
    public static void main(String[] args) {
        Integer notes[] = {1,2,5,10,20,50,100,500,1000};
        Arrays.sort(notes, Comparator.reverseOrder());
        int v = 1059;
        int count = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=0;i<notes.length;i++){
            if(v>=notes[i]){
                while(v>=notes[i]) {
                    count++;
                    ans.add(notes[i]);
                    v= v- notes[i];
                }
            }
        }
        System.out.println(count);
        System.out.println(ans);
    }
}
