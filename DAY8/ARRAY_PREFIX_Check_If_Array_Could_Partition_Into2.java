package DataStructuresAlgorithm.DAY8;

public class ARRAY_PREFIX_Check_If_Array_Could_Partition_Into2 {
    public static void main(String[] args) {
        int[] arr = {5,3,2,2,3,1};
        System.out.println(partition(arr));
    }
    public static boolean partition(int[] arr){
        int n=arr.length;

        //For Total Sum
        int totalSum = 0;
        for(int i=0 ; i<arr.length ; i++){
            totalSum+=arr[i];
        }

        int prefixSum = arr[0];
        int sufixSum = 0;
        for(int i=1 ; i<n ; i++){
            prefixSum +=arr[i];
            sufixSum = totalSum-prefixSum;
            if(prefixSum == sufixSum){
                return true;
            }
        }
        return false;
    }
    public static void printArrays(int[] arr){
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
