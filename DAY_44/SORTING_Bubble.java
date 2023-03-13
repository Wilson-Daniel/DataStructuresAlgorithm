package DataStructuresAlgorithm.DAY_44;

public class SORTING_Bubble {
    public static void main(String[] args) {
        int[] arr = {2,4,1,29,5,68,4};
        bubbleSort(arr);
        for (int i:arr){
            System.out.print(i+" ");
        }
    }
    public static void bubbleSort(int[] arr){
        int n = arr.length;
        for(int i=0 ; i<n ; i++){
            boolean flag = false;
            for(int j=0 ; j<n-i-1 ; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
            if (flag == false) {
                break;
            }
        }
    }
}
