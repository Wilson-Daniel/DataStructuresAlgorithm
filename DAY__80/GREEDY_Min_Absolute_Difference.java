package DataStructuresAlgorithm.DAY__80;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GREEDY_Min_Absolute_Difference {
    public static void main(String[] args) {
        int[] a = {4,1,8,7};
        int[] b = {2,3,6,5};
        Arrays.sort(a);
        Arrays.sort(b);
        int absDiff = 0;
        for(int i=0 ; i<a.length ; i++){
            absDiff+=Math.abs(b[i]-a[i]);
        }
        System.out.println(absDiff);

        List<List<Integer>> ans = minimumAbsDifference(a);
        for(List i : ans){
            System.out.println(i);
        }
        System.out.println(ans);
    }
    public static List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> res = new ArrayList();
        //sort elements
        Arrays.sort(arr);
        //init our min difference value
        int min = Integer.MAX_VALUE;
        //start looping over array to find real min element. Each time we found smaller difference
        //we reset resulting list and start building it from scratch. If we found pair with the same
        //difference as min - add it to the resulting list
        for (int i = 0; i < arr.length - 1; i++) {
            int diff = arr[i + 1] - arr[i];
            if (diff < min) {
                min = diff;
                res.clear();
                res.add(Arrays.asList(arr[i], arr[i + 1]));
            } else if (diff == min) {
                res.add(Arrays.asList(arr[i], arr[i + 1]));
            }
        }
        return res;
    }
}
