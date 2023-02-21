package DataStructuresAlgorithm.DAY34;

public class SortingQuestion1 {
    /*
    Given an array where all its elements are sorted in increasing order except two swapped elements, sort it in
    linear time. Assume there are no duplicates in array
       Input - A[] = {3,8,6,7,5,9,10}
       Output - A[] = {3,5,6,7,8,9,10}
     */
    public static void sort(int[] arr){
        int n=arr.length;
        if(n==1){
            return;
        }
        int x = -1;
        int y=-1;
        for(int i=0 ; i<n-1 ; i++){
            if(arr[i]>arr[i+1]){
                if(x==-1){ //first conflict
                    x = i;
                    y = i+1;
                }else{ // 2nd conflict
                    y = i+1;
                }
            }
        }
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {10,4,5,6,7,8,9,3};
        int[] arr1 = {2,1};
        int[] arr2 = {2};
        sort(arr2);
        for(int i : arr2){
            System.out.print(i+" ");
        }
    }
}
