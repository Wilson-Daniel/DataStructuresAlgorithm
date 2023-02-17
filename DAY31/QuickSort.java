package DataStructuresAlgorithm.DAY31;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {4, 1, 3, 5, 2};
        System.out.println("Array before sorting");
        display(arr);
        quickSort(arr,0,arr.length-1);
        System.out.println();
        System.out.println("Array after Quick sorting");
        display(arr);

    }

    public static void swap(int[] arr,int x,int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
    public static void quickSort(int[] arr,int st, int end){
        if(st>=end){
            return;
        }
        int pit = partition(arr,st,end);
        quickSort(arr,st,pit-1);
        quickSort(arr,pit+1,end);
    }
    public static int partition(int[] arr,int st ,int end){
        int pivot = arr[st];
        int cnt = 0;
        for(int i=st+1 ; i<=end ; i++){
            if(arr[i] <= pivot){
                cnt++;
            }
        }
        int pivotIdx = st+cnt;
        swap(arr,st,pivotIdx);
        int i=st,j=end;
        while(i<pivotIdx && j>pivotIdx){
            while(arr[i] <= pivot){
                i++;
            }
            while(arr[j]> pivot){
                j--;
            }
            if(i<pivotIdx && j>pivotIdx){
                swap(arr,i,j);
                i++;
                j--;
            }
        }
        return pivotIdx;
    }
    public static void display(int[] arr){
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }

}
