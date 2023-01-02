package DataStructuresAlgorithm.DAY8;

public class ARRAY_PREFIX_SUM_Return_sum_of_values_within_range_LtoR {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int[] ans = prefixInSameArray(arr);
        printArrays(ans);
        //System.out.println();
        System.out.println(sumPrefixSum(ans,2,4));
    }
    public static int sumPrefixSum(int[] arr,int l,int r){
        return arr[r-1]-arr[l-2];
    }
    public static int[] prefixInSameArray(int[] arr){
        int n = arr.length;
        for(int i=1 ; i<n ; i++){
            arr[i] += arr[i-1];
        }
        return arr;
    }
    public static void printArrays(int[] arr){
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
