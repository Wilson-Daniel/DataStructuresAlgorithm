package DataStructuresAlgorithm.DAY30.Assignment;

public class Q3 {
    /*
     Given an integer array and an integer k where k<size of array, We need to return the kth smallest element of the array.
     Input1:
        n = 5
        arr[] = [3,5,6,2,1]
        k=3
     Output1:
        3
     Input2:
        n = 4
        arr[] = [1,2,3,4]
        k=4
     Output2:
        4
     */
    public static int kthSmallest(int[] arr,int k)
    {
        //Your code here
        int r = arr.length;
        for(int i=0 ; i<r ; i++){
            for(int j=0 ; j<r-i-1 ; j++ ){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr[k-1];
    }

    public static void main(String[] args) {
        int[] arr ={7, 10, 4, 3 ,20, 15, 2};

        System.out.println(kthSmallest(arr,6));
        for(int i= 0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
