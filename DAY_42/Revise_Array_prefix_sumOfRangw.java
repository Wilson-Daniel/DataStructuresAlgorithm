package DataStructuresAlgorithm.DAY_42;

public class Revise_Array_prefix_sumOfRangw {
    public static void main(String[] args) {
        int[] arr = {2,3,4,1,5,7,3,8,9};
        int[] ans = rangeSum(arr);
        int l=2;
        int r =5;
        System.out.println(ans[r-1]-ans[l-2]);
    }
    public static int[] rangeSum(int[] arr){
        for(int i=1 ;i<arr.length ; i++){
            arr[i] += arr[i-1];
        }

        return arr;
    }
}
