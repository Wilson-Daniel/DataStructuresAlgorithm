package DataStructuresAlgorithm.BACKTRACKING;

import java.util.ArrayList;

public class TRACK {

    public static void sub(ArrayList<Integer> A, ArrayList<Integer> arr, int idx,ArrayList<ArrayList<Integer>> ans){
        if(idx==A.size()-1){
            arr.add(A.get(idx));
            ans.add(arr);
            return;
        }
        arr.add(A.get(idx));
        sub(A,arr,idx+1,ans);

        sub(A,arr,idx+1,ans);

    }

    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
        A.add(1);
        A.add(2);
        A.add(3);
        ArrayList<ArrayList<Integer>> Ans = new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        sub(A,arr,0,Ans);
        for(ArrayList<Integer> a : Ans){
            System.out.println(a);
        }

    }
}
