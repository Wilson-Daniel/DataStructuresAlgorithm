package DataStructuresAlgorithm.DAY30;

public class BringAllZerosToEnd {
    public static void main(String[] args) {
        int[] arr = {0,0,2,31,0};
        bringZeros(arr);
        for(int i : arr){
            System.out.print(i+" ");
        }

    }
    //Through Insertion sort
    public static void bringZeros(int[] arr){
        int n = arr.length;
        for(int i=0 ; i<n ; i++){
            int j=i;
            while(j>0 && arr[j]!=0 && arr[j-1]==0){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
    }

}
