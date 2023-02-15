package DataStructuresAlgorithm.DAY28.Assignment;

public class Q4 {
    /*
    Given an array of n elements, the task is to find the elements that are greater than half of
     */
    public static void GreaterElement(int[] arr,int n){
        for(int i=0 ; i<n ; i++){
            int j = i;
            while(j>0 && arr[j] < arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
        for(int i=n/2 ; i <n ; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr ={7, 10, 4, 3 ,20, 15, 2};
        GreaterElement(arr,7);
    }
}
