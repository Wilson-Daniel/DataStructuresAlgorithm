package DataStructuresAlgorithm.DAY26;

public class Selection_Sort {
    public static void main(String[] args) {
        int[] arr = {7,5,6,4};
        selectionSort(arr,4);
        for(int i : arr){
            System.out.println(i);
        }

    }
    public static void selectionSort(int[] arr,int n){
        for(int i=0 ; i<n-1 ; i++){
            int min_ind = i;
            for(int j=i+1 ; j<n ; j++){
                if(arr[i] > arr[j]){
                    min_ind = j;
                }
                int temp = arr[i];
                arr[i]  = arr[min_ind];
                arr[min_ind] = temp;
            }
        }
    }
}
