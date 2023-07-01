package DataStructuresAlgorithm.ARRAYS;

public class ARRAYS_Print_Subarray_Max_Min_Sum {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10};
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0 ; i<arr.length ; i++){
            for(int j=i+1 ; j<arr.length ; j++){
                int sum = 0;
                for(int k=i ; k<=j ; k++){
                    sum+=arr[k];
                    max = Math.max(max,sum);
                    min = Math.min(min,sum);
                }
            }
        }
        System.out.println(min+" "+max);
    }
}
