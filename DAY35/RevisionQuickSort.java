package DataStructuresAlgorithm.DAY35;


public class RevisionQuickSort {
    public static void quickSort(int[] arr, int s,int e){
        if(s<=e){
            return;
        }
        int pit = partition(arr,s,e);
        quickSort(arr,s,pit-1);
        quickSort(arr,pit+1,e);
    }
    public static int partition(int[] arr,int start,int end){
        int pivot = arr[start];
        int count = 0;
        for(int i=start+1 ; i<=end  ; i++){
            if(arr[i] <= pivot){
                count++;
            }
        }
        int pivotIdx = start+count;
        swap(arr,start,pivotIdx);

        int i = start,j=end;
        while(i<pivotIdx && j>pivotIdx){
            while(arr[i] <= pivot){
                i++;
            }
            while(arr[j]>=pivot){
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
    public static void swap(int[] arr,int x,int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {4, 1, 3, 5, 2};
        System.out.println("Array before sorting");
        displayArr(arr);
        quickSort(arr,0,arr.length-1);
        System.out.println();
        System.out.println("Array after ck sorting");
        displayArr(arr);
    }
    static void displayArr(int[] arr){
        for(int val : arr){
            System.out.print(val + " ");
        }
    }
}
