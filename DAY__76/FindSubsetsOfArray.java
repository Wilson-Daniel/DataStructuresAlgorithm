package DataStructuresAlgorithm.DAY__76;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class FindSubsetsOfArray {
//
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> AA = new ArrayList<>();
        ArrayList<Integer> A  = new ArrayList<>();
        A.add(2);
        A.add(4);

        AA = subsets(A);
        System.out.println(AA);
    }
    public static ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> A) {
//  int[] nums = A.stream().mapToInt(num -> num).toArray();
        ArrayList<Integer> ds = new ArrayList<Integer>();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        backtracking(A, 0, ds, ans);
        return ans;
    }
    public static void backtracking(ArrayList<Integer>nums, int index, ArrayList<Integer> ds, ArrayList<ArrayList<Integer>> ans) {
        if(index == nums.size()){
            //ans.add(new ArrayList<>(ds)); not here because it will not give the right sequence
            return;
        }
        ds.add(nums.get(index));//select current element
        ans.add(new ArrayList<>(ds));
        backtracking(nums, index + 1, ds, ans);
        ds.remove(ds.size() - 1);//do not select current element
        backtracking(nums, index + 1, ds, ans);

    }




}
