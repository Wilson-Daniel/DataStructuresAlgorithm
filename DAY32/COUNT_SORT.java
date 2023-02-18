package DataStructuresAlgorithm.DAY32;

import java.util.Arrays;

public class COUNT_SORT {
    public static void countSort(int[] arr,int n){
        //finding the max element
        int max = Integer.MIN_VALUE;
        for(int i=0 ; i<n ; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        int[] count = new int[max+1];
        for (int i=0 ; i<n ; i++){
            count[arr[i]]++;
        }
        int k=0;
        for(int i=0 ; i< count.length ; i++){
            for(int j=0 ; j<count[i] ; j++){
                arr[k++] = i;
            }
        }
    }

    public static void main(String[] args) {
        int[] ans = {3,5,2,6,7,9};
        countSort(ans,6);
        for(int i:ans){
            System.out.print(i+" ");
        }
    }
}
