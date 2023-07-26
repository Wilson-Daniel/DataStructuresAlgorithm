package DataStructuresAlgorithm.SORTING_ALGORITHMS;

public class SORTING_ALGORITHM_BubbleSort {
    public static void main(String[] args) {
        int[] arr = {8,4,5,6,9,2};
        bubble(arr);
        for(int e : arr){
            System.out.print(e+" ");
        }
    }
    public static void bubble(int[] arr){
        int n= arr.length;
        for(int turn=0 ; turn<n-1 ; turn++){
            for(int j=0 ; j<n-turn-1 ; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
