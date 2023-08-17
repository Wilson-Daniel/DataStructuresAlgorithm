package DataStructuresAlgorithm.GREEDY;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class GREEDY_Chocolate_Distribution_Problem {
    public static void main(String[] args) {
        Integer costVer[] = {2,1,3,1,4};
        Integer costHor[] = {4,1,2};
        int cost = chocolate(costVer,costHor);
        System.out.println(cost);
    }
    public static int chocolate(Integer[] ver,Integer[] hor){
        Arrays.sort(ver, Collections.reverseOrder());
        Arrays.sort(hor, Collections.reverseOrder());
        int h=0 , v=0;
        int hp=1, vp =1;
        int cost = 0;
        while(h<hor.length && v<ver.length){
            if(ver[v] <= hor[h]){
                cost+=(hor[h]*vp);
                hp++;
                h++;
            }else{
                cost+=(hor[v]*hp);
                vp++;
                v++;
            }
        }
        while(h<hor.length){
            cost+=(hor[h]*vp);
            hp++;
            h++;
        }
        while(v<ver.length){
            cost+=(ver[v]*hp);
            vp++;
            v++;
        }
        return cost;
    }
}
