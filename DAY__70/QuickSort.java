package DataStructuresAlgorithm.DAY__70;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {3,2,4,5,2,7,8};
        quickSort(arr,0,arr.length-1);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    public static void quickSort(int[] arr,int si,int ei){
        if(si>=ei){
            return;
        }
        int pIdx = partition(arr,si,ei);
        quickSort(arr,si,pIdx-1);
        quickSort(arr,pIdx+1,ei);
    }
    public static int partition(int[] arr,int si,int ei){
        int piviot = arr[ei];
        int i= si-1;

        for(int j=si ; j<ei ; j++){
            if(arr[j]<=piviot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = piviot;
        arr[ei] = arr[i];
        arr[i]  = temp;
        return i;

    }

}
