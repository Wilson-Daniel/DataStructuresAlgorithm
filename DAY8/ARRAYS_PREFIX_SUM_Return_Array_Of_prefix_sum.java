package DataStructuresAlgorithm.DAY8;

public class ARRAYS_PREFIX_SUM_Return_Array_Of_prefix_sum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] ans = prefix(arr);
        int[] ansSame = prefixInSameArray(arr);

        printArrays(ansSame);
    }
    public static int[] prefix(int[] arr){
        int n = arr.length;
        int[] prefix = new int[n];
        for(int i=0 ; i<n ; i++){
            if(i==0){
                prefix[i] = arr[i];
            }else{
                prefix[i] = prefix[i-1]+arr[i];
            }
        }
        return prefix;
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
