package DataStructuresAlgorithm.DAY__79;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class GREEDY_Activity_Selection {
    public static void main(String[] args) {
        int[] start = {1,3,0,5,8,5};
        int[] end = {2,4,6,7,9,9};
        //ens time basis sort
        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        //1st Activity
        maxAct = 1;
        ans.add(0);
        int lastidx = end[0];
        for(int i=1 ; i<start.length ; i++){
            if(lastidx<=start[i]){
                //System.out.println(lastidx +" "+ start[i+1]);
                maxAct++;
                ans.add(i);
                lastidx = end[i];
            }
        }
        System.out.println(ans);

        app2();
    }
    //if start and end arrays are not given
    public static void app2(){
        int[] start = {0,1,3,5,5,8};
        int[] end = {6,2,4,7,9,9};
        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        //sorting
        int[][] activities = new int[start.length][3];
        for(int i=0 ; i<start.length ; i++){
            activities[i][0]=i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }
        //                         owl vla o .....2 means column..column 2 ke basis pe sort krdo
        Arrays.sort(activities, Comparator.comparing(o -> o[2]));
        maxAct = 1;
        ans.add(activities[0][0]);
        int lastIdx = activities[0][2];
        for(int i=1 ; i<end.length ; i++){
            if(lastIdx <= activities[i][1]){
                maxAct++;
                ans.add(activities[i][0]);
                lastIdx = activities[i][2];
            }
        }
        System.out.println(ans);
    }
}
