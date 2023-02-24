package DataStructuresAlgorithm.DAY35;

public class RevisionCountingSort {
    public static void countingSort(int[] arr,int n){
        int max = Integer.MIN_VALUE;
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i]>max){
                max =arr[i];
            }
        }
        int[] count = new int[max+1];
        //making count array
        for(int i=0 ; i<n ; i++){
            count[arr[i]]++;
        }
        //making count arrray prefix
        for(int i=1 ; i<count.length ; i++){
            count[i]+=count[i-1];
        }
        int[] output = new int[n];
        for(int i=n-1; i>0 ; i--){
            int idx = count[arr[i]]-1;
            output[idx] =arr[i];
            count[arr[i]]-=1;
        }
        for(int i:output){
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,5,6,7,3,2,6,78,4};
        countingSort(arr,9);
    }
}
