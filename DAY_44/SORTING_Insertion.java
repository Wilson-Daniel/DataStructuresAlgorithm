package DataStructuresAlgorithm.DAY_44;

public class SORTING_Insertion {
    public static void main(String[] args) {
        int[] arr = {2,4,1,29,5,68,4};
        insertionSort(arr);
        for (int i:arr){
            System.out.print(i+" ");
        }
    }
    public static void insertionSort(int[] arr){
        int n= arr.length;
        for(int i=1 ; i<n ; i++){
            int j = i;
            while(j>0 && arr[j] < arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
    }
}
