package DataStructuresAlgorithm.DAY20;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class RECURSION_Return_all_indexes {
    /*
        Return al the index at which the element is present
        arr -> 4, 4, 3, 4
        target -> 4
        ans(arraylist) -> {0,1,3}
    */

    public static void main(String[] args) {
        int n = 4;
        int[] arr = {4,4,3,4};
        int x = 4;
        ArrayList<Integer> ans = returnallIndices(arr,n,0,x);
        System.out.println(ans);
    }

    public static ArrayList<Integer> returnallIndices(int[] arr,int n,int idx,int x){
        ArrayList<Integer> ans = new ArrayList<>();
        if(idx == n){
            return new ArrayList<>();
        }
        //self work
        if(arr[idx] == x){
            ans.add(idx); // ans ->{0}
        }
        //recursive work
        ArrayList<Integer> smallArr = returnallIndices(arr,n,idx+1,x); //smallAns = {1,3}
        ans.addAll(smallArr); // {0, 1, 3}
        return ans;
    }
}
