package DataStructuresAlgorithm.DAY8;

public class ARRAY_SUFFIX_SUM_Find_Suffix_Sum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int[] ans = suffixSum(arr);
        printArrays(ans);
    }
    public static int[] suffixSum(int[] arr){
        int n= arr.length;
        int[] suffArr = new int[n];

        int sufInd = 0;
        int sum = 0;
        for(int i=n-1 ; i>=0 ; i--){
            if(i==n-1){
                suffArr[i] = arr[i];
            }else{
                suffArr[i] = suffArr[i+1]+arr[i];
            }
        }
        return suffArr;
    }
    public static void printArrays(int[] arr){
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
