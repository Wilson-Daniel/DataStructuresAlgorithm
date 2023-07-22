package DataStructuresAlgorithm.SORTING_ALGORITHMS;

public class SORTING_ALGORITHM_QuickSort {
    public static void quickSort(int arr[], int si,int ei){
        if(si>=ei){
            return;
        }
        int pIdx = partition(arr,si,ei);
        quickSort(arr,si,pIdx-1);
        quickSort(arr,pIdx+1,ei);
    }
    public static int partition(int[] arr,int si,int ei){
        int piviot = arr[ei];
        int i=si-1;
        for(int j=si ; j<ei ; j++){
            if(arr[j]<=piviot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[ei];
        arr[ei] = temp;
        return i;
    }

    public static void main(String[] args) {
        int[] arr = {5,6,3,7,8,9,2,3,4};
        quickSort(arr,0,arr.length-1);
        for(int e:arr){
            System.out.print(e+" ");
        }
    }

}
