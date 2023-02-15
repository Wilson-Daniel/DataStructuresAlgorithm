package DataStructuresAlgorithm.DAY28.Assignment;

public class Q6 {
//    for(int i=0 ; i<n ; i++){
//        int j = i;
//        while(j>0 && arr[j] < arr[j-1]){
//            int temp = arr[j];
//            arr[j] = arr[j-1];
//            arr[j-1] = temp;
//            j--;
//        }
//    }

    //RECURSIVE INSERTION SORT

    public static void insertionRsc(int[] arr,int idx){

        if(idx == arr.length){
            return;
        }
//        int j = idx;
//        while(j>0 && arr[j] < arr[j-1]){
//            int temp = arr[j];
//            arr[j] = arr[j-1];
//            arr[j-1] = temp;
//            j--;
//        }
        replace(arr,idx);
        insertionRsc(arr,idx+1);
    }
    public static void replace(int[] arr,int j){
        if(j<1){
            return;
        }
        if(arr[j]<arr[j-1]){
            int temp = arr[j];
            arr[j] = arr[j-1];
            arr[j-1] = temp;
        }
        replace(arr,j-1);
    }

    public static void main(String[] args) {
        int[] arr ={7, 10, 4, 3 ,20, 15, 2};
        insertionRsc(arr,1);
        for (int i : arr)
            System.out.print(i+" ");
    }
}
