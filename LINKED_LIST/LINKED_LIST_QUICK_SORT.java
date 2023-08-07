package DataStructuresAlgorithm.LINKED_LIST;

public class LINKED_LIST_QUICK_SORT {
    public static void quickSort(int arr[],int si,int ei){
        if(si>ei){
            return;
        }
        int pIdx = partition(arr,si,ei);
        quickSort(arr,si,pIdx-1);
        quickSort(arr,pIdx+1,ei);

    }
    public static int partition(int[] arr,int si,int ei){
        int pivot = arr[ei];
        int i=si-1;

        for(int j=si;j<ei ; j++){
            if(arr[j]<pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = arr[ei];
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }
    public static void main(String[] args) {
        int[] arr = {4,2,5,66,7,3,4,1};
        quickSort(arr,0,arr.length-1);
        for(int i:arr){
            System.out.println(i);
        }

    }
}
