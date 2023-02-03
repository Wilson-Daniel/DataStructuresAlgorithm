package DataStructuresAlgorithm.DAY25;

public class BubbleSortAlgorithm {
    public static void bubbleSort(int[] arr){
        int n = arr.length;
        for(int i=0 ; i<n-1 ; i++){
            // n-1 iterations
            boolean flag = false; //has any swap happened, optimizing the code for nearly sorted array 
            for(int j=0 ; j<n-i-1 ; j++){
                /*
                last i element are already at correct sorted position,
                so no need to check them
                 */
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
            if(flag == false){ // have any swap happened
                return;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1,0};
        bubbleSort(arr);
        for(int i:arr){
            System.out.print(arr[i]+" ");
        }
    }
}
